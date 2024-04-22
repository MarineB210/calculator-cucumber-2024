package calculator.time;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyNotATime;
import calculator.numbers.MyTime;
import calculator.operators.time.Minus;
import calculator.operators.time.Plus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestTimeEvaluator {

    private Calculator calc;
    private MyTime time1, time2;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        time1 = new MyTime(8, 30, 0);
        time2 = new MyTime(6, 15, 0);
    }

    @Test
    void testEvaluatorMyTime() {
        assertEquals(time1, calc.timeEval(time1));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+", "-"})
    void testEvaluateOperations(String symbol) {
        List<Expression> params = Arrays.asList(time1,time2);
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( new MyTime(14, 45, 0), calc.timeEval(new Plus(params)));
                case "-"	->	assertEquals( new MyTime(2,15,0), calc.timeEval(new Minus(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void NotATimeForCompositorExpression(){
        try {
            MyTime time1 = new MyTime(3, 0, 0);
            MyTime time2 = new MyTime(4, 0, 0);
            List<Expression> params = Arrays.asList(time1,time2);
            assertInstanceOf(MyNotATime.class, calc.timeEval(new Minus(params)));
        } catch (IllegalConstruction e) {
            fail();
        }
    }
}
