package calculator;

import calculator.conversions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

/**
 * The ConversionsSteps class is responsible for defining the steps of the conversion process.
 * It uses the Cucumber testing framework to define the steps in a behavior-driven development (BDD) style.
 * The steps include setting the input value and unit type, performing the conversion, and verifying the result.
 */
public class ConversionsSteps {
    private double inputValue;
    private UnitType unitType;
    private Convertor convertor;

    @Given("the number {double} and the type of unit {string}")
    public void the_numbers(double num1, String unitType) {
        this.inputValue = num1;
        this.unitType = UnitType.valueOf(unitType);
    }

    @When("I convert it from {string} to {string}")
    public void i_convert_it(String fromUnit, String toUnit) {
        switch (unitType) {
            case LENGTH:
                convertor = new Convertor(inputValue, LengthUnit.valueOf(fromUnit), LengthUnit.valueOf(toUnit));
                break;
            case TIME:
                convertor = new Convertor(inputValue, TimeUnit.valueOf(fromUnit), TimeUnit.valueOf(toUnit));
                break;
            case AREA:
                convertor = new Convertor(inputValue, AreaUnit.valueOf(fromUnit), AreaUnit.valueOf(toUnit));
                break;
            case MASS:
                convertor = new Convertor(inputValue, MassAndWeightUnit.valueOf(fromUnit), MassAndWeightUnit.valueOf(toUnit));
                break;
            case POWER:
                convertor = new Convertor(inputValue, PowerUnit.valueOf(fromUnit), PowerUnit.valueOf(toUnit));
                break;
            case PRESSURE:
                convertor = new Convertor(inputValue, PressureUnit.valueOf(fromUnit), PressureUnit.valueOf(toUnit));
                break;
            case VOLUME:
                convertor = new Convertor(inputValue, VolumeUnit.valueOf(fromUnit), VolumeUnit.valueOf(toUnit));
                break;
            case SPEED:
                convertor = new Convertor(inputValue, SpeedUnit.valueOf(fromUnit), SpeedUnit.valueOf(toUnit));
                break;
            case ENERGY:
                convertor = new Convertor(inputValue, EnergyUnit.valueOf(fromUnit), EnergyUnit.valueOf(toUnit));
                break;
            case CURRENCY:
                convertor = new Convertor(inputValue, CurrencyUnit.valueOf(fromUnit), CurrencyUnit.valueOf(toUnit));
                break;
            case TEMPERATURE:
                convertor = new Convertor(inputValue, TemperatureUnit.valueOf(fromUnit), TemperatureUnit.valueOf(toUnit));
                break;
            default:
                throw new IllegalArgumentException("Unsupported unit type: " + unitType);
        }
    }

    @Then("I should get the correct number {string}.{string}")
    public void i_should_get_the_correct_notation_for(String integerPart, String decimalPart) {
        Assertions.assertEquals(integerPart, convertor.getIntegerPart());
        Assertions.assertEquals(decimalPart, convertor.getDecimalPart());
    }
}
