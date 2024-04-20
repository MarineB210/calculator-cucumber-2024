package calculator.conversions;

/**
 * The LengthUnit enum represents different units of length measurement.
 */
public enum LengthUnit implements Unit {
    METER(1.0, 0, true, "Meter"),
    CENTIMETER(100.0, -2, true, "Centimeter"),
    KILOMETER(0.001, 3, true, "Kilometer"),
    MILLIMETER(1000.0, -3, true, "Millimeter"),
    INCH(39.3701, 0, false, "Inch"),
    FOOT(3.28084, 0, false, "Foot"),
    YARD(1.09361, 0, false, "Yard"),
    MILE(0.000621371, 0, false, "Mile"),
    NAUTICAL_MILE(0.000539957, 0, false, "Nautical Mile"),
    DECAMETER(0.1, 1, true, "Decameter"),
    HECTOMETER(0.01, 2, true, "Hectometer"),
    DECIMETER(10.0, -1, true, "Decimeter"),;

    /**
     * The conversion factor used to convert a value in this unit to a value in meters.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of meters.
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
     * Constructs an LengthUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in meters.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of meters.
     */
    LengthUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of meters.
     *
     * @return True if the unit is a power of ten of meters, false otherwise.
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
