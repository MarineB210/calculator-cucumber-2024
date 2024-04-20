package calculator.conversions;

/**
 * The UnitType enum represents different types of units of measurement.
 * Each enum constant corresponds to a specific category of units having its specific enum.
 */
public enum UnitType {
    LENGTH ("Length"),
    VOLUME ("Volume"),
    TIME ("Time"),
    AREA ("Area"),
    SPEED ("Speed"),
    PRESSURE ("Pressure"),
    CURRENCY ("Currency"),
    ENERGY ("Energy"),
    POWER ("Power"),
    MASS ("Mass and Weight"),
    TEMPERATURE ("Temperature");

    /**
     * The name of the unit type.
     */
    private final String name;

    /**
     * Constructs a new UnitType with the specified name.
     *
     * @param name the name of the unit type
     */
    UnitType(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this unit type.
     *
     * @return the name of this unit type
     */
    public String getName() {
        return name;
    }
}
