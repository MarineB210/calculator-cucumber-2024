package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.rational.RationalExprLexer;
import parser.rational.RationalExprParser;
import visitor.RationalParserVisitor;

public class RationalParser {

    public final Calculator c;
    private final ParseTree tree;

    /**
     * This is the constructor of the class
     * @param expression a string who represent the expression
     */
    public RationalParser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        RationalExprLexer lexer = new RationalExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RationalExprParser parser = new RationalExprParser(tokens);
        tree = parser.prog();
    }

    /**
     * This method evaluate the expression
     * @return the result of the expression
     */
    public MyNumber evaluate(){
        RationalParserVisitor visitor = new RationalParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }
}