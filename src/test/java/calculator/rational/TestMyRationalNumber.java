package calculator.rational;

import calculator.numbers.MyRationalNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestMyRationalNumber {

    @Test
    void constructorShouldThrowExceptionWhenDenominatorIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new MyRationalNumber(1, 0));
    }

    @Test
    void constructorShouldCreateRationalNumberWhenDenominatorIsNotZero() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1, 2);
        assertEquals(1, rationalNumber1.getNumerator());
        assertEquals(2, rationalNumber1.getDenominator());

        MyRationalNumber rationalNumber2 = new MyRationalNumber(0, 2);
        assertEquals(0, rationalNumber2.getNumerator());
        assertEquals(2, rationalNumber2.getDenominator());

        MyRationalNumber rationalNumber3 = new MyRationalNumber(-1, 2);
        assertEquals(-1, rationalNumber3.getNumerator());
        assertEquals(2, rationalNumber3.getDenominator());
    }

    @Test
    void constructorShouldCreateRationalNumberWithDenominatorOneWhenOnlyNumeratorIsProvided() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1);
        assertEquals(1, rationalNumber1.getNumerator());
        assertEquals(1, rationalNumber1.getDenominator());

        MyRationalNumber rationalNumber2 = new MyRationalNumber(0);
        assertEquals(0, rationalNumber2.getNumerator());
        assertEquals(1, rationalNumber2.getDenominator());

        MyRationalNumber rationalNumber3 = new MyRationalNumber(-1);
        assertEquals(-1, rationalNumber3.getNumerator());
        assertEquals(1, rationalNumber3.getDenominator());
    }

    @Test
    void getCanonicalFormShouldReturnCanonicalFormOfRationalNumber() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(2, 4);
        MyRationalNumber canonicalForm1 = rationalNumber1.getCanonicalForm();
        assertEquals(1, canonicalForm1.getNumerator());
        assertEquals(2, canonicalForm1.getDenominator());

        MyRationalNumber rationalNumber2 = new MyRationalNumber(-2, -4);
        MyRationalNumber canonicalForm2 = rationalNumber2.getCanonicalForm();
        assertEquals(1, canonicalForm2.getNumerator());
        assertEquals(2, canonicalForm2.getDenominator());

        MyRationalNumber rationalNumber3 = new MyRationalNumber(2, -4);
        MyRationalNumber canonicalForm3 = rationalNumber3.getCanonicalForm();
        assertEquals(-1, canonicalForm3.getNumerator());
        assertEquals(2, canonicalForm3.getDenominator());

        MyRationalNumber rationalNumber4 = new MyRationalNumber(-2, 4);
        MyRationalNumber canonicalForm4 = rationalNumber4.getCanonicalForm();
        assertEquals(-1, canonicalForm4.getNumerator());
        assertEquals(2, canonicalForm4.getDenominator());

        MyRationalNumber rationalNumber5 = new MyRationalNumber(0, 4);
        MyRationalNumber canonicalForm5 = rationalNumber5.getCanonicalForm();
        assertEquals(0, canonicalForm5.getNumerator());
        assertEquals(1, canonicalForm5.getDenominator());

        MyRationalNumber rationalNumber6 = new MyRationalNumber(0, -4);
        MyRationalNumber canonicalForm6 = rationalNumber6.getCanonicalForm();
        assertEquals(0, canonicalForm6.getNumerator());
        assertEquals(1, canonicalForm6.getDenominator());
    }

    @Test
    void toStringShouldReturnCorrectStringRepresentation() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1, 2);
        assertEquals("1÷2", rationalNumber1.toString());

        MyRationalNumber rationalNumber2 = new MyRationalNumber(-1, 2);
        assertEquals("-1÷2", rationalNumber2.toString());

        MyRationalNumber rationalNumber3 = new MyRationalNumber(1, -2);
        assertEquals("1÷-2", rationalNumber3.toString());

        MyRationalNumber rationalNumber4 = new MyRationalNumber(-1, -2);
        assertEquals("-1÷-2", rationalNumber4.toString());

        MyRationalNumber rationalNumber5 = new MyRationalNumber(0, 1);
        assertEquals("0", rationalNumber5.toString());

        MyRationalNumber rationalNumber6 = new MyRationalNumber(0, -1);
        assertEquals("0", rationalNumber6.toString());

        MyRationalNumber rationalNumber7 = new MyRationalNumber(1, 1);
        assertEquals("1", rationalNumber7.toString());

        MyRationalNumber rationalNumber8 = new MyRationalNumber(-1, 1);
        assertEquals("-1", rationalNumber8.toString());

        MyRationalNumber rationalNumber9 = new MyRationalNumber(1, -1);
        assertEquals("1÷-1", rationalNumber9.toString());
    }

    @Test
    void equalsShouldReturnTrueWhenRationalNumbersAreEqual() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1, 2);
        MyRationalNumber rationalNumber2 = new MyRationalNumber(2, 4);
        MyRationalNumber rationalNumber3 = new MyRationalNumber(-1, -2);
        MyRationalNumber rationalNumber4 = new MyRationalNumber(-2, -4);
        assertEquals(rationalNumber1, rationalNumber2);
        assertEquals(rationalNumber1, rationalNumber3);
        assertEquals(rationalNumber1, rationalNumber4);

        MyRationalNumber rationalNumber5 = new MyRationalNumber(0, 1);
        MyRationalNumber rationalNumber6 = new MyRationalNumber(0, -1);
        MyRationalNumber rationalNumber7 = new MyRationalNumber(0, 2);
        assertEquals(rationalNumber5, rationalNumber6);
        assertEquals(rationalNumber5, rationalNumber7);
    }

    @Test
    void equalsShouldReturnFalseWhenRationalNumbersAreNotEqual() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1, 2);
        MyRationalNumber rationalNumber2 = new MyRationalNumber(2, 3);
        assertNotEquals(rationalNumber1, rationalNumber2);
    }

    @Test
    void hashCodeShouldReturnSameHashCodeForEqualRationalNumbers() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1, 2);
        MyRationalNumber rationalNumber2 = new MyRationalNumber(2, 4);
        assertEquals(rationalNumber1.hashCode(), rationalNumber2.hashCode());
    }

    @Test
    void hashCodeShouldReturnDifferentHashCodeForNonEqualRationalNumbers() {
        MyRationalNumber rationalNumber1 = new MyRationalNumber(1, 2);
        MyRationalNumber rationalNumber2 = new MyRationalNumber(2, 3);
        assertNotEquals(rationalNumber1.hashCode(), rationalNumber2.hashCode());
    }
}