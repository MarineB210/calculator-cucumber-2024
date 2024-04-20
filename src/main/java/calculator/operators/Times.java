package calculator.operators;

import calculator.Operation;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.IllegalConstruction;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

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
   * The actual computation of the (binary) arithmetic multiplication of two integers.
   * If either of the numbers is a MyNotANumber instance, the method returns a new MyNotANumber instance.
   *
   * @param l The first number.
   * @param r The second number that should be multiplied to the first.
   * @return The result of the multiplication, or a new MyNotANumber if either input number is a MyNotANumber.
   */
  public MyNumber op(MyNumber l, MyNumber r) {
    if (l instanceof MyNotANumber || r instanceof MyNotANumber)
        return new MyNotANumber();
    if (l instanceof ComplexNumber || r instanceof ComplexNumber){
        return new ComplexNumber(l.getReal() * r.getReal() - l.getImaginary() * r.getImaginary(), l.getReal() * r.getImaginary() + l.getImaginary() * r.getReal());
    }
    return new MyNumber( (double) l.getValue() * r.getValue());
  }

 }
