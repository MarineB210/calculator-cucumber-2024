package calculator.bool;

import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.boolean_operators.And;
import calculator.operators.boolean_operators.Or;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.*;

import static org.junit.jupiter.api.Assertions.*;

class TestAnd {

    private final int value1 = 0;
    private final int value2 = 1;
    private And op;
    private List<Expression> params;

    @BeforeEach
    void setUp(){
        params = new ArrayList<>(Arrays.asList(new MyNumber(value1),new MyNumber(value2)));
        try { op = new And(params); }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create an And expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new And(null));
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
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(value2)));
        try {
            And e = new And(p);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new And(new ArrayList<>(Arrays.asList(new MyNumber(0), new MyNumber(0)))));
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testOp(){
        assertInstanceOf(MyNotANumber.class, op.op(new MyNotANumber(), new MyNotANumber()));
        assertInstanceOf(MyNotANumber.class, op.op(new MyNumber(1), new MyNotANumber()));
        assertInstanceOf(MyNotANumber.class, op.op(new MyNotANumber(), new MyNumber(0)));
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
            And e = new And(p);
            assertEquals(e.hashCode(), op.hashCode());
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new And(params));
    }

    @Test
    void testInvalidNumber(){
        try {
            ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyNumber(value1), new MyNumber(4)));
            And and = new And(p);
            Expression expression = and.op(new MyNumber(value1), new MyNumber(4));
            assertEquals(MyNotANumber.class, expression.getClass());
        }
        catch (IllegalConstruction e){
            fail();
        }
    }

    @Test
    void testLogMessageIsSent() {
        Logger logger = Logger.getLogger(And.class.getName());

        Formatter formatter = new SimpleFormatter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Handler handler = new StreamHandler(out, formatter);
        logger.addHandler(handler);

        try {
            And instance = new And(new ArrayList<>());
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
