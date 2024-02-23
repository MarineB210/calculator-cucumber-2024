package calculator;

import java.util.List;

/** This class represents the arithmetic sum operation "+".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Times
 * @see Divides
 */
public final class Plus extends Operation
 {

  /**
   * Class constructor specifying a number of Expressions to add,
   * as well as the Notation used to represent the operation.
   *
   * @param expressionList The list of Expressions to add
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Plus(List)
   * @see Operation#Operation(List)
   */
  public Plus(List<Expression> expressionList) throws IllegalConstruction {
  	super(expressionList);
  	symbol = "+";
  	neutral = 0;
  }

  /**
   * The actual computation of the (binary) arithmetic addition of two integers.
   * If either of the numbers is a MyNotANumber instance, the method returns a new MyNotANumber instance.
   *
   * @param l The first number.
   * @param r The second number that should be added to the first.
   * @return The result of the addition, or a new MyNotANumber if either input number is a MyNotANumber.
   */
  public MyNumber op(MyNumber l, MyNumber r) {
    if (l instanceof MyNotANumber || r instanceof MyNotANumber)
        return new MyNotANumber();
    return new MyNumber(l.getValue() + r.getValue());
  }
}
