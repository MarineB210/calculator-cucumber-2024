package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.numbers.MyTime;
import visitor.Evaluator;


/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate expressions.
 *
 * @author tommens
 */
public class Calculator {

    /**
     * Default constructor of the class.
     * Does nothing since the class does not have any variables that need to be initialised.
     */
    public Calculator() {
        // Nothing to be done
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public MyNumber eval(Expression e) {
        // create a new visitor to evaluate expressions
        Evaluator v = new Evaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);
        // and return the result of the evaluation at the end of the process
        return v.getResult();
    }

    /**
     * Evaluates a time expression and returns its result
     * @param e the time Expression to be evaluated
     * @return The result of the evaluation
     */
    public MyTime timeEval(Expression e){
        Evaluator v = new Evaluator();
        e.accept(v);
        return v.getTimeResult();
    }
}
