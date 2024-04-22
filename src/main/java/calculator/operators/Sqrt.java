package calculator.operators;

import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

import java.util.List;
/**
 * This class represents the square root operation
 *
 * @see Operation
 */
public class Sqrt extends Operation {

    /**
     * Class constructor specifying a number of Expressions to add,
     * as well as the Notation used to represent the operation.
     *
     * @param expressionList The list of Expressions to add
     * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
     * @see #Sqrt(List)
     * @see Operation#Operation(List)
     */
    public Sqrt(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "sqrt";
    }

    /**
     * The actual computation of the (binary) arithmetic addition of two integers.
     * If either of the numbers is a MyNotANumber instance, the method returns a new MyNotANumber instance.
     *
     * @param l The first number.
     * @param r The second number that should be added to the first.
     * @return The result of the addition, or a new MyNotANumber if either input number is a MyNotANumber.
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        return new MyNotANumber();
    }


    /**
     * The actual computation of the (unary) arithmetic addition of two integers.
     * If the number is a MyNotANumber instance, the method returns a new MyNotANumber instance.
     *
     * @param l The number.
     * @return The result of the addition, or a new MyNotANumber if the input number is a MyNotANumber.
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof MyNotANumber || l instanceof ComplexNumber){
            return new MyNotANumber();
        }
        int num = l.getValue();
        if (num<0){
            num=  -1 * num;
            return new ComplexNumber(0, Math.sqrt(num));
        }
        return new MyNumber(Math.sqrt(num));
    }
}
