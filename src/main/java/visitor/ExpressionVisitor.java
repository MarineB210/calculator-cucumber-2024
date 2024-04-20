package visitor;

import calculator.TimeOperation;
import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import calculator.Notation;
import calculator.Operation;
import calculator.numbers.MyTime;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/** ExpressionVisitor is a concrete visitor that serves to
 * compute the expression string matching the notation of arithmetic and time expressions.
 */
public class ExpressionVisitor extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public ExpressionVisitor() {
        // Nothing to be done
    }

    /** The expression will be stored in this private variable */
    private String expression;
    /** The notation used will be stored in this private variable */
    private Notation notation;

    String errorMessage = "No expression found";

    /** Getter method to obtain the expression
     *
     * @return a String object containing the expression
     */
    public String getExpression() { return expression; }

    /** Setter method to set the notation
     * @param notation The notation to be used
     */
    public void setNotation(calculator.Notation notation) {
        this.notation = notation;
    }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        expression = n.toString();
    }

    /** Use the visitor design pattern to visit a time.
     *
     * @param t The time being visited
     */
    public void visit(MyTime t) {
        expression = t.toString();
    }

    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    public void visit(Operation o) {
        ArrayList<String> s = new ArrayList<>();
        for(Expression a:o.getArgs()) {
            a.accept(this);
            s.add(expression);
        }
        Stream<String> stream = s.stream();
        Optional<String> optional;
        switch (notation) {
            case INFIX :
                optional = stream.reduce((s1, s2) -> s1 + " " + o.getSymbol() + " " + s2);
                if (optional.isPresent()) {
                    expression = "( " + optional.get() + " )";
                } else {
                    throw new IllegalStateException(errorMessage);
                }
                break;
            case PREFIX :
                optional = stream.reduce((s1, s2) -> s1 + ", " + s2);
                if (optional.isPresent()) {
                    expression = o.getSymbol() + " " + "(" + optional.get() + ")";
                } else {
                    throw new IllegalStateException(errorMessage);
                }
                break;
            case POSTFIX :
                optional = stream.reduce((s1, s2) -> s1 + ", " + s2);
                if (optional.isPresent()) {
                    expression = "(" + optional.get() + ")" + " " + o.getSymbol();
                } else {
                    throw new IllegalStateException(errorMessage);
                }
                break;
        }
    }

    /** Use the visitor design pattern to visit a TimeOperation
     *
     * @param o The TimeOperation being visited
     */
    public void visit(TimeOperation o){
        ArrayList<String> s = new ArrayList<>();
        for(Expression a:o.getArgs()) {
            a.accept(this);
            s.add(expression);
        }
        Stream<String> stream = s.stream();
        Optional<String> optional;
        switch (notation) {
            case INFIX :
                optional = stream.reduce((s1, s2) -> s1 + " " + o.getSymbol() + " " + s2);
                if (optional.isPresent()) {
                    expression = "( " + optional.get() + " )";
                } else {
                    throw new IllegalStateException(errorMessage);
                }
                break;
            case PREFIX :
                optional = stream.reduce((s1, s2) -> s1 + ", " + s2);
                if (optional.isPresent()) {
                    expression = o.getSymbol() + " " + "(" + optional.get() + ")";
                } else {
                    throw new IllegalStateException(errorMessage);
                }
                break;
            case POSTFIX :
                optional = stream.reduce((s1, s2) -> s1 + ", " + s2);
                if (optional.isPresent()) {
                    expression = "(" + optional.get() + ")" + " " + o.getSymbol();
                } else {
                    throw new IllegalStateException(errorMessage);
                }
                break;
        }
    }
}
