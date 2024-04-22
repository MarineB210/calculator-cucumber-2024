package calculator.conversions;

/**
 * The AreaUnit enum represents different units of area measurement.
 */
public enum AreaUnit implements Unit {
    SQUAREMETER(1.0, 0, true, "Square Meter"),
    SQUAREKILOMETER(0.000001, 6, true, "Square Kilometer"),
    SQUARECENTIMETER(10000.0, -4, true, "Square Centimeter"),
    SQUAREMILLIMETER(1000000.0, -6, true, "Square Millimeter"),
    HECTARE(0.0001, 4, true, "Hectare"),
    SQUAREFOOT(10.7639, 0, false, "Square Foot"),
    SQUAREINCH(1550.0, 0, false, "Square Inch"),
    ACRE(0.000247105, 0, false, "Acre"),
    ARE(0.01, 2, true, "Are"),
    SQUAREMILE(0.000000386102, 0, false, "Square Mile"),
    SQUAREYARD(1.19599, 0, false, "Square Yard");

    /**
     * The conversion factor used to convert a value in this unit to a value in square meters.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of square meters.
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
     * Constructs an AreaUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in square meters.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of square meters.
     */
    AreaUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of square meters.
     *
     * @return True if the unit is a power of ten of square meters, false otherwise.
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
