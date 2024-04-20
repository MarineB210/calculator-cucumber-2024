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
import java.util.Objects;
import java.util.logging.Logger;

public class Xor extends Operation {

    private final Map<String, Boolean> dictionary = new HashMap<>();

    /**
     * Class constructor specifying a number of Expressions to apply the XOR operation on,
     * as well as the notation used to represent the operation.
     *
     * @param expressionList The list of Expressions
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Xor(List)
     * @see Operation#Operation(List)
     */
    public Xor(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        dictionary.put("0", Boolean.TRUE);
        dictionary.put("1", Boolean.FALSE);
        symbol = "XOR";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) boolean XOR operation of two boolean.
     * If either of the numbers is a MyNotANumber instance, the method returns a new MyNotANumber instance.
     * If either of the numbers is different from 0 or 1, the method throws and catch an InvalidNumberException and returns a new
     * MyNotANumber instance.
     *
     * @param l The first number.
     * @param r The second number.
     * @return The result of the XOR operation, or a new MyNotANumber if either input number is a MyNotANumber or either
     * number is greater than 1.
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof MyNotANumber || r instanceof MyNotANumber)
            return new MyNotANumber();
        try {
            if (l.getValue() > 1 || r.getValue() > 1){
                throw new MyBool.InvalidNumberException("Invalid number entered. Number should be either 0 or 1.");
            }
            boolean value = Objects.equals(dictionary.get(l.toString()), dictionary.get(r.toString()));
            return new MyBool(value ? 1 : 0);
        }
        catch (MyBool.InvalidNumberException exception){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.info(exception.getMessage());
            return new MyNotANumber();
        }
    }

}
