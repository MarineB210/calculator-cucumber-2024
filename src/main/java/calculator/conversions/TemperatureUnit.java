package calculator.conversions;

/**
 * The TemperatureUnit enum represents different units of temperature measurement.
 */
public enum TemperatureUnit implements Unit {
    CELSIUS ("Celsius"),
    FAHRENHEIT ("Fahrenheit"),
    KELVIN ("Kelvin");

    /**
     * The name of the unit.
     */
    private final String name;

    /**
     * Constructs an TemperatureUnit with the given name.
     *
     * @param name The name of the unit.
     */
    TemperatureUnit(String name) {
        this.name = name;
    }

    /**
     * Method mandatory to implement the interface Unit.
     *
     * @return A default value.
     */
    public double getConversionFactor() {
        return 0;
    }

    /**
     * Method mandatory to implement the interface Unit.
     *
     * @return A default value.
     */
    public boolean isPowerOfTen() {
        return false;
    }

    /**
     * Method mandatory to implement the interface Unit.
     *
     * @return A default value.
     */
    public int getOffset() {
        return 0;
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
