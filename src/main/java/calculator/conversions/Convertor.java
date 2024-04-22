package calculator.conversions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Convertor class is responsible for converting values between different units of measurement.
 * It handles both temperature conversions, which require a different formula, and other unit conversions.
 */
public class Convertor {
    /**
     * The result of the conversion, stored as a BigDecimal for precision.
     */
    private final BigDecimal result;

    /**
     * Constructs a Convertor for units of measurement other than temperature.
     * The conversion is done either by multiplying the input value by the ratio of the conversion factors of the two
     * units or, if both units have power of ten conversion factors, by shifting the decimal point of the input value.
     *
     * @param value The value to be converted.
     * @param fromUnit The unit of the input value.
     * @param toUnit The unit to which the value is to be converted.
     */
    public Convertor(double value, Unit fromUnit, Unit toUnit) {
        BigDecimal inputValue = BigDecimal.valueOf(value);

        if (fromUnit.isPowerOfTen() && toUnit.isPowerOfTen()) {
            String valueStr = getString(value, fromUnit.getOffset() - toUnit.getOffset());
            this.result = new BigDecimal(valueStr);
        } else {
            BigDecimal fromUnitFactor = BigDecimal.valueOf(fromUnit.getConversionFactor());
            BigDecimal toUnitFactor = BigDecimal.valueOf(toUnit.getConversionFactor());
            this.result = inputValue.multiply(toUnitFactor).divide(fromUnitFactor, 10, RoundingMode.HALF_UP);
        }
    }

    /**
     * Constructs a Convertor for temperature units.
     * The conversion is done using the formulas for converting between Celsius, Fahrenheit, and Kelvin.
     *
     * @param value The temperature value to be converted.
     * @param fromUnit The unit of the input temperature value.
     * @param toUnit The unit to which the temperature value is to be converted.
     */
    public Convertor(double value, TemperatureUnit fromUnit, TemperatureUnit toUnit) {
        BigDecimal temp = BigDecimal.valueOf(value);
        switch (fromUnit) {
            case FAHRENHEIT:
                temp = temp.subtract(BigDecimal.valueOf(32)).multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(9), 10, RoundingMode.HALF_UP);
                break;
            case KELVIN:
                temp = temp.subtract(BigDecimal.valueOf(273.15));
                break;
            default:
                break;
        }
        switch (toUnit) {
            case FAHRENHEIT:
                result = temp.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5), 10, RoundingMode.HALF_UP).add(BigDecimal.valueOf(32));
                break;
            case KELVIN:
                result = temp.add(BigDecimal.valueOf(273.15));
                break;
            default:
                result = temp;
                break;
        }
    }

    /**
     * Adjusts the decimal point of the input value based on the difference in powers of ten between the two units.
     * If the power difference is positive, the decimal point is moved to the right.
     * If the power difference is negative, the decimal point is moved to the left.
     *
     * @param value The value to be adjusted.
     * @param powerDifference The difference in powers of ten between the two units.
     * @return The adjusted value as a string.
     */
    private static String getString(double value, int powerDifference) {
        String valueStr = String.valueOf(value);

        while (powerDifference != 0){
            int decimalIndex = valueStr.indexOf(".");
            if (powerDifference > 0) {
                valueStr = valueStr.substring(0, decimalIndex) + valueStr.charAt(decimalIndex + 1) + "." + valueStr.substring(decimalIndex + 2);
                if (valueStr.indexOf(".") == valueStr.length() - 1) {
                    valueStr += "0";
                }
                powerDifference--;
            } else {
                valueStr = valueStr.substring(0, decimalIndex - 1) + "." + valueStr.charAt(decimalIndex - 1) + valueStr.substring(decimalIndex + 1);
                if (decimalIndex == 1) {
                    valueStr = "0" + valueStr;
                }
                powerDifference++;
            }
        }
        return valueStr;
    }

    /**
     * Returns the integer part of the result of the conversion.
     *
     * @return The integer part of the result as a string.
     */
    public String getIntegerPart() {
        return result.toBigInteger().toString();
    }

    /**
     * Returns the decimal part of the result of the conversion.
     * The decimal part is rounded up if a digit after the first two decimal digits is 9 and
     * rounded down if there are at least three zeros after a non-zero digit.
     *
     * @return The decimal part of the result as a string.
     */
    public String getDecimalPart() {
        BigInteger integerPart = result.toBigInteger();
        BigDecimal decimalPart = result.subtract(new BigDecimal(integerPart)).setScale(10, RoundingMode.HALF_UP);
        if(decimalPart.compareTo(BigDecimal.ZERO) == 0) {
            return "0";
        }
        String decimalPartStr = decimalPart.stripTrailingZeros().toPlainString().substring(2);
        int indexOfNine = decimalPartStr.indexOf("9", 2) - 2; // index for "9" not found is (-1-2)
        if (indexOfNine != -3) {
            decimalPart = decimalPart.setScale(indexOfNine + 2, RoundingMode.UP);
        }

        decimalPartStr = decimalPart.stripTrailingZeros().toPlainString().substring(2);
        Pattern pattern = Pattern.compile("(\\d*?[1-9]\\d*?000).*");
        Matcher matcher = pattern.matcher(decimalPartStr);
        if (matcher.find()) {
            decimalPartStr = matcher.group(1);
            decimalPartStr = decimalPartStr.substring(0, decimalPartStr.length() - 3);
        }
        return decimalPartStr;
    }
}
