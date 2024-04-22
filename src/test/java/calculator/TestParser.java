package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class TestParser{

    //Basic infix tests

    @Test
    void testNumber(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("5",calculator);
        assertEquals(5,parser.evaluate().getValue());
    }

    @Test
    void testSum(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("5 + 3",calculator);
        assertEquals(8,parser.evaluate().getValue());
    }

    @Test
    void testNestedMul(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("(4+5)*2",calculator);
        assertEquals(18,parser.evaluate().getValue());
    }

    @Test
    void testPrecedence(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("4+2*5",calculator);
        assertEquals(14, parser.evaluate().getValue());
    }

    @Test
    void testPrecedence2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(4+5+6)*(7 + 4/2)*9",calculator);
        assertEquals(1215, parser.evaluate().getValue());
    }

    @Test
    void testNegNumber(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5",calculator);
        assertEquals(-5, parser.evaluate().getValue());
    }

    @Test
    void testBasicNegOp(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5-2",calculator);
        assertEquals(-7, parser.evaluate().getValue());
    }

    @Test
    void testMulNegPos(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5 * 2",calculator);
        assertEquals(-10, parser.evaluate().getValue());
    }

    @Test
    void testMulNeg(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5 * -2",calculator);
        assertEquals(10, parser.evaluate().getValue());
    }

    @Test
    void testNegOp(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5 + 7",calculator);
        assertEquals(2, parser.evaluate().getValue());
    }

    @Test
    void testComplexNegOp(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(-5 + 7) * 3",calculator);
        assertEquals(6, parser.evaluate().getValue());
    }


    //Basic postfix tests

    @Test
    void testSum2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(5, 3)+",calculator);
        assertEquals(8,parser.evaluate().getValue());
    }

    @Test
    void testNestedMul2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("((4,5)+, 2)*",calculator);
        assertEquals(18,parser.evaluate().getValue());
    }

    @Test
    void testNegNumber2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5",calculator);
        assertEquals(-5, parser.evaluate().getValue());
    }

    @Test
    void testBasicNegOp2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(-5, 2)-",calculator);
        assertEquals(-7, parser.evaluate().getValue());
    }

    @Test
    void testMulNegPos2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(-5, 2)*",calculator);
        assertEquals(-10, parser.evaluate().getValue());
    }

    @Test
    void testMulNeg2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(-5, -2)*",calculator);
        assertEquals(10, parser.evaluate().getValue());
    }

    /*@Test
    void testVisitParensPostfix() {
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(1 2 +)",calculator);
        assertEquals(3, parser.evaluate().getValue());
    }*/

    @Test
    void testNegOp2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(-5, 7)+",calculator);
        assertEquals(2, parser.evaluate().getValue());
    }

    @Test
    void testComplexNegOp2(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("((-5, 7)+ , 3)*",calculator);
        assertEquals(6, parser.evaluate().getValue());
    }

    //Basic prefix tests

    @Test
    void testSum3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("+(5, 3)",calculator);
        assertEquals(8,parser.evaluate().getValue());
    }

    @Test
    void testNestedMul3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("*(+(4,5), 2)",calculator);
        assertEquals(18,parser.evaluate().getValue());
    }

    @Test
    void testVisitParensPrefix() {
        Calculator calculator = new Calculator();

        Parser parser = new Parser("(+ 1 2)",calculator);
        assertEquals(3, parser.evaluate().getValue());
    }

    @Test
    void testNegNumber3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-5",calculator);
        assertEquals(-5, parser.evaluate().getValue());
    }

    @Test
    void testBasicNegOp3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("-(-5, 2)",calculator);
        assertEquals(-7, parser.evaluate().getValue());
    }

    @Test
    void testMulNegPos3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("*(-5, 2)",calculator);
        assertEquals(-10, parser.evaluate().getValue());
    }

    @Test
    void testMulNeg3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("*(-5, -2)",calculator);
        assertEquals(10, parser.evaluate().getValue());
    }

    @Test
    void testNegOp3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("+(-5, 7)",calculator);
        assertEquals(2, parser.evaluate().getValue());
    }

    @Test
    void testComplexNegOp3(){
        Calculator calculator = new Calculator();

        Parser parser = new Parser("*(+(-5, 7), 3",calculator);
        assertEquals(6, parser.evaluate().getValue());
    }

    // Complex tests

    /**
     * This test is used to test the basic functionality of the parser
     */
    @Test
    void testBasicFunctionality(){
        Calculator calculator = new Calculator();
        Parser infix = new Parser("((4+5+6)*(7+(5/2/7))*9)",calculator);
        assertEquals(945, infix.evaluate().getValue());

        Parser prefix = new Parser("*(+(4,5,6),+(7,/(5,2,7)),9)",calculator);
        assertEquals(945, prefix.evaluate().getValue());

        Parser posfix = new Parser("((4,5,6)+,(7,(5,2,7)/)+,9)*",calculator);
        assertEquals(945, posfix.evaluate().getValue());
    }

    /**
     * This test if the parser is not space sensible
     */
    @Test
    void testNotSpaceSensible(){
        Calculator calculator = new Calculator();
        Parser cal1 = new Parser("(4+5)*2",calculator);
        assertEquals(18, cal1.evaluate().getValue());

        Parser cal2 = new Parser(" ( 4 + 5 ) * 2 ",calculator);
        assertEquals(cal1.evaluate().getValue(), cal2.evaluate().getValue());

        Parser cal3 = new Parser("  (   4   +   5   )   *   2   ",calculator);
        assertEquals(cal1.evaluate().getValue(), cal3.evaluate().getValue());
    }

    /**
     * This test We can write the prefix and postfix expression with spaces instead of commas
     */
    @Test
    void testPrefixAndPostfixWithSpace(){
        Calculator calculator = new Calculator();
        Parser prefix = new Parser("+(10 3)",calculator);
        assertEquals(13, prefix.evaluate().getValue());

        Parser postfix = new Parser("(10   3)+",calculator);
        assertEquals(13, postfix.evaluate().getValue());
    }

    /**
     * This test if the  parser's output can be used like parser's input
     */
    @Test
    void testTheOutputInInput(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("(4+5)*2",calculator);
        Parser parser2 = new Parser(parser.evaluate().toString(),calculator);
        assertEquals(18,parser2.evaluate().getValue());
    }

    @Test
    void testSimplifyExpression(){
        Calculator calculator = new Calculator();
        Parser parser = new Parser("((4+5+6)*(7+5/2/7)*9)",calculator);
        assertEquals(945, parser.evaluate().getValue());
    }
}