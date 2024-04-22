package calculator.rational;

import calculator.Calculator;
import calculator.RationalParser;
import calculator.numbers.MyRationalNumber;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalParserSteps {
    private Calculator c;
    private RationalParser parser;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Given("a rational number {string}")
    public void aRationalNumber(String s) {
        parser = new RationalParser(s, c);
    }

    @Then("I should get {int} as numerator")
    public void iShouldGetNumeratorAsNumerator(int numerator) {
        assertEquals(numerator, ((MyRationalNumber)parser.evaluate()).getNumerator());
    }

    @And("I should get {int} as denominator")
    public void iShouldGetAsDenominator(int denominator) {
        assertEquals(denominator, ((MyRationalNumber)parser.evaluate()).getDenominator());
    }

    @Given("an rational expression {string}")
    public void anRationalExpression(String s) {
        parser = new RationalParser(s, c);
    }

    @Then("I should get {int}÷{int} as result")
    public void iShouldGetResultAsResult(int numerator, int denominator) {
        assertEquals(new MyRationalNumber(numerator, denominator), parser.evaluate());
    }

}
