package calculator.operators.time;

import calculator.IllegalConstruction;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNotATime;
import calculator.numbers.MyTime;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public final class Plus extends TimeOperation {
    /**
     * Class constructor specifying a number of Expressions to add,
     * as well as the Notation used to represent the operation.
     *
     * @param expressionList The list of Expressions to add
     * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
     * @see #Plus(List)
     */
    public Plus(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "+";
        neutralTime = LocalDateTime.of(0,1,1,0,0);
    }

    /**
     * The actual computation of the time addition of two times.
     * If either of the times is a MyNotATime instance, the method returns a new MyNotATime instance.
     *
     * @param l The first time.
     * @param r The second time that should be added to the first.
     * @return The result of the addition, or a new MyNotATime if either input number is a MyNotATime.
     */
    public MyTime op(MyTime l, MyTime r) {
        if (l.getTime().isBefore(neutralTime) || r.getTime().isBefore(neutralTime) ||
                l instanceof MyNotATime || r instanceof MyNotATime)
            return new MyNotATime();
        Duration duration = Duration.between(neutralTime, r.getTime());
        LocalDateTime result = l.getTime().plus(duration);
        return new MyTime(result.getYear(), result.getMonthValue(), result.getDayOfMonth(),
                result.getHour(), result.getMinute(), result.getSecond());
    }
}
