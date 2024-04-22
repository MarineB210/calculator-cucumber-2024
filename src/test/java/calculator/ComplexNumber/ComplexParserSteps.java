package calculator.ComplexNumber;


import static org.junit.jupiter.api.Assertions.*;


import calculator.Calculator;
import calculator.ComplexNumberParser;
import calculator.Parser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Test;

public class ComplexParserSteps {

    private Calculator c;
    private ComplexNumberParser inputParser;

    @Given("I have a complex number {string}")
    public void givenIHaveANumber(String s) {
        c = new Calculator();
        inputParser = new ComplexNumberParser(s, c);
    }


    @Given("I have a complex number expression {string}")
    public void iHaveAnCommplexNumberEpressionExpression(String s) {
        c = new Calculator();
        inputParser = new ComplexNumberParser(s, c);
    }

    @Given("I have a real number {int}")
    public void iHaveARealNumber(int arg0) {
        c = new Calculator();
        inputParser = new ComplexNumberParser(String.valueOf(arg0), c);
    }

    @Then("the real part should be {int}")
    public void theRealPartShouldBe(int arg0) {
        assertEquals(arg0,inputParser.evaluate().getReal());
    }

    @Then("the imaginary part should be {int}")
    public void theImaginaryPartShouldBe(int arg0) {
        assertEquals(arg0,inputParser.evaluate().getImaginary());
    }

    @Then("the result should be {string}")
    public void theResultShouldBeResult(String result) {
        assertEquals(result,inputParser.evaluate().toString());
    }

}
