package calculator.conversions;

/**
 * The VolumeUnit enum represents different units of volume measurement.
 */
public enum VolumeUnit implements Unit {
    CUBICMETER(1.0, 0, true, "Cubic Meter"),
    LITER(1000.0, -3, true, "Liter"),
    MILLILITER(1000000.0, -6, true, "Milliliter"),
    GALLON(264.172, 0, false, "Gallon"),
    CUBICFOOT(35.3147, 0, false, "Cubic Foot"),
    CUBICYARD(1.30795, 0, false, "Cubic Yard"),
    BARREL(6.28981, 0, false, "Barrel"),
    CUBICINCH(61023.7, 0, false, "Cubic Inch"),
    CUBICCENTIMETER(1000000.0, -6, true, "Cubic Centimeter"),
    CENTILITER(100000.0, -5, true, "Centiliter"),
    DECILITER(10000.0, -4, true, "Deciliter"),
    DECALITER(100.0, -2, true, "Decaliter"),
    HECTOLITER(10.0, -1, true, "Hectoliter"),
    KILOLITER(1.0, 0, true, "Kiloliter"),;

    /**
     * The conversion factor used to convert a value in this unit to a value in cubic meters.
     */
    private final double conversionFactor;

    /**
     * Indicates whether the conversion factor is a power of ten of cubic meters.
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
     * Constructs an VolumeUnit with the given conversion factor, offset, and power of ten indicator.
     *
     * @param conversionFactor The conversion factor used to convert a value in this unit to a value in cubic meters.
     * @param offset The offset used when the input value has to be multiplied by a power of ten.
     * @param isPowerOfTen Indicates whether the unit is a power of ten of cubic meters.
     */
    VolumeUnit(double conversionFactor, int offset, boolean isPowerOfTen, String name) {
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
     * Returns whether the unit is a power of ten of cubic meters.
     *
     * @return True if the unit is a power of ten of cubic meters, false otherwise.
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