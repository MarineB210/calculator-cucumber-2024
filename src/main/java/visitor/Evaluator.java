package visitor;

import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.Operation;
import calculator.numbers.MyTime;

import java.util.ArrayList;

/** Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic and time expressions.
 */
public class Evaluator extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Evaluator() {
        // nothing to be done
    }

    /** The result of the evaluation will be stored in this private variable */
    private MyNumber computedValue;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public MyNumber getResult() {
        return computedValue;
    }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        computedValue = n;
    }


    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    public void visit(Operation o) {
        ArrayList<MyNumber> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedValue);
        }
        //second loop to accumulate all the evaluated sub results
        MyNumber temp = evaluatedArgs.getFirst();
        int max = evaluatedArgs.size();
        if (max == 1) {
            temp = o.op(temp);
        }
        else {
            for(int counter=1; counter<max; counter++) {
                temp = o.op(temp, evaluatedArgs.get(counter));
            }
        }
        // store the accumulated result
        computedValue = temp;
    }

    /** The result of the time evaluation will be stored in this private variable */
    private MyTime computedTimeValue;

    /** getter method to obtain the result of the time evaluation
     *
     * @return a MyTime object containing the result of the evaluation
     */
    public MyTime getTimeResult() {
        return computedTimeValue;
    }

    /** Use the visitor design pattern to visit a time.
     *
     * @param t The time being visited
     */
    public void visit(MyTime t) {
        computedTimeValue = t;
    }

    /** Use the visitor design pattern to visit a TimeOperation
     *
     * @param o The TimeOperation being visited
     */
    public void visit(TimeOperation o) {
        ArrayList<MyTime> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedTimeValue);
        }
        //second loop to accumulate all the evaluated sub results
        MyTime temp = evaluatedArgs.getFirst();
        int max = evaluatedArgs.size();
        for(int counter=1; counter<max; counter++) {
            temp = o.op(temp,evaluatedArgs.get(counter));
        }
        // store the accumulated result
        computedTimeValue = temp;
    }


}
