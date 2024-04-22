package calculator.bool;

import static org.junit.jupiter.api.Assertions.*;

import calculator.BooleanParser;
import calculator.Calculator;

import org.junit.jupiter.api.*;

class TestBooleanParserInfix {

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
        BooleanParser parser = new BooleanParser("0 AND 1", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("1 AND 0", calculator);
        assertEquals(1, parser2.evaluate().getValue());
    }

    @Test
    void TestAnd11(){
        BooleanParser parser = new BooleanParser("1 AND 1", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAnd00(){
        BooleanParser parser = new BooleanParser("0 AND 0", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestOr01(){
        BooleanParser parser = new BooleanParser("0 OR 1", calculator);
        assertEquals(0,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("1 OR 0", calculator);
        assertEquals(0, parser2.evaluate().getValue());
    }

    @Test
    void TestOr11(){
        BooleanParser parser = new BooleanParser("1 OR 1", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestOr00(){
        BooleanParser parser = new BooleanParser("0 OR 0", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImpl01(){
        BooleanParser parser = new BooleanParser("0 IMPL 1", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("1 IMPL 0", calculator);
        assertEquals(0, parser2.evaluate().getValue());
    }

    @Test
    void TestImpl11(){
        BooleanParser parser = new BooleanParser("1 IMPL 1", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImpl00(){
        BooleanParser parser = new BooleanParser("0 IMPL 0", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestXor01(){
        BooleanParser parser = new BooleanParser("0 XOR 1", calculator);
        assertEquals(0,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("1 XOR 0", calculator);
        assertEquals(0,parser2.evaluate().getValue());
    }

    @Test
    void TestXor11(){
        BooleanParser parser = new BooleanParser("1 XOR 1", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestXor00(){
        BooleanParser parser = new BooleanParser("0 XOR 0", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestEq01(){
        BooleanParser parser = new BooleanParser("0 EQ 1", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("1 EQ 0", calculator);
        assertEquals(1,parser2.evaluate().getValue());
    }

    @Test
    void TestEq11(){
        BooleanParser parser = new BooleanParser("1 EQ 1", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestEq00(){
        BooleanParser parser = new BooleanParser("0 EQ 0", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestNotAnd(){
        BooleanParser parser = new BooleanParser("NOT (0 AND 0)", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestNotAnd2(){
        BooleanParser parser = new BooleanParser("NOT 1 AND 0", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestAndOr(){
        BooleanParser parser = new BooleanParser("0 AND 1 OR 0",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestOrImpl(){
        BooleanParser parser = new BooleanParser("1 IMPL 0 OR 0 IMPL 1",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestOrImpl2(){
        BooleanParser parser = new BooleanParser("(1 IMPL 0) OR (0 IMPL 1)",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImplXor(){
        BooleanParser parser = new BooleanParser("1 XOR 0 IMPL 1",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAndImpl(){
        BooleanParser parser = new BooleanParser("(0 IMPL 1) AND (1 IMPL 0)",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAndImpl2(){
        BooleanParser parser = new BooleanParser("0 IMPL 1 AND 1 IMPL 0",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImplEq(){
        BooleanParser parser = new BooleanParser("0 IMPL 1 EQ 1 IMPL 0",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestImplEq2(){
        BooleanParser parser = new BooleanParser("0 IMPL (1 EQ 1) IMPL 0",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }
}
