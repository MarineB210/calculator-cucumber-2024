package calculator.bool;

import calculator.BooleanParser;
import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBooleanParserPostfix {

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
        BooleanParser parser = new BooleanParser("0 NOT", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("1 NOT", calculator);
        assertEquals(0, parser2.evaluate().getValue());
    }

    @Test
    void TestAnd01(){
        BooleanParser parser = new BooleanParser("(0, 1) AND", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("(1, 0) AND", calculator);
        assertEquals(1, parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("(1 0) AND", calculator);
        assertEquals(1, parser3.evaluate().getValue());
    }

    @Test
    void TestAnd11(){
        BooleanParser parser = new BooleanParser("(1, 1) AND", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAnd00(){
        BooleanParser parser = new BooleanParser("(0, 0) AND", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestOr01(){
        BooleanParser parser = new BooleanParser("(0, 1) OR", calculator);
        assertEquals(0,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("(1, 0) OR", calculator);
        assertEquals(0, parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("(1 0) OR", calculator);
        assertEquals(0, parser3.evaluate().getValue());
    }

    @Test
    void TestOr11(){
        BooleanParser parser = new BooleanParser("(1, 1) OR", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestOr00(){
        BooleanParser parser = new BooleanParser("(0, 0) OR", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImpl01(){
        BooleanParser parser = new BooleanParser("(0, 1) IMPL", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("(1, 0) IMPL", calculator);
        assertEquals(0, parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("(1 0) IMPL", calculator);
        assertEquals(0, parser3.evaluate().getValue());
    }

    @Test
    void TestImpl11(){
        BooleanParser parser = new BooleanParser("(1, 1) IMPL", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImpl00(){
        BooleanParser parser = new BooleanParser("(0, 0) IMPL", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestXor01(){
        BooleanParser parser = new BooleanParser("(0, 1) XOR", calculator);
        assertEquals(0,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("(1, 0) XOR", calculator);
        assertEquals(0,parser2.evaluate().getValue());

        BooleanParser parser3 = new BooleanParser("(1 0) XOR", calculator);
        assertEquals(0,parser3.evaluate().getValue());
    }

    @Test
    void TestXor11(){
        BooleanParser parser = new BooleanParser("(1, 1) XOR", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestXor00(){
        BooleanParser parser = new BooleanParser("(0, 0) XOR", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestEq01(){
        BooleanParser parser = new BooleanParser("(0, 1) EQ", calculator);
        assertEquals(1,parser.evaluate().getValue());

        BooleanParser parser2 = new BooleanParser("(1, 0) EQ", calculator);
        assertEquals(1,parser2.evaluate().getValue());
    }

    @Test
    void TestEq11(){
        BooleanParser parser = new BooleanParser("(1, 1) EQ", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestEq00(){
        BooleanParser parser = new BooleanParser("(0, 0) EQ", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestNotAnd(){
        BooleanParser parser = new BooleanParser("((0, 0) AND) NOT", calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestNotAnd2(){
        BooleanParser parser = new BooleanParser("(1 NOT, 0) AND", calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestAndOr(){
        BooleanParser parser = new BooleanParser("((0, 1) AND, 0) OR",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestOrImpl(){
        BooleanParser parser = new BooleanParser("(((1, (0, 0) OR) IMPL), 1) IMPL",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestOrImpl2(){
        BooleanParser parser = new BooleanParser("((1 ,0) IMPL, (0,1) IMPL) OR",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImplXor(){
        BooleanParser parser = new BooleanParser("(1, (0, 1) IMPL) XOR",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAndImpl(){
        BooleanParser parser = new BooleanParser("((0, 1) IMPL , (1, 0) IMPL) AND",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestAndImpl2(){
        BooleanParser parser = new BooleanParser("((0, (1, 1) AND) IMPL, 0) IMPL",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }

    @Test
    void TestImplEq(){
        BooleanParser parser = new BooleanParser("((0, 1) IMPL, (1, 0) IMPL) EQ",calculator);
        assertEquals(1,parser.evaluate().getValue());
    }

    @Test
    void TestImplEq2(){
        BooleanParser parser = new BooleanParser("((0, (1, 1) EQ) IMPL, 0) IMPL",calculator);
        assertEquals(0,parser.evaluate().getValue());
    }
}
