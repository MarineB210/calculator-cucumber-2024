package calculator.operators;

import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.ComplexForm;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

import java.util.List;

/**
 * IntoCartesianFrom is an operator that returns the complex number corresponding to the cartesian form of a complex number.
 */
public class IntoCartesianFrom extends Operation{

    /**
     * Constructor for the IntoCartesianFrom class.
     *
     * @param expressionList The list of expressions to be operated on
     * @throws IllegalConstruction If the construction is illegal
     */
    public IntoCartesianFrom(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "intoCartesianFrom";
    }

    /**
     * Method to calculate the complex number corresponding to the cartesian form of a complex number.
     *
     * @param l The complex number to be converted to cartesian form
     * @param r The complex number to be converted to cartesian form
     * @return MyNotANumber
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        return new MyNotANumber();
    }

    /**
     * Method to calculate the complex number corresponding to the cartesian form of a complex number.
     *
     * @param l The complex number to be converted to cartesian form
     * @return The complex number corresponding to the cartesian form of a complex number
     */
    @Override
    public MyNumber op(MyNumber l) {
        if (l instanceof ComplexNumber){
            ((ComplexNumber) l).setForm(ComplexForm.CARTESIAN);
            return l;
        }
        return new MyNotANumber();
    }
}
