package calculator.operators;

import calculator.*;
import calculator.numbers.*;

import java.util.List;

/** This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends Operation {

    /**
     * Class constructor specifying a number of Expressions to divide,
     * as well as the notation used to represent the operation.
     *
     * @param expressionList The list of Expressions to divide
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Divides(List)
     * @see Operation#Operation(List)
     */
  public Divides(List<Expression> expressionList) throws IllegalConstruction {
	super(expressionList);
	symbol = "/";
	neutral = 1;
  }

/**
   * The actual computation of the (binary) arithmetic division of two integers.
   * If either of the numbers is a MyNotANumber instance or the second number is zero,
   * the method returns a new MyNotANumber instance.
   *
   * @param l The first number.
   * @param r The second number that the first number should be divided by.
   * @return The result of the division, or a new MyNotANumber if either input number is a MyNotANumber or the second number is zero.
   */
  public MyNumber op(MyNumber l, MyNumber r) {
      if (l instanceof MyNotANumber || r instanceof MyNotANumber || r.getValue() == 0 && r.getImaginary() == 0)
          return new MyNotANumber();
      if (l instanceof ComplexNumber || r instanceof ComplexNumber) {
          double denominator = r.getReal() * r.getReal() + r.getImaginary() * r.getImaginary();
          double real = (l.getReal() * r.getReal() + l.getImaginary() * r.getImaginary()) / denominator;
          double imaginary = (l.getImaginary() * r.getReal() - l.getReal() * r.getImaginary()) / denominator;
          return new ComplexNumber(real, imaginary);

      }
      return new MyNumber((double) l.getValue() / r.getValue());
  }

}
