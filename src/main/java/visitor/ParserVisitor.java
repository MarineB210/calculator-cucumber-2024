package visitor;

import calculator.*;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import parser.CalculatorExprBaseVisitor;
import parser.CalculatorExprParser;

import java.util.*;

/**
 * This class is a visitor that will parse the input string and create the corresponding expression tree
 * for an arithmetic expression.
 * It will also evaluate the expression tree and return the result.
 */
public class ParserVisitor extends CalculatorExprBaseVisitor<Expression> {
    private final Calculator c;

    public ParserVisitor(Calculator calculator) {
        this.c = calculator;
    }

    //-------------------- INFIX ----------------------

    /**
     * This method will visit the infix expression inside the parenthesis
     * and return the result of the infix expression.
     * @param ctx the parensInfix context
     * @return the evaluated expression inside the parenthesis
     */
    @Override
    public Expression visitParensInfix(CalculatorExprParser.ParensInfixContext ctx){
        return visit(ctx.infix());
    }

    /**
     * This method will visit and return the result of the infix expression.
     * @param ctx the intInfix context
     * @return the evaluated expression
     */
    @Override
    public Expression visitIntInfix(CalculatorExprParser.IntInfixContext ctx){
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    /**
     * This method will visit and return the result of the infix multiplication or division expression.
     * @param ctx the mulDivInfix context
     * @return the evaluated multiplication or division expression
     */
    @Override
    public Expression visitMulDivInfix(CalculatorExprParser.MulDivInfixContext ctx) {
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.DIV)
                return c.eval(new Divides(params));
            return c.eval(new Times(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * This method will visit and return the result of the infix addition or subtraction expression.
     * @param ctx the addSubInfix context
     * @return the evaluated addition or subtraction expression
     */
    @Override
    public Expression visitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx){
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.infix().size() == 1){
                return visit(ctx.infix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }



    //-------------------- PREFIX ----------------------

    /**
     * This method will visit the prefix expression inside the parenthesis
     * and return the result of the prefix expression.
     * @param ctx the parensPrefix context
     * @return the evaluated expression inside the parenthesis
     */
    @Override
    public Expression visitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx){
        return visit(ctx.prefix());
    }

    /**
     * This method will visit and return the result of the prefix expression.
     * @param ctx the intPrefix context
     * @return the evaluated expression
     */
    @Override
    public Expression visitIntPrefix(CalculatorExprParser.IntPrefixContext ctx){
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    /**
     * This method will visit and return the result of the prefix multiplication or division expression.
     * @param ctx the mulDivPrefix context
     * @return the evaluated multiplication or division expression
     */
    @Override
    public Expression visitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.prefix().size(); i++) {
            params.add(visit(ctx.prefix(i)));
        }
        try {
            if(ctx.prefix().size() == 1){
                return visit(ctx.prefix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * This method will visit and return the result of the prefix addition or subtraction expression.
     * @param ctx the addSubPrefix context
     * @return the evaluated addition or subtraction expression
     */
    @Override
    public Expression visitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.prefix().size(); i++) {
            params.add(visit(ctx.prefix(i)));
        }
        try {
            if(ctx.prefix().size() == 1){
                return visit(ctx.prefix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }


    //-------------------- POSTFIX ----------------------

    /**
     * This method will visit the postfix expression inside the parenthesis
     * @param ctx the parensPostfix context
     * @return the evaluated expression inside the parenthesis
     */
    @Override
    public Expression visitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    /**
     * This method will visit and return the result of the postfix expression.
     * @param ctx the intPostfix context
     * @return the evaluated expression
     */
    @Override
    public Expression visitIntPostfix(CalculatorExprParser.IntPostfixContext ctx) {
        if(ctx.SUB() != null){
            return new MyNumber(-Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new MyNumber(Integer.parseInt(ctx.NUMBER().getText()));
    }

    /**
     * This method will visit and return the result of the postfix multiplication or division expression.
     * @param ctx the mulDivPostfix context
     * @return the evaluated multiplication or division expression
     */
    @Override
    public Expression visitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.postfix().size(); i++) {
            params.add(visit(ctx.postfix(i)));
        }
        try {
            if(ctx.postfix().size() == 1){
                return visit(ctx.postfix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * This method will visit and return the result of the postfix addition or subtraction expression.
     * @param ctx the addSubPostfix context
     * @return the evaluated addition or subtraction expression
     */
    @Override
    public Expression visitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        for (int i = 2; i < ctx.postfix().size(); i++) {
            params.add(visit(ctx.postfix(i)));
        }
        try {
            if(ctx.postfix().size() == 1){
                return visit(ctx.postfix(0));
            }
            if(ctx.op.getType() == CalculatorExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }
}