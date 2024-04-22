package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyTime;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.time.CalculatorExprTimeLexer;
import parser.time.CalculatorExprTimeParser;
import visitor.TimeParserVisitor;

/**
 * TimeParser is a  class that is used to parse an expression
 * formed with time operations.
 */
public class TimeParser {
    public final Calculator c;
    private final ParseTree tree;

    /**
     * This constructor creates a parser for the time expression
     * @param expression the expression to parse
     * @param c the calculator used to evaluate the expression
     */
    public TimeParser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        CalculatorExprTimeLexer lexer = new CalculatorExprTimeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorExprTimeParser parser = new CalculatorExprTimeParser(tokens);
        tree = parser.prog();
    }

    /**
        * This method evaluates the expression using the visitor design pattern
        * and returns its result
        * @return the result of the expression
        */
    public MyTime evaluate(){
        TimeParserVisitor visitor = new TimeParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.timeEval(e);
    }
}
