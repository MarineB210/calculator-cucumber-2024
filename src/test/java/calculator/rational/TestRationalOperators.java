package calculator.rational;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyRationalNumber;
import calculator.operators.Divides;
import calculator.operators.Minus;
import calculator.operators.Plus;
import calculator.operators.Times;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRationalOperators {
    private final int value1 = 1;
    private final int value2 = 2;
    private final int value3 = 3;
    private Calculator calculator;
    private List<Expression> params;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        params = new ArrayList<>(Arrays.asList(new MyRationalNumber(value1, value2), new MyRationalNumber(value1, value3)));
    }

    @Test
    void testAdditionOfRationalNumbers() {
        try {
            Plus plus = new Plus(params);
            MyRationalNumber result = (MyRationalNumber)calculator.eval(plus);
            assertEquals(5, result.getNumerator());
            assertEquals(6, result.getDenominator());
        } catch (IllegalConstruction e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testSubtractionOfRationalNumbers() {
        try {
            Minus minus = new Minus(params);
            MyRationalNumber result = (MyRationalNumber)calculator.eval(minus);
            assertEquals(1, result.getNumerator());
            assertEquals(6, result.getDenominator());
        } catch (IllegalConstruction e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testMultiplicationOfRationalNumbers() {
        try {
            Times times = new Times(params);
            MyRationalNumber result = (MyRationalNumber)calculator.eval(times);
            assertEquals(1, result.getNumerator());
            assertEquals(6, result.getDenominator());
        } catch (IllegalConstruction e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testDivisionOfRationalNumbers() {
        try {
            Divides divides = new Divides(params);
            MyRationalNumber result = (MyRationalNumber)calculator.eval(divides);
            assertEquals(3, result.getNumerator());
            assertEquals(2, result.getDenominator());
        } catch (IllegalConstruction e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testDivisionByZero() {
        try {
            MyRationalNumber zero = new MyRationalNumber(0, value1);
            Divides divides = new Divides(Arrays.asList(new MyRationalNumber(value1, value2 + value3), zero));
            assertInstanceOf(MyNotANumber.class, calculator.eval(divides));
        } catch (IllegalConstruction e) {
            fail(e.getMessage());
        }
    }
}
