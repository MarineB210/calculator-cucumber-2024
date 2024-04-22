package visitor;

import calculator.Operation;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.numbers.MyTime;

import java.util.ArrayList;

/**
 * Visitor that counts the number of basic units such as numbers or times
 * in an expression.
 * @see Visitor
 * @see MyNumber
 * @see MyTime
 */
public class CountingNumbersVisitor extends Visitor{

    private int value;

    /**
     * Getter for the value of the number of basic units.
     * @return the number of basic units.
     */
    public int getValue() {
        return value;
    }

    /**
     * Visits a number and sets the value to 1.
     * @param n the number to visit.
     */
    public void visit(MyNumber n){
        value = 1;
    }

    /**
     * Visits a time and sets the value to 1.
     * @param t the time to visit.
     */
    public void visit(MyTime t){
        value = 1;
    }

    /**
     * Visits an operation and sets the value to the sum of the number of numbers of its arguments.
     * @param o the operation to visit.
     */
    public void visit(Operation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();

    }

    /**
     * Visits a time operation and sets the value to the sum of the number of times of its arguments.
     * @param o the time operation to visit.
     */
    public void visit(TimeOperation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();

    }
}
