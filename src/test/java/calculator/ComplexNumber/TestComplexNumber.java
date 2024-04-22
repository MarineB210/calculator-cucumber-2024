package calculator.ComplexNumber;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.numbers.*;
import calculator.operators.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestComplexNumber {

    private  double real1 , imaginary1, real2,imaginary2;
    ComplexNumber complexNumber1, complexNumber2;
    private Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
        real1 = 3;
        imaginary1 = 4;
        complexNumber1 = new ComplexNumber(real1, imaginary1);
        real2 = 2;
        imaginary2 = 3;
        complexNumber2 = new ComplexNumber(real2, imaginary2);

    }

    @Test
    void testPartImaginaryInNumber() {
        MyNumber number = new MyNumber(3);
        assertEquals(0, number.getImaginary());
    }

    @Test
    void testToString() {
        assertEquals((int)real1 + " + " + (int)imaginary1 + "i", complexNumber1.toString());
    }

    @Test
    void testString2(){
        ComplexNumber complexNumber = new ComplexNumber(0, 3);
        assertEquals("3i", complexNumber.toString());
    }

    @Test
    void testString3(){
        ComplexNumber complexNumber = new ComplexNumber(0, -3);
        assertEquals("-3i", complexNumber.toString());
    }

    @Test
    void testString4(){
        ComplexNumber complexNumber = new ComplexNumber(3, -1);
        assertEquals("3 - i", complexNumber.toString());
    }

    @Test
    void testHashCode() {
        assertEquals((int) (real1+imaginary1), complexNumber1.hashCode());
    }

    @Test
    void tesAddition() {
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Plus plus = new Plus(para);
            ComplexNumber result = new ComplexNumber(real1 + real2, imaginary1 + imaginary2);
            MyNumber number = calc.eval(plus);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testMinus() {
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Minus minus = new Minus(para);
            ComplexNumber result = new ComplexNumber(real1 - real2, imaginary1 - imaginary2);
            MyNumber number = calc.eval(minus);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testMinusAComplexNumber() {
        List<Expression> para = Arrays.asList(complexNumber1);
        try {
            Minus minus = new Minus(para);
            ComplexNumber result = new ComplexNumber(-real1 , -imaginary1);
            MyNumber number = calc.eval(minus);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testTime(){
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Times times = new Times(para);
            ComplexNumber result = new ComplexNumber(real1 * real2 - imaginary1 * imaginary2, real1 * imaginary2 + real2 * imaginary1);
            MyNumber number = calc.eval(times);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testDivides(){
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Divides divides = new Divides(para);
            ComplexNumber result = new ComplexNumber((real1 * real2 + imaginary1 * imaginary2) / (real2 * real2 + imaginary2 * imaginary2), (real2 * imaginary1 - real1 * imaginary2) / (real2 * real2 + imaginary2 * imaginary2));
            MyNumber number = calc.eval(divides);
            assertEquals(result.getReal(), number.getReal());
            assertEquals(result.getImaginary(), number.getImaginary());
            assertEquals(result.toString(), number.toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }


    @Test
    void testSqrtWithNumberMinus() {
        MyNumber number = new MyNumber(-1);
        List<Expression> para = List.of(number);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertEquals(1, calc.eval(sqrt).getImaginary());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testSqrtWithNumber() {
        MyNumber number = new MyNumber(9);
        List<Expression> para = List.of(number);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertEquals(3, calc.eval(sqrt).getValue());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testSqrtWithComplexNumber() {
        List<Expression> para = List.of(complexNumber1);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(sqrt));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testSqrtWith2Number() {
        MyNumber number1 = new MyNumber(9);
        MyNumber number2 = new MyNumber(4);
        List<Expression> para = List.of(number1, number2);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(sqrt));
        } catch (IllegalConstruction e) {
            fail();
        }
    }


    @Test
    void testModulus(){
        List<Expression> para = Collections.singletonList(complexNumber1);
        try {
            Modulus modulus = new Modulus(para);
            assertEquals((int) Math.sqrt(real1 * real1 + imaginary1 * imaginary1), calc.eval(modulus).getValue());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testModulusWith2Complex(){
        List<Expression> para = Arrays.asList(complexNumber1, complexNumber2);
        try {
            Modulus modulus = new Modulus(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(modulus));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testModulusWithNotANumber(){
        MyNumber number = new MyNotANumber();
        List<Expression> para = Collections.singletonList(number);
        try {
            Modulus modulus = new Modulus(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(modulus));
        } catch (IllegalConstruction e) {
            fail();
        }
    }


    @Test
    void testDivides2(){
        List<Expression> para = Arrays.asList(new ComplexNumber(5,1), new ComplexNumber(2,1));
        try {
            Divides divides = new Divides(para);
            ComplexNumber result = new ComplexNumber(2,0);
            assertEquals(result.toString(), calc.eval(divides).toString());
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testCis()  {
        MyNumber number1 = new MyNumber(2);
        MyNumber number2 = new MyNumber( 45);
        List<Expression> para = Arrays.asList(number1, number2);
        try {
            Cis cis = new Cis(para);
            ComplexNumber result = new ComplexNumber(number1.getReal() * Math.cos(Math.toRadians(number2.getReal())), number1.getReal() * Math.sin(Math.toRadians(number2.getReal())));
            result.setForm(ComplexForm.POLAR);
            assertEquals((int) result.getReal(), (int) calc.eval(cis).getReal());
            assertEquals((int) result.getImaginary(), (int) calc.eval(cis).getImaginary());
            assertEquals(result.toString(), calc.eval(cis).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testCisWithOneNmber() {
        List<Expression> para = Arrays.asList(new MyNumber(2));
        try {
            Cis cis = new Cis(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(cis));
        } catch (IllegalConstruction e) {
            fail();
        }
    }


    @Test
    void testCisComplexNyNotNumber1() {
        MyNumber number = new MyNotANumber();
        MyNumber number2 = new MyNumber( 45);
        List<Expression> para = Arrays.asList(number, number2);
        try {
            Cis cis = new Cis(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(cis));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testCisComplexNyNotNumber2() {
        MyNumber number = new MyNumber( 2);
        MyNumber number2 = new MyNotANumber();
        List<Expression> para = Arrays.asList(number, number2);
        try {
            Cis cis = new Cis(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(cis));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testExponential_i() throws IllegalConstruction {
        MyNumber number1 = new MyNumber(2);
        MyNumber number2 = new MyNumber( 45);
        List<Expression> para = Arrays.asList(number1, number2);
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            ComplexNumber result = new ComplexNumber((number1.getReal() * Math.cos(Math.toRadians(number2.getReal()))), number1.getReal() * Math.sin(Math.toRadians(number2.getReal())));
            result.setForm(ComplexForm.EXPONENTIAL);
            assertEquals((int) result.getReal(), (int) calc.eval(exponential_i).getReal());
            assertEquals( (int) result.getImaginary(),(int) calc.eval(exponential_i).getImaginary());
            assertEquals(result.toString(), calc.eval(exponential_i).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testExponential_iWithOneNmber() {
        List<Expression> para = Arrays.asList(new MyNumber(2));
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(exponential_i));
        } catch (IllegalConstruction e) {
            fail();
        }
    }


    @Test
    void testExponential_iWithNyNotNumber() {
        MyNumber number = new MyNotANumber();
        MyNumber number2 = new MyNumber( 45);
        List<Expression> para = Arrays.asList(number, number2);
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(exponential_i));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testExponential_iWithNyNotNumber2() {
        MyNumber number = new MyNumber( 2);
        MyNumber number2 = new MyNotANumber();
        List<Expression> para = Arrays.asList(number, number2);
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(exponential_i));
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringCartesianIntoCartesian() {
        ComplexNumber complexNumber = new ComplexNumber( Math.sqrt(2), Math.sqrt(2));
        List<Expression> para = Collections.singletonList(complexNumber);
        try {
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para);
            assertEquals("1 + i", calc.eval(intoCartesianFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }



    @Test
    void testStringCartesianIntoExponential() {
        ComplexNumber complexNumber = new ComplexNumber( Math.sqrt(2),Math.sqrt(2));
        List<Expression> para = Collections.singletonList(complexNumber);
        try {
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para);
            assertEquals("2 * e(i*45)", calc.eval(intoExponentialForm).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }
    @Test
    void testStringCartesianIntoPolar() {
        ComplexNumber complexNumber = new ComplexNumber( Math.sqrt(2), Math.sqrt(2));
        List<Expression> para = Collections.singletonList(complexNumber);
        try {
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para);
            assertEquals("2 * cis(45)", calc.eval(intoPolarFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringPolarIntoPolar() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( 45));
        try {
            Cis polar =new  Cis(para);
            List<Expression> para2 = Collections.singletonList(polar);
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para2);
            assertEquals("2 * cis(45)", calc.eval(intoPolarFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringPolarIntoCartesian() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber(45));
        try {
            Cis polar =new  Cis(para);
            List<Expression> para2 = Collections.singletonList(polar);
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para2);
            assertEquals("1 + i", calc.eval(intoCartesianFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringPolarIntoExponential() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( 45));
        try {
            Cis polar =new  Cis(para);
            List<Expression> para2 = Collections.singletonList(polar);
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para2);
            assertEquals("2 * e(i*45)", calc.eval(intoExponentialForm).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }




    @Test
    void testStringExponentialIntoExponential() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( 45));
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            List<Expression> para2 = Collections.singletonList(exponential_i);
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para2);
            assertEquals("2 * e(i*45)", calc.eval(intoExponentialForm).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringExponentialIntoCartesian() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber(45));
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            List<Expression> para2 = Collections.singletonList(exponential_i);
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para2);
            assertEquals("1 + i", calc.eval(intoCartesianFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringExponentialIntoPolar() {
        List<Expression> para = Arrays.asList(new MyNumber(2), new MyNumber( 45));
        try {
            ExponentialWithI exponential_i = new ExponentialWithI(para);
            List<Expression> para2 = Collections.singletonList(exponential_i);
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para2);
            assertEquals("2 * cis(45)", calc.eval(intoPolarFrom).toString());
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }


    @Test
    void testStringIntoCartesianWith2Complex() {
        ComplexNumber complexNumber = new ComplexNumber( 1, 1);
        ComplexNumber complexNumber2 = new ComplexNumber( 1, 1);
        List<Expression> para = Arrays.asList(complexNumber, complexNumber2);
        try {
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(intoCartesianFrom));
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringIntoCartesianWithNyNotNumber() {
        MyNumber number = new MyNotANumber();
        List<Expression> para = Arrays.asList(number);
        try {
            IntoCartesianFrom intoCartesianFrom = new IntoCartesianFrom(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(intoCartesianFrom));
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringIntoPolarWith2Complex() {
        ComplexNumber complexNumber = new ComplexNumber( 1, 1);
        ComplexNumber complexNumber2 = new ComplexNumber( 1, 1);
        List<Expression> para = Arrays.asList(complexNumber, complexNumber2);
        try {
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(intoPolarFrom));
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringIntoPolarWithNyNotNumber() {
        MyNumber number = new MyNotANumber();
    List<Expression> para = Arrays.asList(number);
        try {
            IntoPolarForm intoPolarFrom = new IntoPolarForm(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(intoPolarFrom));
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringIntoExponentialWith2Complex() {
        ComplexNumber complexNumber = new ComplexNumber( 1, 1);
        ComplexNumber complexNumber2 = new ComplexNumber( 1, 1);
        List<Expression> para = Arrays.asList(complexNumber, complexNumber2);
        try {
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(intoExponentialForm));
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testStringIntoExponentialWithNyNotNumber() {
        MyNumber number = new MyNotANumber();
        List<Expression> para = Arrays.asList(number);
        try {
            IntoExponentialForm intoExponentialForm = new IntoExponentialForm(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(intoExponentialForm));
        }
        catch (IllegalConstruction e) {
            fail();
        }
    }

    @Test
    void testEquals() {
        assertEquals(complexNumber1, complexNumber1);
        assertNotEquals(complexNumber1, complexNumber2);
        assertNotEquals(complexNumber1, new MyNumber(3));
        assertNotEquals(null, complexNumber1);
        assertNotEquals(complexNumber1,null);
        assertNotEquals(complexNumber1, new ComplexNumber(real1,imaginary2));
        assertNotEquals(complexNumber1, new ComplexNumber(real2,imaginary1));
        assertEquals(complexNumber1, new ComplexNumber(real1, imaginary1));
    }

    @Test
    void testSqrtWithMyNotANumber() {
        MyNumber number = new MyNotANumber();
        List<Expression> para = Collections.singletonList(number);
        try {
            Sqrt sqrt = new Sqrt(para);
            assertInstanceOf(MyNotANumber.class, calc.eval(sqrt));
        } catch (IllegalConstruction e) {
            fail();
        }
    }


}

