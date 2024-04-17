package calculator.operators;

import calculator.*;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

import java.util.List;

/** This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Plus
 * @see Times
 * @see Divides
 */
public final class Minus extends Operation
 {
     public static final OperatorType type = OperatorType.BINARY;

  /**
   * Class constructor specifying a number of Expressions to subtract,
   * as well as the Notation used to represent the operation.
   *
   * @param expressionList The list of Expressions to subtract
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Minus(List)
   * @see Operation#Operation(List)
   */
  public Minus(List<Expression> expressionList) throws IllegalConstruction {
  	super(expressionList);
  	symbol = "-";
  	neutral = 0;
  }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two integers.
     * If either of the numbers is a MyNotANumber instance, the method returns a new MyNotANumber instance.
     *
     * @param l The first number.
     * @param r The second number that should be subtracted from the first.
     * @return The result of the subtraction, or a new MyNotANumber if either input number is a MyNotANumber.
     */
  public MyNumber op(MyNumber l, MyNumber r) {
    if (l instanceof MyNotANumber || r instanceof MyNotANumber)
        return new MyNotANumber();
    return new MyNumber(l.getValue() - r.getValue());
  }

     @Override
     public OperatorType getType(){
         return type;
     }
}
