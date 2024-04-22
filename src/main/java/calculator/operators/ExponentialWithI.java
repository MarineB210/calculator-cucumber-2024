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
 * Exponential_i is an operator that returns the complex number corresponding to the exponential form of a complex number.
 */
public class ExponentialWithI extends Operation {

    /**
     * Constructor for the Exponential_i class.
     *
     * @param expressionList The list of expressions to be operated on
     * @throws IllegalConstruction If the construction is illegal
     */
    public ExponentialWithI(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "cis";
    }

    /**
     * Method to calculate the complex number corresponding to the exponential form of a complex number.
     *
     * @param l The complex number to be converted to exponential form
     * @param r The complex number to be converted to exponential form
     * @return The complex number corresponding to the exponential form of a complex number
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof MyNotANumber || r instanceof MyNotANumber)
            return new MyNotANumber() ;
        else {
            ComplexNumber complexNumber=  new ComplexNumber(l.getReal() * Math.cos(Math.toRadians(r.getReal())), l.getReal() * Math.sin(Math.toRadians(r.getReal())));
            complexNumber.setForm(ComplexForm.EXPONENTIAL);
            return complexNumber;
        }
    }

    /**
     * Method to calculate the complex number corresponding to the exponential form of a complex number.
     *
     * @param l The complex number to be converted to exponential form
     * @return MyNotANumber
     */
    @Override
    public MyNumber op(MyNumber l) {
        return new MyNotANumber();
    }
}
