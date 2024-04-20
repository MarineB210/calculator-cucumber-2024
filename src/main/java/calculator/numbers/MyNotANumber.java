package calculator.numbers;

/**
 * MyNotANumber is a class that extends MyNumber.
 * It represents a non-numeric value (NaN) in the context of the calculator.
 *
 * @see MyNumber
 *
 */
public class MyNotANumber extends MyNumber{

    /**
     * Constructor method for a MyNotANumber object.
     */
    public MyNotANumber() {
        super(0);
    }

    /**
     * Convert a MyNotANumber into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return "NaN";
    }
}