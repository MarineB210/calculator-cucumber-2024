package calculator.bool;

import calculator.BooleanParser;
import calculator.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBooleanParserPrefix {

    private Calculator calculator;

    @BeforeEach
    public void doBefore(){
        calculator = new Calculator();
    }

    @Test
    void TestNumber(){
        BooleanParser parser = new BooleanParser("1",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestNot(){
        BooleanParser parser = new BooleanParser("NOT 0", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("NOT 1", calculator);
        assertEquals(0, parser2.evaluate().getValue());
    }

    @Test
    void TestAnd01(){
        BooleanParser parser = new BooleanParser("AND (0, 1)", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("AND (1, 0)", calculator);
        assertEquals(1, parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("AND (1 0)", calculator);
        assertEquals(1, parser3.evaluate().getValue());
    }

    @Test
    void TestAnd11(){
        BooleanParser parser = new BooleanParser("AND (1, 1)", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAnd00(){
        BooleanParser parser = new BooleanParser("AND (0, 0)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestOr01(){
        BooleanParser parser = new BooleanParser("OR (0, 1)", calculator);
        assertEquals(0,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("OR (1, 0)", calculator);
        assertEquals(0, parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("OR (1 0)", calculator);
        assertEquals(0, parser3.evaluate().getValue());
    }

    @Test
    void TestOr11(){
        BooleanParser parser = new BooleanParser("OR (1, 1)", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestOr00(){
        BooleanParser parser = new BooleanParser("OR (0, 0)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImpl01(){
        BooleanParser parser = new BooleanParser("IMPL (0, 1)", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("IMPL (1, 0)", calculator);
        assertEquals(0, parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("IMPL (1 0)", calculator);
        assertEquals(0, parser3.evaluate().getValue());
    }

    @Test
    void TestImpl11(){
        BooleanParser parser = new BooleanParser("IMPL (1, 1)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImpl00(){
        BooleanParser parser = new BooleanParser("IMPL (0, 0)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestXor01(){
        BooleanParser parser = new BooleanParser("XOR (0, 1)", calculator);
        assertEquals(0,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("XOR (1, 0)", calculator);
        assertEquals(0,parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("XOR (1 0)", calculator);
        assertEquals(0,parser3.evaluate().getValue());
    }

    @Test
    void TestXor11(){
        BooleanParser parser = new BooleanParser("XOR (1, 1)", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestXor00(){
        BooleanParser parser = new BooleanParser("XOR (0, 0)", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestEq01(){
        BooleanParser parser = new BooleanParser("EQ (0, 1)", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("EQ (1, 0)", calculator);
        assertEquals(1,parser2.evaluate().getValue());
    }

    @Test
    void TestEq11(){
        BooleanParser parser = new BooleanParser("EQ (1, 1)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestEq00(){
        BooleanParser parser = new BooleanParser("EQ (0, 0)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestNotAnd(){
        BooleanParser parser = new BooleanParser("NOT (AND (0, 0))", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestNotAnd2(){
        BooleanParser parser = new BooleanParser("AND (NOT 1 , 0)", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestAndOr(){
        BooleanParser parser = new BooleanParser("OR (AND (0, 1), 0)",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestOrImpl(){
        BooleanParser parser = new BooleanParser("IMPL (IMPL (1, (OR (0, 0))), 1)",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestOrImpl2(){
        BooleanParser parser = new BooleanParser("OR (IMPL (1 ,0), IMPL (0,1))",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImplXor(){
        BooleanParser parser = new BooleanParser("XOR (1, IMPL (0, 1))",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAndImpl(){
        BooleanParser parser = new BooleanParser("AND ( IMPL (0, 1) , IMPL (1, 0))",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAndImpl2(){
        BooleanParser parser = new BooleanParser("IMPL ( IMPL (0, AND (1, 1)), 0) ",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImplEq(){
        BooleanParser parser = new BooleanParser("EQ ( IMPL (0, 1), IMPL (1, 0))",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestImplEq2(){
        BooleanParser parser = new BooleanParser(" IMPL (IMPL (0, EQ (1, 1)), 0)",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }
}
