package calculator.operators;

import calculator.IllegalConstruction;
import calculator.Operation;
import calculator.numbers.ComplexForm;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;

import java.util.List;

public class Cis extends Operation {
    public Cis(List<Expression> expressionList) throws IllegalConstruction {
        super(expressionList);
        symbol = "cis";
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) {
        if (l instanceof MyNotANumber || r instanceof MyNotANumber)
            return new MyNotANumber();
        else{
            ComplexNumber complexNumber=  new ComplexNumber( (l.getReal() * Math.cos(r.getReal())), (l.getReal() * Math.sin(r.getReal())));
            complexNumber.setForm(ComplexForm.POLAR);
            return complexNumber;
        }
    }

    @Override
    public MyNumber op(MyNumber l) {
        return new MyNotANumber();
    }
}
