package calculator.conversions;

/**
 * The SpeedUnit enum represents different units of speed measurement.
 */
public enum SpeedUnit implements Unit {
    METERS_PER_SECOND(1.0, 0, true, "Meter per second"),
    KILOMETERS_PER_HOUR(3.6, 0, false, "Kilometer per hour"),
    MILES_PER_HOUR(2.23694, 0, false, "Mile per hour"),
    FEET_PER_SECOND(3.28084, 0, false, "Foot per second"),
    KNOT(1.94384, 0, false, "Knot");

    /**
     * The conversion factor used to convert a value in this unit to a value in meters per second.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of meters per second.
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
     * Constructs an SpeedUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in meters per second.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of meters per second.
     */
    SpeedUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of meters per second.
     *
     * @return True if the unit is a power of ten of meters per second, false otherwise.
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