package calculator.conversions;

/**
 * The PowerUnit enum represents different units of power measurement.
 */
public enum PowerUnit implements Unit {
    WATT(1.0, 0, true, "Watt"),
    KILOWATT(0.001, 3, true, "Kilowatt"),
    MILLIWATT(1000.0, -3, true, "Milliwatt"),
    HORSEPOWER(0.00134102, 0, false, "Horsepower"),
    FOOT_POUND_PER_MINUTE(44.2537, 0, false, "Foot-pound per minute"),
    BTU_PER_HOUR(3.412142, 0, false, "BTU per hour"),
    TON_OF_REFRIGERATION(0.000284345, 0, false, "Ton of refrigeration");

    /**
     * The conversion factor used to convert a value in this unit to a value in watts.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of watts.
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
     * Constructs an PowerUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in watts.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of watts.
     */
    PowerUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of watts.
     *
     * @return True if the unit is a power of ten of watts, false otherwise.
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
