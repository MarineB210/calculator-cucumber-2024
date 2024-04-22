package calculator.conversions;

/**
 * The TimeUnit enum represents different units of time measurement.
 */
public enum TimeUnit implements Unit {
    SECOND(1.0, 0, true, "Second"),
    MINUTE(0.0166667, 0, false, "Minute"),
    HOUR(0.000277778, 0, false, "Hour"),
    DAY(0.000011574, 0, false, "Day"),
    MILLISECOND(1000.0, -3, true, "Millisecond"),
    CENTISECOND(100.0, -2, true, "Centisecond"),
    DECISECOND(10.0, -1, true, "Decisecond"),
    DECASECOND(0.1, 1, true, "Decasecond"),
    HECTOSECOND(0.01, 2, true, "Hectosecond"),
    KILOSECOND(0.001, 3, true, "Kilosecond");

    /**
     * The conversion factor used to convert a value in this unit to a value in seconds.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of seconds.
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
     * Constructs an TimeUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in seconds.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of seconds.
     */
    TimeUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of seconds.
     *
     * @return True if the unit is a power of ten of seconds, false otherwise.
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
