package calculator.conversions;

/**
 * The EnergyUnit enum represents different units of energy measurement.
 */
public enum EnergyUnit implements Unit {
    JOULE(1.0, 0, true, "Joule"),
    KILOJOULE(0.001, 3, true, "Kilojoule"),
    CALORIE(0.239006, 0, false, "Calorie"),
    KILOCALORIE(0.000239006, 0, false, "Kilocalorie"),
    WATTHOUR(0.000277778, 0, false, "Watt-hour"),
    KILOWATTHOUR(0.000000277778, 0, false, "Kilowatt-hour"),
    BRITISHTHERMALUNIT(0.000947817, 0, false, "British Thermal Unit"),;

    /**
     * The conversion factor used to convert a value in this unit to a value in joules.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of joules.
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
     * Constructs an EnergyUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in joules.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of joules.
     */
    EnergyUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of joules.
     *
     * @return True if the unit is a power of ten of joules, false otherwise.
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
