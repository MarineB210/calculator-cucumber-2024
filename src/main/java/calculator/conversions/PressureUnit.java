package calculator.conversions;

/**
 * The PressureUnit enum represents different units of pressure measurement.
 */
public enum PressureUnit implements Unit {
    PASCAL(1.0, 0, true, "Pascal"),
    KILOPASCAL(0.001, 3, true, "Kilopascal"),
    MEGAPASCAL(0.000001, 6, true, "Megapascal"),
    BAR(0.00001, 5, true, "Bar"),
    MILLIBAR(0.01, 2, true, "Millibar"),
    ATMOSPHERE(0.0000098692, 0, false, "Atmosphere"),
    TORR(0.00750062, 0, false, "Torr"),
    PSI(0.000145038, 0, false, "Pound per Square Inch");

    /**
     * The conversion factor used to convert a value in this unit to a value in pascals.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of pascals.
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
     * Constructs an PressureUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in pascals.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of pascals.
     */
    PressureUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of pascals.
     *
     * @return True if the unit is a power of ten of pascals, false otherwise.
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