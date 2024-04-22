package calculator.rational;

import static org.junit.jupiter.api.Assertions.*;

import calculator.Calculator;
import calculator.RationalParser;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyRationalNumber;
import org.junit.jupiter.api.*;

class TestRationalParser {

    private Calculator calculator;

    /**
     * Helper method to test equality of expressions in infix, prefix, and postfix notation.
     *
     * @param infixExpr The infix expression to test.
     * @param prefixExpr The prefix expression to test.
     * @param postfixExpr The postfix expression to test.
     * @param expectedValue The expected value of the expressions.
     */
    private void equalsExpressionTest(String infixExpr, String prefixExpr, String postfixExpr, MyRationalNumber expectedValue) {
        RationalParser infixParser = new RationalParser(infixExpr, calculator);
        RationalParser prefixParser = new RationalParser(prefixExpr, calculator);
        RationalParser postfixParser = new RationalParser(postfixExpr, calculator);

        assertEquals(expectedValue, infixParser.evaluate());
        assertEquals(expectedValue, prefixParser.evaluate());
        assertEquals(expectedValue, postfixParser.evaluate());
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSingleInteger() {
        String expr1 = "3";
        MyRationalNumber expected1 = new MyRationalNumber(3);
        RationalParser parser1 = new RationalParser(expr1, calculator);
        assertEquals(expected1, parser1.evaluate());

        String expr2 = "-3";
        MyRationalNumber expected2 = new MyRationalNumber(-3);
        RationalParser parser2 = new RationalParser(expr2, calculator);
        assertEquals(expected2, parser2.evaluate());

        String expr3 = "0";
        MyRationalNumber expected3 = new MyRationalNumber(0);
        RationalParser parser3 = new RationalParser(expr3, calculator);
        assertEquals(expected3, parser3.evaluate());
    }

    @Test
    void testSingleRational() {
        String expr1 = "3÷2";
        MyRationalNumber expected1 = new MyRationalNumber(3, 2);
        RationalParser parser1 = new RationalParser(expr1, calculator);
        assertEquals(expected1, parser1.evaluate());

        String expr2 = "-3÷2";
        MyRationalNumber expected2 = new MyRationalNumber(-3, 2);
        RationalParser parser2 = new RationalParser(expr2, calculator);
        assertEquals(expected2, parser2.evaluate());

        String expr3 = "3÷-2";
        MyRationalNumber expected3 = new MyRationalNumber(3, -2);
        RationalParser parser3 = new RationalParser(expr3, calculator);
        assertEquals(expected3, parser3.evaluate());

        String expr4 = "-3÷-2";
        MyRationalNumber expected4 = new MyRationalNumber(-3, -2);
        RationalParser parser4 = new RationalParser(expr4, calculator);
        assertEquals(expected4, parser4.evaluate());

        String expr5 = "0÷2";
        MyRationalNumber expected5 = new MyRationalNumber(0, 2);
        RationalParser parser5 = new RationalParser(expr5, calculator);
        assertEquals(expected5, parser5.evaluate());
    }

    @Test
    void testPlusSimple() {
        String infixExpr = "3÷2 + 1÷2";
        String prefixExpr = "+ (3÷2, 1÷2)";
        String postfixExpr = "(3÷2, 1÷2) +";
        MyRationalNumber expected = new MyRationalNumber(2);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testRationalPlusIntegerSimple() {
        String infixExpr = "3÷2 + 1";
        String prefixExpr = "+ (3÷2, 1)";
        String postfixExpr = "(3÷2, 1) +";
        MyRationalNumber expected = new MyRationalNumber(5, 2);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testMinusSimple() {
        String infixExpr = "3÷2 - 1÷2";
        String prefixExpr = "- (3÷2, 1÷2)";
        String postfixExpr = "(3÷2, 1÷2) -";
        MyRationalNumber expected = new MyRationalNumber(1);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testRationalMinusIntegerSimple() {
        String infixExpr = "3÷2 - 1";
        String prefixExpr = "- (3÷2, 1)";
        String postfixExpr = "(3÷2, 1) -";
        MyRationalNumber expected = new MyRationalNumber(1, 2);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testTimesSimple() {
        String infixExpr = "3÷2 * 1÷2";
        String prefixExpr = "* (3÷2, 1÷2)";
        String postfixExpr = "(3÷2, 1÷2) *";
        MyRationalNumber expected = new MyRationalNumber(3, 4);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testTimesByZero() {
        RationalParser parser = new RationalParser("3÷2 * 0", calculator);
        assertEquals(new MyRationalNumber(0), parser.evaluate());
    }

    @Test
    void testRationalTimesIntegerSimple() {
        String infixExpr = "3÷2 * 2";
        String prefixExpr = "* (3÷2, 2)";
        String postfixExpr = "(3÷2, 2) *";
        MyRationalNumber expected = new MyRationalNumber(3);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testDivideSimple() {
        String infixExpr = "3÷2 / 1÷2";
        String prefixExpr = "/ (3÷2, 1÷2)";
        String postfixExpr = "(3÷2, 1÷2) /";
        MyRationalNumber expected = new MyRationalNumber(3);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testDivideByZero() {
        RationalParser parser = new RationalParser("3÷2 / 0", calculator);
        assertInstanceOf(MyNotANumber.class, parser.evaluate());
    }

    @Test
    void testRationalDivideIntegerSimple() {
        String infixExpr = "3÷2 / 3";
        String prefixExpr = "/ (3÷2, 3)";
        String postfixExpr = "(3÷2, 3) /";
        MyRationalNumber expected = new MyRationalNumber(1, 2);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testPlusMinus() {
        String infixExpr = "3÷2 + 1÷2 - 1÷2";
        String prefixExpr = "- (+ (3÷2, 1÷2), 1÷2)";
        String postfixExpr = "((3÷2, 1÷2) +, 1÷2) -";
        MyRationalNumber expected = new MyRationalNumber(3, 2);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testTimesDivide() {
        String infixExpr = "3÷2 * 1÷2 / 1÷2";
        String prefixExpr = "/ (* (3÷2, 1÷2), 1÷2)";
        String postfixExpr = "((3÷2, 1÷2) *, 1÷2) /";
        MyRationalNumber expected = new MyRationalNumber(6, 4);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testParentheses() {
        String infixExpr = "(3÷2 + 1÷2) * 1÷2";
        String prefixExpr = "* (+ (3÷2, 1÷2), 1÷2)";
        String postfixExpr = "((3÷2, 1÷2) +, 1÷2) *";
        MyRationalNumber expected = new MyRationalNumber(1);
        equalsExpressionTest(infixExpr, prefixExpr, postfixExpr, expected);
    }

    @Test
    void testComplexExpression() {
        String infixExpr1 = "3÷2 + 1÷2 * 1÷2 - 1÷2";
        String prefixExpr1 = "- (+ (3÷2, * (1÷2, 1÷2)), 1÷2)";
        String postfixExpr1 = "((3÷2, (1÷2, 1÷2) *) +, 1÷2) -";
        MyRationalNumber expected1 = new MyRationalNumber(5, 4);
        equalsExpressionTest(infixExpr1, prefixExpr1, postfixExpr1, expected1);

        String infixExpr2 = "3÷2 + 1÷2 * 1÷2 - 1÷2 + 1÷2";
        String prefixExpr2 = "+ (- (+ (3÷2, * (1÷2, 1÷2)), 1÷2), 1÷2)";
        String postfixExpr2 = "((((1÷2, 1÷2) *, 3÷2) +,1÷2) -, 1÷2) +";
        MyRationalNumber expected2 = new MyRationalNumber(7, 4);
        equalsExpressionTest(infixExpr2, prefixExpr2, postfixExpr2, expected2);

        String infixExpr3 = "-(3÷2 + 1÷2 * 1÷2 - 1÷2)";
        String prefixExpr3 = "-(- (+ (3÷2, * (1÷2, 1÷2)), 1÷2))";
        String postfixExpr3 = "(((3÷2, (1÷2, 1÷2) *) +, 1÷2) -)-";
        MyRationalNumber expected3 = new MyRationalNumber(-5, 4);
        equalsExpressionTest(infixExpr3, prefixExpr3, postfixExpr3, expected3);
    }
}