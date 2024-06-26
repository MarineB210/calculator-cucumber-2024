package calculator.bool;

import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyBool;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.boolean_operators.Not;
import calculator.operators.boolean_operators.Or;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import static org.junit.jupiter.api.Assertions.*;

class TestNot {

    private final int value1 = 0;
    private Not op;
    private List<Expression> params;

    @BeforeEach
    void setUp(){
        params = new ArrayList<>(List.of(new MyNumber(value1)));
        try { op = new Not(params); }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create an And expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Not(null));
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testConstructor2() {
        // A Or expression should not be the same as an And expression
        try {
            assertNotSame(op, new Or(new ArrayList<>()));
        } catch (IllegalConstruction e) {
            fail();
        }
    }
    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        ArrayList<Expression> p = new ArrayList<>(List.of(new MyNumber(value1)));
        try {
            Not e = new Not(p);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new Not(new ArrayList<>(List.of(new MyNumber(1)))));
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testOp(){
        assertInstanceOf(MyNotANumber.class, op.op(new MyNotANumber()));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void testNull() {
        assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
    }

    @Test
    void testHashCode() {
        // Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
        ArrayList<Expression> p = new ArrayList<>(List.of(new MyNumber(value1)));
        try {
            Not e = new Not(p);
            assertEquals(e.hashCode(), op.hashCode());
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new Not(params));
    }

    @Test
    void testLogMessageIsSent() {
        Logger logger = Logger.getLogger(Not.class.getName());

        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        try {
            Not instance = new Not(new ArrayList<>());
            instance.op(new MyBool(0), new MyBool(1));
            handler.flush();
            String logMsg = out.toString();
            assertNotNull(logMsg);
            assertTrue(logMsg.contains("Not is an unary operator, keeping only the first number"));
        }
        catch (IllegalConstruction | MyBool.InvalidNumberException e) {
            fail();
        } finally {
            logger.removeHandler(handler);
        }
    }

    @Test
    void testLogMessageIsSent2() {
        Logger logger = Logger.getLogger(Not.class.getName());

        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        try {
            Not instance = new Not(new ArrayList<>());
            instance.op(new MyNumber(4));
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

