package calculator;

import java.util.List;

/** This class represents the arithmetic multiplication operation "*".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Plus
 * @see Divides
 */
public final class Times extends Operation
 {

  /**
   * Class constructor specifying a number of Expressions to multiply,
   * as well as the Notation used to represent the operation.
   *
   * @param expressionList The list of Expressions to multiply
   * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
   * @see #Times(List)
   * @see Operation#Operation(List)
   */
  public Times(List<Expression> expressionList) throws IllegalConstruction {
  	super(expressionList);
  	symbol = "*";
  	neutral = 1;
  }

  /**
   * The actual computation of the (binary) arithmetic multiplication of two integers
   * @param l The first integer
   * @param r The second integer that should be multiplied with the first
   * @return The integer that is the result of the multiplication
   */
  public int op(int l, int r)
    { return (l*r); }
}
