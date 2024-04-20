package visitor;

import calculator.Operation;
import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.numbers.MyTime;

import java.util.ArrayList;

/**
 * Visitor that counts the number of operations in an expression such as an Operation or a TimeOperation.
 * @see Visitor
 * @see Operation
 * @see TimeOperation
 */
public class CountingOperationsVisitor extends Visitor{

    private int value;

    /**
     * Getter for the value of the number of operations.
     * @return the number of operations.
     */
    public int getValue() {
        return value;
    }

    /**
     * Visits a number and sets the value to 0.
     * @param n the number to visit.
     */
    public void visit(MyNumber n){
        value = 0;
    }

    /**
     * Visits a time and sets the value to 0.
     * @param t the time to visit.
     */
    public void visit(MyTime t){
        value = 0;
    }

    /**
     * Visits an operation and sets the value to 1 plus the number of operations of its arguments.
     * @param o the operation to visit.
     */
    public void visit(Operation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = 1 + i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();
    }

    /**
     * Visits a time operation and sets the value to 1 plus the number of operations of its arguments.
     * @param o the time operation to visit.
     */
    public void visit(TimeOperation o){
        ArrayList<Integer> i = new ArrayList<>();
        for(Expression e : o.getArgs()) {
            e.accept(this);
            i.add(getValue());
        }
        value = 1 + i.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
