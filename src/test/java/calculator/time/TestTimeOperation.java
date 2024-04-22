package calculator.time;

import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import calculator.operators.time.Plus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import visitor.CountingNumbersVisitor;
import visitor.CountingOperationsVisitor;
import visitor.DepthVisitor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTimeOperation {

    private TimeOperation o;
    private TimeOperation o2;

    @BeforeEach
    void setup() throws Exception{
        List<Expression> params1 = List.of(new MyTime(3, 0, 0), new  MyTime(0, 1, 0));
        List<Expression> params2 = List.of(new MyTime(5, 0, 0), new MyTime(4, 0, 30));
        List<Expression> params3 = List.of(new Plus(params1), new Plus(params2), new MyTime(3, 29, 0));
        o = new Plus(params3);
        o2 = new Plus(params3);
    }

    @Test
    void testEquals() {
        assertEquals(o, o2);
    }

    @Test
    void testCountDepth() {
        DepthVisitor cv = new DepthVisitor();
        o.accept(cv);
        assertEquals(2, cv.getValue());
    }

    @Test
    void testCountOps() {
        CountingOperationsVisitor cv = new CountingOperationsVisitor();
        o.accept(cv);
        assertEquals(3, cv.getValue());
    }

    @Test
    void testCountNbs() {
        CountingNumbersVisitor cv = new CountingNumbersVisitor();
        o.accept(cv);
        assertEquals(Integer.valueOf(5), cv.getValue());
    }
}
