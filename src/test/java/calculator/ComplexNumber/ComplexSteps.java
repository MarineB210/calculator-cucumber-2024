package calculator.ComplexNumber;

import static org.junit.jupiter.api.Assertions.*;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;

public class ComplexSteps {

    private ArrayList<Expression> params;
    private Operation op;
    private Calculator c;

    @Before
    public void resetMemoryBeforeEachScenario() {
        params = null;
        op = null;
    }

    @Given("I initialise a calculator for Complex Numbers")
    public void givenIInitialiseACalculator() {
        c = new Calculator();
    }

    @Given("A operator {string}")
    public void givenAnIntegerOperation(String s) {
        // Write code here that turns the phrase above into concrete actions
        params = new ArrayList<>(); // create an empty set of parameters to be filled in
        try {
            switch (s) {
                case "+" -> op = new Plus(params);
                case "-" -> op = new Minus(params);
                case "*" -> op = new Times(params);
                case "/" -> op = new Divides(params);
                case "||" -> op = new Modulus(params);
                case "sqrt" -> op = new Sqrt(params);
                case "intoCartesian" -> op = new IntoCartesianFrom(params);
                case "intoPolar" -> op = new IntoPolarForm(params);
                case "intoExponential" -> op = new IntoExponentialForm(params);
                default -> fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @When("I have a complex number {int} + {int}i")
    public void whenIAddTheFollowingComplexNumbers(int real, int imaginary) {

        //add extra parameter to the operation
        params = new ArrayList<>();
        params.add(new ComplexNumber(real, imaginary));
        op.addMoreParams(params);
    }

    @When("I have a complex number {int} - {int}i")
    public void whenIAddTheFollowingComplexNumbersSub(int real, int imaginary) {
        //add extra parameter to the operation
        params = new ArrayList<>();
        params.add(new ComplexNumber(real, -imaginary));
        op.addMoreParams(params);
    }

    @When("I have a number {int}")
    public void whenIAddTheFollowingComplexNumbers(int number){
        params = new ArrayList<>();
        params.add(new MyNumber(number));
        op.addMoreParams(params);
    }

    @When("I have a complex number in polar form with r = {int} and theta = {int}")
    public void whenIAddTheFollowingComplexNumbersPolar(int r,int theta) {
        //add extra parameter to the operation
        params = new ArrayList<>();
        try {
            params.add(new Cis(Arrays.asList(new MyNumber(r), new MyNumber(theta))));
            op.addMoreParams(params);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @When("I have a complex number in exponential form with r = {int} and theta = {int}")
    public void whenIAddTheFollowingComplexNumbersExponential(int r,int theta) {
        //add extra parameter to the operation
        params = new ArrayList<>();
        try {
            params.add(new ExponentialWithI(Arrays.asList(new MyNumber(r), new MyNumber(theta))));
            op.addMoreParams(params);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Then("I should get this complex number {int} + {int}i")
    public void thenTheResultIs(int real, int imaginary) {
        ComplexNumber result = (ComplexNumber) c.eval(op);
        assertEquals((int) real,(int) result.getReal());
        assertEquals((int) imaginary,(int) result.getImaginary());
    }

    @Then("I should get this complex number {int} - {int}i")
    public void thenTheResultIsSub(int real, int imaginary) {
        ComplexNumber result = (ComplexNumber) c.eval(op);
        assertEquals((int) real,(int) result.getReal());
        assertEquals((int) -imaginary,(int) result.getImaginary());
    }

    @Then("I should get this number {int}")
    public void thenTheResultIs(int result) {
        assertEquals(result, c.eval(op).getValue());
    }

    @Then("I should get a MyNotANumber")
    public void thenTheResultIs() {
        assertInstanceOf(MyNotANumber.class, c.eval(op));
    }

    @Then("I should get this complex number polar form r = {int} and theta = {int}")
    public void thenTheResultIsPolar(int r, int theta) {
        ComplexNumber result = (ComplexNumber) c.eval(op);
        assertEquals(r+" * cis("+theta+")", result.toString());
    }

    @Then("I should get this complex number exponential form with r = {int} and theta = {int}")
    public void iShouldGetThisComplexNumberExponentialFormEI(int r, int theta) {
        ComplexNumber result = (ComplexNumber) c.eval(op);
        assertEquals(r+" * e(i*"+theta+")", result.toString());
    }

    @When("I have a MyNotANumber")
    public void iHaveAMyNotANumber() {
        params = new ArrayList<>();
        params.add(new MyNotANumber());
        op.addMoreParams(params);
    }
}
