package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import parser.CalculatorExprLexer;
import parser.CalculatorExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.ParserVisitor;

/**
 * This class is the parser used by the calculator to evaluate the arithmetic expressions
 */
public class Parser {

    public final Calculator c;
    private final ParseTree tree;

    /**
     * This constructor creates a parser for the arithmetic expression
     * @param expression the expression to parse
     * @param c the calculator used to evaluate the expression
     */
    public Parser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        CalculatorExprLexer lexer = new CalculatorExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorExprParser parser = new CalculatorExprParser(tokens);
        tree = parser.prog();
    }

    /**
     * This method evaluates the expression using the visitor design pattern
     * and returns its result
     * @return the result of the expression
     */
    public MyNumber evaluate(){
        ParserVisitor visitor = new ParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }
}