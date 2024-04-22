package calculator.ComplexNumber;

import calculator.Calculator;
import calculator.ComplexNumberParser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

class TestComplexNumberParser {

    @ParameterizedTest
    @CsvSource({
            "5+i",
            "+(5 i)",
            "(5 i)+",
    })
    void testComplexNumber(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals(5.0,parser.evaluate().getReal());
        assertEquals(1.0,parser.evaluate().getImaginary());
        assertEquals("5 + i", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "5-3i",
            "-(5 3i)",
            "(5 3i)-",
    })
    void testComplexNumberMinus(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals(5.0,parser.evaluate().getReal());
        assertEquals(-3.0,parser.evaluate().getImaginary());
        assertEquals("5 - 3i", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberNoReal(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("i",calculator);
        assertEquals(0.0,parser.evaluate().getReal());
        assertEquals(1.0,parser.evaluate().getImaginary());
        assertEquals("i", parser.evaluate().toString());
    }

    @Test
    void testComplexNumberNoReal2(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("-1i",calculator);
        assertEquals(0.0,parser.evaluate().getReal());
        assertEquals(-1.0,parser.evaluate().getImaginary());
        assertEquals("-i", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "-5+3i + -2-i , -7 + 2i",
            "(-5+i) - (-2-2i) , -3 + 3i",
            "(5+3i) * i , -3 + 5i",
            "(5+3i) / (2+2i), 2",

            "+(+(-5 3i) -(-2 i)) , -7 + 2i",
            "-(+(-5 i) -(-2 2i)), -3 + 3i",
            "*(+(5 3i) i) , -3 + 5i",
            "/(+(5 3i) +(2 2i)), 2",

            "((-5 3i)+ (-2 i)-)+, -7 + 2i",
            "((-5 i)+ (-2 2i)-)-, -3 + 3i",
            "((5 3i)+ i)*, -3 + 5i",
            "((5 3i)+ (2 2i)+)/ , 2",
    })
    void testComplexNumberOperator(String par, String result){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals(result, parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "sqrt(-1+10)",
            "sqrt( +(-1 10))",
            "sqrt( (-1 10)+)",
    })
    void testSqrt(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals(3,parser.evaluate().getValue());
    }


    @ParameterizedTest
    @CsvSource({
            "| 2 + 2 +3i|",
            "| +(2 +(2 3i)) |",
            "|(2 (2 3i)+)+|",
    })
    void testComplexNumberModulus(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals(5, parser.evaluate().getValue());
    }

    @Test
    void testComplexNumberParentheses(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("(-i)",calculator);
        assertEquals("-i", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "cis(40+5)",
            "cis(+(40 5))",
            "cis((40 5)+)",
    })
    void testCis(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("1 * cis(45)", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "e(i*40+5)",
            "e(i*+(40 5))",
            "e(i*(40 5)+)",
    })
    void testE(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("1 * e(i*45)", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "intoPolar(sqrt(2)+sqrt(2)i)",
            "intoPolar(sqrt(+(1 1))+sqrt(+(1 1))i)",
            "intoPolar(sqrt((1 1)+)+sqrt((1 1)+)i)",
    })
    void testComplexNumberIntoPolar(){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser("intoPolar(sqrt(2)+sqrt(2)i)",calculator);
        assertEquals("2 * cis(45)", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "intoCartesian(2 * cis(40 + 5))",
            "intoCartesian(2 * cis(+(40 5)))",
            "intoCartesian(2 * cis((40 5)+))",
    })
    void testComplexNumberIntoCartesian(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("1 + i", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "intoE(intoPolar(2*e(i*(40+5))))",
            "intoE(intoPolar(2*e(i*(+(40 5))))",
            "intoE(intoPolar(2*e(i*((40 5)+)))",
    })
    void testComplexNumberIntoExponential(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("2 * e(i*45)", parser.evaluate().toString());
    }

    @ParameterizedTest
    @CsvSource({
            "| 5+ (-i)|",
            "| +(5 -i)|",
            "|(5 -i)+|",
            "| 5+ (-1i)|",
            "| +(5 -1i)|",
            "|(5 -1i)+|",
    })
    void testComplexNumberIntoExponential2(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("5", parser.evaluate().toString());
    }



    @ParameterizedTest
    @CsvSource({
            "|intoE(sqrt((2+2)))|",
            "|intoE(sqrt(+(2 2)))|",
            "|intoE(sqrt((2 2)+))|",
    })
    void testInvalidComplexNumber(String par){
        Calculator calculator = new Calculator();
        ComplexNumberParser parser = new ComplexNumberParser(par,calculator);
        assertEquals("NaN", parser.evaluate().toString());
    }
}
