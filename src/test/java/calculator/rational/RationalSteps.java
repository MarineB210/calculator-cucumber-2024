package calculator.rational;

import calculator.*;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyRationalNumber;
import calculator.operators.Divides;
import calculator.operators.Minus;
import calculator.operators.Plus;
import calculator.operators.Times;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import visitor.ExpressionVisitor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RationalSteps {

    private final CalculatorSteps calculatorSteps = new CalculatorSteps();
    private ArrayList<Expression> params;
    private Operation op;
    private Calculator c;

    @Before
    public void resetMemoryBeforeEachScenario() {
        c = new Calculator();
        params = null;
        op = null;
    }

    @Given("a rational operation {string}")
    public void givenARationalOperation(String s) {
        params = new ArrayList<>(); // create an empty set of parameters to be filled in
        try {
            switch (s) {
                case "+" -> op = new Plus(params);
                case "-" -> op = new Minus(params);
                case "*" -> op = new Times(params);
                case "/" -> op = new Divides(params);
                default -> fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Given("the following list of rational numbers")
    public void givenTheFollowingListOfNumbers(List<List<String>> numbers) {
        params = new ArrayList<>();
        for (List<String> row : numbers) {
            for (String cell : row) {
                String[] parts = cell.split("÷");
                int numerator = Integer.parseInt(parts[0]);
                int denominator = Integer.parseInt(parts[1]);
                params.add(new MyRationalNumber(numerator, denominator));
            }
        }
        op = null;
    }
    @Given("the sum of two rational numbers {int}÷{int} and {int}÷{int}")
    public void theSumOfTwoRationalNumbersAnd(int num1, int deno1, int num2, int deno2) {
        try {
            params = new ArrayList<>();
            params.add(new MyRationalNumber(num1, deno1));
            params.add(new MyRationalNumber(num2, deno2));
            op = new Plus(params);
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    // one methods are missing here

    @When("I provide a rational number {int}÷{int}")
    public void iProvideARationalNumber(int numerator, int denominator) {
        params = new ArrayList<>();
        params.add(new MyRationalNumber(numerator, denominator));
        op.addMoreParams(params);
    }


    @Then("the operation evaluates to {int}÷{int}")
    public void theOperationEvaluatesTo(int numerator, int denominator) {
        assertEquals(new MyRationalNumber(numerator, denominator), c.eval(op));
    }

    @Then("the operation evaluates to {string}")
    public void theOperationEvaluatesTo(String s) {
        String[] parts = s.split("÷");
        int numerator = Integer.parseInt(parts[0]);
        int denominator = Integer.parseInt(parts[1]);
        assertEquals(new MyRationalNumber(numerator, denominator), c.eval(op));
    }

    @Then("the sum is {int}÷{int}")
    public void theSumIs(int numerator, int denominator) {
        try {
            op = new Plus(params);
            assertEquals(new MyRationalNumber(numerator, denominator), c.eval(op));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @And("the product is {int}÷{int}")
    public void theProductIs(int numerator, int denominator) {
        try {
            op = new Times(params);
            assertEquals(new MyRationalNumber(numerator, denominator), c.eval(op));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @And("the difference is {int}÷{int}")
    public void theDifferenceIs(int numerator, int denominator) {
        try {
            op = new Minus(params);
            assertEquals(new MyRationalNumber(numerator, denominator), c.eval(op));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @And("the quotient is {int}÷{int}")
    public void theQuotientIs(int numerator, int denominator) {
        try {
            op = new Divides(params);
            assertEquals(new MyRationalNumber(numerator, denominator), c.eval(op));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Then("the rational operation evaluates to MyNotANumber")
	public void thenTheRationalOperationEvaluatesToMyNotANumber() {
        assertInstanceOf(MyNotANumber.class, c.eval(op));
	}

    @Then("^its (.*) notation of two rational numbers is (.*)$")
	public void thenItsNotationIs(String notation, String s) {
		if (notation.equals("PREFIX")||notation.equals("POSTFIX")||notation.equals("INFIX")) {
			ExpressionVisitor ev = new ExpressionVisitor();
			Notation n = Notation.valueOf(notation);
			ev.setNotation(n);
			op.accept(ev);
			assertEquals(s, ev.getExpression());
		}
		else fail(notation + " is not a correct notation! ");
	}

    @When("^I provide MyNotANumber for an rational operation")
	public void whenIProvideNotANumberForAnRationalOperation() {
		//add extra parameter to the operation
		params = new ArrayList<>();
		params.add(new MyNotANumber());
		op.addMoreParams(params);
	}

    @When("I provide an integer {int} for an rational operation")
    public void iProvideAnIntegerForAnRationalOperation(int val) {
        //add extra parameter to the operation
		params = new ArrayList<>();
		params.add(new MyRationalNumber(val));
		op.addMoreParams(params);
    }
}
