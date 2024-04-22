package calculator.bool;

import calculator.IllegalConstruction;
import calculator.numbers.MyBool;
import calculator.operators.boolean_operators.And;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMyBool {

    private final int value = 0;
    private final int badValue = 5;
    private MyBool myBool;

    @Test
    void testException(){
        // A number different from O or 1 should produce an exception
        assertThrows(MyBool.InvalidNumberException.class,() -> myBool = new MyBool(badValue) );
    }

    @SuppressWarnings("AssertBetweenInconvertibleTypes")
    @Test
    void testEquals() {
        try {
            myBool = new MyBool(value);
            // Two distinct MyBool, constructed separately (using a different constructor) but containing the same value should be equal
            assertEquals(new MyBool(value), myBool);
            // Two MyNumbers containing a distinct value should not be equal:
            int otherValue = 1;
            assertNotEquals(new MyBool(otherValue),myBool);
            assertEquals(myBool, myBool); // Identity check (for coverage, as this should always be true)
            assertNotEquals(myBool, value); // myBool is of type MyBool, while value is of type int, so not equal
            assertNotEquals(myBool, null); // instanced mybool should not be equal to null

            try {
                assertNotEquals(new And(new ArrayList<>()), myBool);
            }
            catch (IllegalConstruction e) {fail();}
        }
        catch (MyBool.InvalidNumberException e){
            fail();
        }
    }

    @Test
    void testToString() {
        try {
            myBool = new MyBool(value);
            assertEquals(Integer.toString(value), myBool.toString());
        }
        catch (MyBool.InvalidNumberException e){
            fail();
        }
    }
    @Test
    void testHashCode(){
        try {
            myBool = new MyBool(value);
            assertEquals(value, myBool.hashCode());
        }
        catch (MyBool.InvalidNumberException e){
            fail();
        }
    }

}
