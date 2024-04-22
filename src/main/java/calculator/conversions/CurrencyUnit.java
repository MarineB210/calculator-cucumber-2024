package calculator.conversions;

/**
 * The CurrencyUnit enum represents different units of currency.
 */
public enum CurrencyUnit implements Unit {
    EUR(1.0, 0, true, "Euro"),
    USD(1.06, 0, false, "United States Dollar"),
    JPY(164.57, 0, false, "Japanese Yen"),
    GBP(0.85, 0, false, "British Pound Sterling"),
    AUD(1.66, 0, false, "Australian Dollar"),
    CAD(1.47, 0, false, "Canadian Dollar"),
    CHF(0.97, 0, false, "Swiss Franc"),
    CNY(7.7, 0, false, "Chinese Yuan"),
    BEF(40.3399, 0, false, "Belgian Franc");

    /**
     * The conversion factor used to convert a value in this unit to a value in euros.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of the euros.
     */
    private final boolean isPowerOfTen;

    /**
     * The offset used when the double input value is multiplied by a power of ten.
     */
    private final int offset;

    /**
     * The name of the unit.
     */
    private final String name;

    /**
     * Constructs an CurrencyUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in euros.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of the euros.
     */
    CurrencyUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
        this.conversionFactor = conversionFactor;
        this.isPowerOfTen = isPowerOfTen;
        this.offset = offset;
        this.name = name;
    }

    /**
     * Returns the conversion factor.
     *
     * @return The conversion factor.
     */
    public double getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Returns whether the unit is a power of ten of the euros.
     *
     * @return True if the unit is a power of ten of the euros, false otherwise.
     */
    public boolean isPowerOfTen() {
        return isPowerOfTen;
    }

    /**
     * Returns the offset used when the input value has to be multiplied by a power of ten.
     *
     * @return The offset.
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Returns the name of the unit.
     *
     * @return The name of the unit.
     */
    public String getName() {
        return name;
    }
}