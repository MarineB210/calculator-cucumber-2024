package calculator.conversions;

/**
 * The Unit interface represents a unit type of measurement.
 * It provides methods to get the conversion factor, check if the unit is a power of ten of the reference unit
 * and get the offset used if it is indeed a power of ten.
 */
public interface Unit {
    /**
     * Returns the conversion factor.
     *
     * @return The conversion factor.
     */
    double getConversionFactor();
    /**
     * Returns whether the unit is a power of ten of the reference unit.
     *
     * @return True if the unit is a power of ten of the reference unit, false otherwise.
     */
    boolean isPowerOfTen();
    /**
     * Returns the offset used when the input value has to be multiplied by a power of ten.
     *
     * @return The offset.
     */
    int getOffset();
    /**
     * Returns the name of the unit.
     *
     * @return The name of the unit.
     */
    String getName();
}
