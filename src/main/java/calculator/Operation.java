package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Operation is an abstract class that represents arithmetic operations,
 * which are a special kind of Expressions.
 *
 * @see Expression
 */
public abstract class Operation implements Expression
{
	/**
	 * The list of expressions passed as an argument to the arithmetic operation
	 */
	private final List<Expression> args;

  /**
   * The character used to represent the arithmetic operation (e.g. "+", "*")
   */
  protected String symbol;

  /**
   * The neutral element of the operation (e.g. 1 for *, 0 for +)
   */
  protected int neutral;

  /** It is not allowed to construct an operation with a null list of expressions.
   * Note that it is allowed to have an EMPTY list of arguments.
   *
   * @param expressionList	The list of expressions passed as argument to the arithmetic operation
   * @throws IllegalConstruction    Exception thrown if a null list of expressions is passed as argument
   */
  protected /*constructor*/ Operation(List<Expression> expressionList)
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
	 * Abstract method representing the actual binary arithmetic operation to compute
	 * @param l	 first argument of the binary operation
	 * @param r	second argument of the binary operation
	 * @return	result of computing the binary operation
	 */
   public abstract MyNumber op(MyNumber l, MyNumber r);
    // the operation itself is specified in the subclasses

	/**
	 * Method representing the actual unary arithmetic operation to compute
	 * @param l	an argument of the binary operation
	 * @return	result of computing the unary operation
	 */
	public MyNumber op(MyNumber l) {
		return l;
	}

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

		Operation other = (Operation) o;
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
		result = prime * result + neutral;
		result = prime * result + symbol.hashCode();
		result = prime * result + args.hashCode();
		return result;
	}
}
