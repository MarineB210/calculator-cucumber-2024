package calculator.numbers;

/**
 * MyNotATime is a class that extends MyTime.
 * It represents a non-time value (NaT) in the context of the calculator.
 *
 * @see MyTime
 */
public class MyNotATime extends MyTime {

    /**
     * Default constructor.
     */
    public MyNotATime() {
        super(0, 1, 1, 0, 0, 0);
    }

    /**
     * Convert a NaT into a String to allow it to be printed.
     *
     * @return The string "NaT".
     */
    @Override
    public String toString() {
        return "NaT";
    }
}
