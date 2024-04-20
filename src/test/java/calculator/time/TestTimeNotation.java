package calculator.time;

import calculator.IllegalConstruction;
import calculator.Notation;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import calculator.operators.time.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.ExpressionVisitor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestTimeNotation {

    /* This is an auxiliary method to avoid code duplication.
     */
    void testTimeNotation(String s, TimeOperation o, Notation n) {
        ExpressionVisitor ev = new ExpressionVisitor();
        ev.setNotation(n);
        o.accept(ev);
        assertEquals(s, ev.getExpression());
    }

    /* This is an auxiliary method to avoid code duplication.
     */
    void testTimeNotations(String symbol, String time1, String time2, TimeOperation op) {
        //prefix notation:
        testTimeNotation(symbol +" (" + time1 + ", " + time2 + ")", op, Notation.PREFIX);
        //infix notation:
        testTimeNotation("( " + time1 + " " + symbol + " " + time2 + " )", op, Notation.INFIX);
        //postfix notation:
        testTimeNotation("(" + time1 + ", " + time2 + ") " + symbol, op, Notation.POSTFIX);
    }

    @ParameterizedTest
    @ValueSource(strings = {"+","-"})
    void testOutput(String symbol) {
        MyTime time1 = new MyTime(10, 30, 0);
        MyTime time2 = new MyTime(8, 30, 0);
        TimeOperation op = null;
        List<Expression> params = Arrays.asList(time1,time2);
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	op = new Plus(params);
                case "-"	->	op = new Minus(params);
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
        testTimeNotations(symbol, time1.toString(), time2.toString(), op);
    }

    @ParameterizedTest
    @EnumSource(Notation.class)
    void testCompositeExpressionsNotations(Notation notation){
        try {
            MyTime time1 = new MyTime(10, 30, 0);
            MyTime time2 = new MyTime(8, 30, 0);
            MyTime time3 = new MyTime(7, 0, 0);

            // Creator of Operator
            Plus plus = new Plus(Arrays.asList(time1, time2));
            Minus minus = new Minus(Arrays.asList(plus, time3));

            String expected = "";
            switch(notation) {
                case PREFIX -> expected ="- (+ (10:30:00, 08:30:00), 07:00:00)";
                case INFIX -> expected = "( ( 10:30:00 + 08:30:00 ) - 07:00:00 )";
                case POSTFIX -> expected = "((10:30:00, 08:30:00) +, 07:00:00) -";
                default -> fail();
            }
            testTimeNotation(expected, minus, notation);
        } catch (IllegalConstruction e) {
            fail();
        }
    }
}
