package calculator.bool;

import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.operators.boolean_operators.Or;
import calculator.operators.boolean_operators.Xor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestXor {

    private final int value1 = 0;
    private final int value2 = 1;
    private Xor op;
    private List<Expression> params;

    @BeforeEach
    void setUp(){
        params = new ArrayList<>(Arrays.asList(new MyNumber(value1),new MyNumber(value2)));
        try { op = new Xor(params); }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create a Xor expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Xor(null));
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testConstructor2() {
        // A Or expression should not be the same as a Xor expression
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
            Xor e = new Xor(p);
            assertEquals(op, e);
            assertEquals(e, e);
            assertNotEquals(e, new Xor(new ArrayList<>(Arrays.asList(new MyNumber(1), new MyNumber(1)))));
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
            Xor e = new Xor(p);
            assertEquals(e.hashCode(), op.hashCode());
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new Xor(params));
    }
}
