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
   * The actual computation of the (binary) arithmetic addition of two integers
   * @param l The first integer
   * @param r The second integer that should be added to the first
   * @return The integer that is the result of the addition
   */
  public int op(int l, int r) {
  	return (l+r);
  }
}
