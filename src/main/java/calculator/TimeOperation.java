package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import visitor.Visitor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class TimeOperation implements Expression {
    /**
     * The list of expressions passed as an argument to the arithmetic operation
     */
    private final List<Expression> args;

    /**
     * The character used to represent the arithmetic operation (e.g. "+", "*")
     */
    protected String symbol;

    /**
     * The neutral element of the time operation
     */
    protected LocalDateTime neutralTime;

    String errorMessage = "Error in counting times";

    /** It is not allowed to construct an operation with a null list of expressions.
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
     * Getter method to return the number of arguments of an arithmetic operation.
     *
     * @return	The number of arguments of the arithmetic operation.
     */
    public List<Expression> getArgs() {
        return args;
    }

    /**
     * Getter method to return the symbol of an arithmetic operation.
     *
     * @return The symbol of the arithmetic operation.
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

    /** Add more parameters to the existing list of parameters
     *
     * @param params	The list of parameters to be added
     */
    public void addMoreParams(List<Expression> params) {
        args.addAll(params);
    }

    /**
     * Accept method to implement the visitor design pattern to traverse arithmetic expressions.
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
