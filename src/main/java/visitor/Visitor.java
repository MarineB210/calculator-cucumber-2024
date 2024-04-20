package visitor;

import calculator.TimeOperation;
import calculator.numbers.MyNumber;
import calculator.Operation;
import calculator.numbers.MyTime;

/**
 * Visitor design pattern
 */
public abstract class Visitor {
    /**
     * Constructor for the Visitor class
     */
    protected Visitor() {}

    /**
     * The Visitor can traverse a number (a subtype of Expression)
     *
     * @param n The number being visited
     */
    public abstract void visit(MyNumber n);

    /**
     * The Visitor can traverse a time (a subtype of Expression)
     *
     * @param t The time being visited
     */   public abstract void visit(MyTime t);

    /**
     * The Visitor can traverse an operation (a subtype of Expression)
     *
     * @param o The operation being visited
     */   public abstract void visit(Operation o);

    /**
     * The Visitor can traverse a time operation (a subtype of Expression)
     *
     * @param o The time operation being visited
     */   public abstract void visit(TimeOperation o);
}
