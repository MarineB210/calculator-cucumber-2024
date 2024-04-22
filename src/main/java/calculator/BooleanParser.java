package calculator;

import calculator.numbers.Expression;
import calculator.numbers.MyNumber;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.bool.*;

import visitor.BooleanParserVisitor;

public class BooleanParser {

    public final Calculator c;
    private final ParseTree tree;

    /**
     * This is the constructor of the class
     * @param expression a string who represent the expression
     */
    public BooleanParser(String expression, Calculator c){
        this.c = c;
        CharStream input = CharStreams.fromString(expression);
        BooleanExprLexer lexer = new BooleanExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BooleanExprParser parser = new BooleanExprParser(tokens);
        tree = parser.prog();
    }

    /**
     * This method evaluate the expression
     * @return the result of the expression
     */
    public MyNumber evaluate(){
        BooleanParserVisitor visitor = new BooleanParserVisitor(c);
        Expression e = visitor.visit(tree);
        return c.eval(e);
    }

}
