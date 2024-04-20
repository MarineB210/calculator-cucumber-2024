package visitor;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.numbers.Expression;
import calculator.numbers.MyBool;
import calculator.numbers.MyNotANumber;
import calculator.operators.boolean_operators.*;

import parser.bool.BooleanExprParser;
import parser.bool.BooleanExprBaseVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BooleanParserVisitor extends BooleanExprBaseVisitor<Expression>{

    private final Calculator calculator;

    public BooleanParserVisitor(Calculator calculator){
        this.calculator = calculator;
    }


    //-------------------- INFIX ----------------------

    /**
     * Visit the infix expression inside the parenthesis.
     *
     * @param ctx the parse tree
     * @return the evaluated expression inside the parenthesis.
     */
    @Override
    public Expression visitParensBoolInfix(BooleanExprParser.ParensBoolInfixContext ctx) {
        return visit(ctx.infix());
    }

    /**
     * Visit an infix expression with an equivalence operation.
     *
     * @param ctx the parse tree
     * @return the result of the equivalence operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitEQinfix(BooleanExprParser.EQinfixContext ctx) {
        Expression bool1 = visit(ctx.infix(0));
        Expression bool2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Equals(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression with an OR operation.
     *
     * @param ctx the parse tree
     * @return the result of the OR operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitORinfix(BooleanExprParser.ORinfixContext ctx) {
        Expression bool1 = visit(ctx.infix(0));
        Expression bool2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Or(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression with a XOR operation.
     *
     * @param ctx the parse tree
     * @return the result of the XOR operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitXORinfix(BooleanExprParser.XORinfixContext ctx) {
        Expression bool1 = visit(ctx.infix(0));
        Expression bool2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Xor(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a boolean inside an infix expression.
     *
     * @param ctx the parse tree
     * @return a MyBool instance of the boolean visited or a MyNotANumber instance if the value
     * is greater than 1.
     */
    @Override
    public Expression visitBoolInfix(BooleanExprParser.BoolInfixContext ctx) {
        try {
            return new MyBool(Integer.parseInt(ctx.BOOL().getText()));
        }
        catch (MyBool.InvalidNumberException e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression with a NOT operation.
     *
     * @param ctx the parse tree
     * @return the result of the equivalence operation on the boolean/expression or a MyNotANumber.
     */
    @Override
    public Expression visitNOTinfix(BooleanExprParser.NOTinfixContext ctx){
        Expression bool1 = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1);
        try {
            return calculator.eval(new Not(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression with an implication operation.
     *
     * @param ctx the parse tree
     * @return the result of the implication operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitIMPLinfix(BooleanExprParser.IMPLinfixContext ctx) {
        Expression bool1 = visit(ctx.infix(0));
        Expression bool2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Imply(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression with an AND operation.
     *
     * @param ctx the parse tree
     * @return the result of the AND operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitANDinfix(BooleanExprParser.ANDinfixContext ctx) {
        Expression bool1 = visit(ctx.infix(0));
        Expression bool2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new And(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }


    //-------------------- PREFIX ----------------------

    /**
     * Visit a prefix expression with an AND operation.
     *
     * @param ctx the parse tree
     * @return the result of the AND operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitANDprefix(BooleanExprParser.ANDprefixContext ctx) {
        Expression bool1 = visit(ctx.prefix(0));
        Expression bool2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new And(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }    }

    /**
     * Visit a prefix expression with an OR operation.
     *
     * @param ctx the parse tree
     * @return the result of the OR operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitORprefix(BooleanExprParser.ORprefixContext ctx) {
        Expression bool1 = visit(ctx.prefix(0));
        Expression bool2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Or(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression with an implication operation.
     *
     * @param ctx the parse tree
     * @return the result of the implication operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitIMPLprefix(BooleanExprParser.IMPLprefixContext ctx) {
        Expression bool1 = visit(ctx.prefix(0));
        Expression bool2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Imply(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression with an XOR operation.
     *
     * @param ctx the parse tree
     * @return the result of the XOR operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitXORprefix(BooleanExprParser.XORprefixContext ctx) {
        Expression bool1 = visit(ctx.prefix(0));
        Expression bool2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Xor(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression with an equivalence operation.
     *
     * @param ctx the parse tree
     * @return the result of the equivalence operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitEQprefix(BooleanExprParser.EQprefixContext ctx) {
        Expression bool1 = visit(ctx.prefix(0));
        Expression bool2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Equals(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a boolean inside a prefix expression.
     *
     * @param ctx the parse tree
     * @return a MyBool instance of the boolean visited or a MyNotANumber instance if the value
     * is greater than 1.
     */
    @Override
    public Expression visitBoolPrefix(BooleanExprParser.BoolPrefixContext ctx) {
        try {
            return new MyBool(Integer.parseInt(ctx.BOOL().getText()));
        }
        catch (MyBool.InvalidNumberException e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression with a NOT operation.
     *
     * @param ctx the parse tree
     * @return the result of the equivalence operation on the boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitNOTprefix(BooleanExprParser.NOTprefixContext ctx) {
        Expression bool1 = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1);
        try {
            return calculator.eval(new Not(params));
        } catch (IllegalConstruction e) {
            return new MyNotANumber();

        }
    }

    /**
     * Visit the prefix expression inside the parenthesis.
     *
     * @param ctx the parse tree
     * @return the evaluated expression inside the parenthesis.
     */
    @Override
    public Expression visitParensBoolPrefix(BooleanExprParser.ParensBoolPrefixContext ctx) {
        return visit(ctx.prefix());
    }


    //-------------------- POSTFIX ----------------------


    /**
     * Visit a postfix expression with an AND operation.
     *
     * @param ctx the parse tree
     * @return the result of the AND operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitANDpostfix(BooleanExprParser.ANDpostfixContext ctx) {
        Expression bool1 = visit(ctx.postfix(0));
        Expression bool2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new And(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit the postfix expression inside the parenthesis.
     *
     * @param ctx the parse tree
     * @return the evaluated expression inside the parenthesis.
     */
    @Override
    public Expression visitParensBoolPostfix(BooleanExprParser.ParensBoolPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    /**
     * Visit a postfix expression with a XOR operation.
     *
     * @param ctx the parse tree
     * @return the result of the AND operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitXORpostfix(BooleanExprParser.XORpostfixContext ctx) {
        Expression bool1 = visit(ctx.postfix(0));
        Expression bool2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Xor(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression with an equivalence operation.
     *
     * @param ctx the parse tree
     * @return the result of the equivalence operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitEQpostfix(BooleanExprParser.EQpostfixContext ctx) {
        Expression bool1 = visit(ctx.postfix(0));
        Expression bool2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Equals(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression with an implication operation.
     *
     * @param ctx the parse tree
     * @return the result of the implication operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitIMPLpostfix(BooleanExprParser.IMPLpostfixContext ctx) {
        Expression bool1 = visit(ctx.postfix(0));
        Expression bool2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Imply(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a boolean inside a postfix expression.
     *
     * @param ctx the parse tree
     * @return a MyBool instance of the boolean visited or a MyNotANumber instance if the value
     * is greater than 1.
     */
    @Override
    public Expression visitBoolPostfix(BooleanExprParser.BoolPostfixContext ctx) {
        try {
            return new MyBool(Integer.parseInt(ctx.BOOL().getText()));
        }
        catch (MyBool.InvalidNumberException e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression with a NOT operation.
     *
     * @param ctx the parse tree
     * @return the result of the NOT operation on the boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitNOTpostfix(BooleanExprParser.NOTpostfixContext ctx){
        Expression bool1 = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1);
        try {
            return calculator.eval(new Not(params));
        } catch (IllegalConstruction e) {
            return new MyNotANumber();

        }
    }

    /**
     * Visit a postfix expression with an OR operation.
     *
     * @param ctx the parse tree
     * @return the result of the OR operation on the two boolean/expressions or a MyNotANumber.
     */
    @Override
    public Expression visitORpostfix(BooleanExprParser.ORpostfixContext ctx) {
        Expression bool1 = visit(ctx.postfix(0));
        Expression bool2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, bool1, bool2);
        try {
            return calculator.eval(new Or(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }
}
