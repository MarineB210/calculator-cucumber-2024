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
 * Cis is an operator that returns the complex number corresponding to the polar form of a complex number.
 */
public class Cis extends Operation {

    /**
     * Constructor for the Cis class.
     *
     * @param expressionList The list of expressions to be operated on
     * @throws IllegalConstruction If the construction is illegal
     */
    public Cis(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "cis";
    }

    /**
     * Method to calculate the complex number corresponding to the polar form of a complex number.
     *
     * @param l The complex number to be converted to polar form
     * @param r The complex number to be converted to polar form
     * @return The complex number corresponding to the polar form of a complex number
     */
    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof MyNotANumber || r instanceof MyNotANumber)
            return new MyNotANumber();
        else{
            ComplexNumber complexNumber=  new ComplexNumber(l.getReal() * Math.cos(Math.toRadians(r.getReal())), l.getReal() * Math.sin(Math.toRadians(r.getReal())));
            complexNumber.setForm(ComplexForm.POLAR);
            return complexNumber;
        }
    }

    /**
     * Method to calculate the complex number corresponding to the polar form of a complex number.
     *
     * @param l The complex number to be converted to polar form
     * @return MyNotANumber
     */
    @Override
    public MyNumber op(MyNumber l) {
        return new MyNotANumber();
    }
}
