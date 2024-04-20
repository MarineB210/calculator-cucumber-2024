package calculator.time;

import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import calculator.operators.time.Minus;
import calculator.operators.time.Plus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestTimeMinus {
    private final MyTime time1 = new MyTime(2000, 1, 1, 12, 0, 0);
    private final MyTime time2 = new MyTime(1000, 2, 2, 0, 0, 0);
    private final MyTime time3 = new MyTime(3000, 3, 3, 12, 0, 0);
    private Minus op;
    private List<Expression> params;

    @BeforeEach
    void setUp() {
        params = new ArrayList<>(Arrays.asList(time1,time2));
        try { op = new Minus(params); }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testConstructor1() {
        // It should not be possible to create a Plus expression without null parameter list
        assertThrows(IllegalConstruction.class, () -> op = new Minus(null));
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testConstructor2() {
        // A Times expression should not be the same as a Plus expression
        try {
            assertNotSame(op, new Plus(new ArrayList<>()));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testEquals() {
        // Two similar expressions, constructed separately (and using different constructors) should be equal
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(time1, time2));
        try {
            Minus e = new Minus(p);
            assertEquals(op, e);
            assertNotEquals(e, new Plus(new ArrayList<>(Arrays.asList(time3, time1))));
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
        ArrayList<Expression> p = new ArrayList<>(Arrays.asList(time1, time2));
        try {
            Minus e = new Minus(p);
            assertEquals(e.hashCode(), op.hashCode());
        }
        catch(IllegalConstruction e) { fail(); }
    }

    @Test
    void testNullParamList() {
        params = null;
        assertThrows(IllegalConstruction.class, () -> op = new Minus(params));
    }
}
