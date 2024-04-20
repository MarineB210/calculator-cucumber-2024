package calculator.bool;

import calculator.BooleanParser;
import calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanParserSteps {

    private Calculator c;
    private BooleanParser inputParser;
    @Given("I have a bool {string}")
    public void givenIHaveABool(String s) {
        c = new Calculator();
        inputParser = new BooleanParser(s, c);
    }
    @Given("I have a boolean expression {string}")
    public void givenIHaveABooleanExpression(String s) {
        c = new Calculator();
        inputParser = new BooleanParser(s, c);
    }

    @Then("I should get a bool {int}")
    public void thenIShouldGetABool(int number) {
        assertEquals(number, inputParser.evaluate().getValue());
    }
    @Then("the resulting boolean is actually {int}")
    public void thenTheResultingBooleanIsActually(int result) {
        assertEquals(result, inputParser.evaluate().getValue());
    }
}
