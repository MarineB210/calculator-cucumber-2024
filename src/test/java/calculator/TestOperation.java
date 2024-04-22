package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.operators.Divides;
import calculator.operators.Minus;
import calculator.operators.Plus;
import org.junit.jupiter.api.*;
import visitor.CountingNumbersVisitor;
import visitor.CountingOperationsVisitor;
import visitor.DepthVisitor;

import java.util.Arrays;
import java.util.List;

class TestOperation {

	private Operation o;
	private Operation o2;

	@BeforeEach
	void setUp() throws Exception {
		List<Expression> params1 = Arrays.asList(new MyNumber(3), new MyNumber(4), new MyNumber(5));
		List<Expression> params2 = Arrays.asList(new MyNumber(5), new MyNumber(4));
		List<Expression> params3 = Arrays.asList(new Plus(params1), new Minus(params2), new MyNumber(7));
		o = new Divides(params3);
		o2 = new Divides(params3);
	}

	@Test
	void testEquals() {
		assertEquals(o,o2);
		assertNotEquals(o,null);
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
		assertEquals(Integer.valueOf(6), cv.getValue());
	}

}
