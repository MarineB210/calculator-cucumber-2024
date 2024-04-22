package calculator.conversions;

/**
 * The MassAndWeightUnit enum represents different units of mass and weight measurement.
 */
public enum MassAndWeightUnit implements Unit {
    GRAM(1.0, 0, true, "Gram"),
    KILOGRAM(0.001, 3, true, "Kilogram"),
    MILLIGRAM(1000.0, -3, true, "Milligram"),
    POUND(0.00220462, 0, false, "Pound"),
    OUNCE(0.035274, 0, false, "Ounce"),
    NEWTON(0.00981, 0, false, "Newton"),
    POUND_FORCE(0.0022053763, 0, false, "Pound-force"),;

    /**
     * The conversion factor used to convert a value in this unit to a value in grams.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of grams.
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
     * Constructs an MassAndWeightUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in grams.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of grams.
     */
    MassAndWeightUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of grams.
     *
     * @return True if the unit is a power of ten of grams, false otherwise.
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
