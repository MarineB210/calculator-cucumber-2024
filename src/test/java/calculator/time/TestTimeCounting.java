package calculator.time;


import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import calculator.operators.time.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.CountingNumbersVisitor;
import visitor.CountingOperationsVisitor;
import visitor.DepthVisitor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestTimeCounting {

    private Expression e;
    private MyTime time1, time2;

    @BeforeEach
    void setUp() {
        time1 = new MyTime(8, 30, 0);
        time2 = new MyTime(6, 15, 0);
        e = null;
    }

    @Test
    void testTimeCounting() {
        e = time1;
        CountingNumbersVisitor cvNumbers = new CountingNumbersVisitor();
        CountingOperationsVisitor cvOperations = new CountingOperationsVisitor();
        DepthVisitor cvDepth = new DepthVisitor();
        //test whether a time has zero depth (i.e. no nested expressions)
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
    @ValueSource(strings = {"+","-"})
    void testTimeOperationCounting(String symbol) {
        List<Expression> params = Arrays.asList(time1,time2);
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	e = new Plus(params);
                case "-"	->	e = new Minus(params);
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
        //test whether a binary operation has depth 1
        CountingNumbersVisitor cvNumbers = new CountingNumbersVisitor();
        CountingOperationsVisitor cvOperations = new CountingOperationsVisitor();
        DepthVisitor cvDepth = new DepthVisitor();
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
