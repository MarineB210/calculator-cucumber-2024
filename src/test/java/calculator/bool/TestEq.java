package calculator.bool;

import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.boolean_operators.Equals;
import calculator.operators.boolean_operators.Or;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestEq {
    private final int value1 = 0;
    private final int value2 = 1;
    private Equals op;
    private List<Expression> params;

    @BeforeEach
    void setUp(){
        params = new ArrayList<>(Arrays.asList(new MyNumber(value1),new MyNumber(value2)));
        try { op = new Equals(params); }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create an Equals expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Equals(null));
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testConstructor2() {
        // A Or expression should not be the same as an Equals expression
        try {
            assertNotSame(op, new Or(new ArrayList<>()));
        } catch (IllegalConstruction e) {
            fail();
        }
    }
    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(value2)));
        try {
            Equals e = new Equals(p);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new Equals(new ArrayList<>(Arrays.asList(new MyNumber(1), new MyNumber(1)))));
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void testNull() {
        assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
    }

    @Test
    void testHashCode() {
        // Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(value2)));
        try {
            Equals e = new Equals(p);
            assertEquals(e.hashCode(), op.hashCode());
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new Equals(params));
    }

    @Test
    void testInvalidNumber(){
        try {
            ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(4)));
            Equals equals = new Equals(p);
            Expression expression = equals.op(new MyNumber(value1), new MyNumber(4));
            assertEquals(MyNotANumber.class, expression.getClass());
        }
        catch (IllegalConstruction e){
            fail();
        }
    }

    @Test
    void testLogMessageIsSent() {
        Logger logger = Logger.getLogger(Equals.class.getName());

        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        try {
            Equals instance = new Equals(new ArrayList<>());
            instance.op(new MyNumber(4), new MyNumber(1));
            handler.flush();
            String logMsg = out.toString();
            assertNotNull(logMsg);
            assertTrue(logMsg.contains("Invalid number entered. Number should be either 0 or 1."));
        }
        catch (IllegalConstruction e) {
            fail();
        } finally {
            logger.removeHandler(handler);
        }
    }
}
