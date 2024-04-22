package calculator;

//Import Junit5 libraries for unit testing:
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.operators.Divides;
import calculator.operators.Minus;
import calculator.operators.Plus;
import calculator.operators.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.CountingNumbersVisitor;
import visitor.CountingOperationsVisitor;
import visitor.DepthVisitor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


class TestCounting {

    private int value1, value2;
    private Expression e;

    @BeforeEach
    void setUp() {
        value1 = 8;
        value2 = 6;
        e = null;
    }

    @Test
    void testNumberCounting() {
        e = new MyNumber(value1);
        CountingNumbersVisitor cvNumbers = new CountingNumbersVisitor();
        CountingOperationsVisitor cvOperations = new CountingOperationsVisitor();
        DepthVisitor cvDepth = new DepthVisitor();
        //test whether a number has zero depth (i.e. no nested expressions)
        e.accept(cvDepth);
        assertEquals( 0, cvDepth.getValue());
        //test whether a number contains zero operations
        e.accept(cvOperations);
        assertEquals(0, cvOperations.getValue());
        //test whether a number contains 1 number
        e.accept(cvNumbers);
        assertEquals(1, cvNumbers.getValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testOperationCounting(String symbol) {
        List<Expression> params = Arrays.asList(new MyNumber(value1),new MyNumber(value2));
        //Operation op = null;
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	e = new Plus(params);
                case "-"	->	e = new Minus(params);
                case "*"	->	e = new Times(params);
                case "/"	->	e = new Divides(params);
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
        CountingNumbersVisitor cvNumbers = new CountingNumbersVisitor();
        CountingOperationsVisitor cvOperations = new CountingOperationsVisitor();
        DepthVisitor cvDepth = new DepthVisitor();
        //test whether a binary operation has depth 1
        e.accept(cvDepth);
        assertEquals(1, cvDepth.getValue(),"counting depth of an Operation");
        //test whether a binary operation contains 1 operation
        e.accept(cvOperations);
        assertEquals(1, cvOperations.getValue());
        //test whether a binary operation contains 2 numbers
        e.accept(cvNumbers);
        assertEquals(2, cvNumbers.getValue());
    }

}
