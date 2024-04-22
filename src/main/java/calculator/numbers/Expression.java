package calculator.numbers;

import calculator.Operation;
import calculator.TimeOperation;
import visitor.Visitor;

/**
 * Expression is an interface that represents the expressions supported by the calculator.
 * It has multiple implementations such as MyNumber, Operation, MyTime, TimeOperation, MyBool,....
 *
 * @see MyNumber
 * @see Operation
 * @see MyTime
 * @see TimeOperation
 * @see MyBool
 */
public interface Expression {
   /**
    * accept is a method needed to implement the visitor design pattern
    *
    * @param v The visitor object being passed as a parameter
    */
   void accept(Visitor v);
}
