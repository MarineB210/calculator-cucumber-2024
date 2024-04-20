package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.numbers.MyNotANumber;
import calculator.operators.Divides;
import calculator.operators.Minus;
import calculator.operators.Plus;
import calculator.operators.Times;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

class TestEvaluator {

    private Calculator calc;
    private int value1, value2;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        value1 = 8;
        value2 = 6;
    }

    @Test
    void testEvaluatorMyNumber() {
        assertEquals(new MyNumber(value1), calc.eval(new MyNumber(value1)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateOperations(String symbol) {
        List<Expression> params = Arrays.asList(new MyNumber(value1),new MyNumber(value2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( new MyNumber(value1 + value2), calc.eval(new Plus(params)));
                case "-"	->	assertEquals( new MyNumber(value1 - value2), calc.eval(new Minus(params)));
                case "*"	->	assertEquals( new MyNumber(value1 * value2), calc.eval(new Times(params)));
                case "/"	->	assertEquals( new MyNumber(value1 / value2), calc.eval(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void NotANumberForCompositorExpression(){
        try {
            MyNumber num1 = new MyNumber(3);
            MyNumber num2 = new MyNumber(4);
            MyNumber num3 = new MyNotANumber();
            MyNumber num4 = new MyNumber(5);
            MyNumber num5 = new MyNumber(4);
            MyNumber num6 = new MyNumber(7);

            Plus plus = new Plus(Arrays.asList(num1, num2, num3));
            Minus minus = new Minus(Arrays.asList(num4, num5));
            Divides divides = new Divides(Arrays.asList(plus, minus, num6));

            Calculator c= new Calculator();
            assertInstanceOf(MyNotANumber.class, c.eval(divides));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testUnaireDefault() {
        List<Expression> params = Arrays.asList(new MyNumber(value1));
        try {
            assertEquals( new MyNumber(value1), calc.eval(new Plus(params)));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

}
