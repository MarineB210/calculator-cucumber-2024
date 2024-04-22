package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.ComplexNumber.*;
import visitor.ComplexParserVisitor;

/**
 * ComplexNumberParser is a class that parses a string and returns the corresponding complex number.
 */
public class ComplexNumberParser {

    public final Calculator c;
    private final ParseTree tree;

    /**
     * Constructor for the ComplexNumberParser class.
     *
     * @param expression The expression to be parsed
     * @param c The calculator to be used
     */
    public ComplexNumberParser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        ComplexExprLexer lexer = new ComplexExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ComplexExprParser parser = new ComplexExprParser(tokens);
        tree = parser.prog();
    }

    /**
     * Method to evaluate the expression and return the corresponding complex number.
     *
     * @return The complex number corresponding to the expression
     */
    public MyNumber evaluate(){
        ComplexParserVisitor visitor = new ComplexParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }
}
