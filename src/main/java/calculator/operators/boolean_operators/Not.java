package calculator.operators.boolean_operators;

import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.Expression;
import calculator.numbers.MyBool;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Not extends Operation {

    private final Map<String, Boolean> dictionary = new HashMap<>();

    /**
     * Class constructor specifying a number of Expressions to apply the NOT operation on,
     * as well as the notation used to represent the operation.
     *
     * @param expressionList The list of Expressions to divide
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Not(List)
     * @see Not#Not(List)
     */
    public Not(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        dictionary.put("0", Boolean.TRUE);
        dictionary.put("1", Boolean.FALSE);
        symbol = "NOT";
        neutral = 0;
    }

    /**
     * The actual computation of the (unary) boolean NOT operation.
     * If the number is a MyNotANumber instance, the method returns a new MyNotANumber instance.
     * If the number is different from 0 or 1, the method throws and catch an InvalidNumberException and returns a new
     * MyNotANumber instance.
     *
     * @param l The number.
     * @return The result of the NOT operation, or a new MyNotANumber if the input number is a MyNotANumber or the
     * number is greater than 1.
     */
    @Override
    public MyNumber op(MyNumber l){
        if (l instanceof MyNotANumber)
            return new MyNotANumber();
        try {
            if (l.getValue() > 1){
                throw new MyBool.InvalidNumberException("Invalid number entered. Number should be either 0 or 1.");
            }
            return new MyBool(dictionary.get(l.toString()) == Boolean.TRUE ? 1 : 0);
        }
        catch (MyBool.InvalidNumberException exception){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.info(exception.getMessage());
            return new MyNotANumber();
        }
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.info("Not is an unary operator, keeping only the first number");
        return op(l);
    }
}
