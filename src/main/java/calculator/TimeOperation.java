package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import visitor.Visitor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TimeOperation is an abstract class that represents time operations,
 * which are a special kind of Expressions, just like times are.
 *
 * @see Expression
 * @see MyTime
 */
public abstract class TimeOperation implements Expression {
    /**
     * The list of expressions passed as an argument to the time operation
     */
    private final List<Expression> args;

    /**
     * The character used to represent the time operation (e.g. "+", "*")
     */
    protected String symbol;

    /**
     * The neutral element of the time operation
     */
    protected LocalDateTime neutralTime;

    /** It is not allowed to construct a TimeOperation with a null list of expressions.
     * Note that it is allowed to have an EMPTY list of arguments.
     *
     * @param expressionList	The list of expressions passed as argument to the arithmetic operation
     * @throws IllegalConstruction    Exception thrown if a null list of expressions is passed as argument
     */
    protected /*constructor*/ TimeOperation(List<Expression> expressionList)
            throws IllegalConstruction
    {
        if (expressionList == null) {
            throw new IllegalConstruction(); }
        else {
            args = new ArrayList<>(expressionList);
        }
    }

    /**
     * Getter method to return the number of arguments of a time operation.
     *
     * @return	The number of arguments of the time operation.
     */
    public List<Expression> getArgs() {
        return args;
    }

    /**
     * Getter method to return the symbol of a time operation.
     *
     * @return The symbol of the time operation.
     */
    public String getSymbol(){
        return symbol;
    }

    /**
     * Abstract method representing the actual binary time operation to compute
     * @param l	 first argument of the time operation
     * @param r	second argument of the time operation
     * @return	result of computing the time operation
     */
    public abstract MyTime op(MyTime l, MyTime r);
    // the operation itself is specified in the subclasses

    /**
     * Accept method to implement the visitor design pattern to traverse time expressions.
     * Each operation will delegate the visitor to each of its arguments expressions,
     * and will then pass itself to the visitor object to get processed by the visitor object.
     *
     * @param v	The visitor object
     */

    public void accept(Visitor v) {
        v.visit(this);
    }

    /**
     * Two operation objects are equal if their list of arguments is equal, and they correspond to the same operation.
     *
     * @param o	The object to compare with
     * @return	The result of the equality comparison
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) return false; // No object should be equal to null

        if (this == o) return true; // If it's the same object, they're obviously equal

        if (getClass() != o.getClass()) return false; // getClass() instead of instanceof() because an addition is not the same as a multiplication

        TimeOperation other = (TimeOperation) o;
        return this.args.equals(other.getArgs());
    }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
    @Override
    public int hashCode() {
        int result = 5;
        int prime = 31;
        result = prime * result + neutralTime.hashCode();
        result = prime * result + symbol.hashCode();
        result = prime * result + args.hashCode();
        return result;
    }
}
