package calculator.numbers;

import visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions.
 *
 * @see Expression
 */
public class MyNumber implements Expression
{
  private final double value;

    /** getter method to obtain the value contained in the object
     *
     * @return The floating number contained in the object
     */
  public Integer getValue() {
      return (int) value;
  }

    /**
     * Constructor method
     *
     * @param v The floating value to be contained in the object
     */
    public /*constructor*/ MyNumber(double v) {
        value=v;
	  }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v	The visitor object
     */
  public void accept(Visitor v) {
      v.visit(this);
  }


  /**
   * Getter method to obtain the real part of the complex number
   *
   * @return The floating number that represents the real part of the complex number
   */
  public double getReal() {
      return this.value;
  }

  /**
   * Getter method to obtain the imaginary part of the complex number
   *
   * @return The floating number that represents the imaginary part of the complex number
   */
  public double getImaginary() {
      return 0;
  }

  /**
   * Convert a number into a String to allow it to be printed.
   *
   * @return	The String that is the result of the conversion.
   */
  @Override
  public String toString() {
	  return Integer.toString((int) value);
  }

  /** Two MyNumber expressions are equal if the values they contain are equal
   *
   * @param o The object to compare to
   * @return  A boolean representing the result of the equality test
   */
  @Override
  public boolean equals(Object o) {
      // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
      if (o == null) return false;

      // If the object is compared to itself then return true
      if (o == this) {
          return true;
      }

      // If the object is of another type then return false
      if (!(o instanceof MyNumber)) {
            return false;
      }
      return (int) this.value == (int) ((MyNumber)o).value;
      // Used == since the contained value is a primitive value
      // If it had been a Java object, .equals() would be needed
  }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
  @Override
  public int hashCode() {
		return (int) value;
  }

}
