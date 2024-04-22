package visitor;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.numbers.ComplexNumber;
import calculator.numbers.Expression;
import calculator.numbers.MyNotANumber;
import calculator.numbers.MyNumber;
import calculator.operators.*;
import parser.ComplexNumber.ComplexExprBaseVisitor;
import parser.ComplexNumber.ComplexExprParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Parse for the complex number expressions
 */
public class ComplexParserVisitor  extends ComplexExprBaseVisitor<Expression> {

    private final Calculator c;

    public ComplexParserVisitor(Calculator calculator) {
        this.c = calculator;
    }


    //-------------------- INFIX ----------------------


    /**
     * Visit an infix expression for a number
     *
     * @param ctx the parse tree
     * @return A MyNumber object
     */
    @Override
    public Expression visitIntInfix(ComplexExprParser.IntInfixContext ctx){
        if (ctx.SUB() != null){
            return new MyNumber(-Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
    }

    /**
     * Visit an infix expression for i
     *
     * @param ctx the parse tree
     * @return A complexNumber object
     */
    @Override
    public Expression visitComplexIInfix(ComplexExprParser.ComplexIInfixContext ctx){
        if (ctx.SUB() != null){
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, -1);
            return new ComplexNumber(0, -Double.parseDouble(ctx.NUMBER().getText()));
        }
        else {
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, 1);
            return new ComplexNumber(0, Double.parseDouble(ctx.NUMBER().getText()));
        }
    }

    /**
     * Visit an infix expression for the expression: sqrt(a)
     *
     * @param ctx the parse tree
     * @return The result of the sqrt operation or a MyNotANumber object
     */
    @Override
    public Expression visitSqrtInfix(ComplexExprParser.SqrtInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Sqrt(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression with cis expression
     *
     * @param ctx the parse tree
     * @return The result of the cis operation or a MyNotANumber object
     */
    @Override
    public Expression visitCisInfix(ComplexExprParser.CisInfixContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Cis(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the expression: sqrt(a) + sqrt(b) i
     *
     * @param ctx the parse tree
     * @return A complex number object or a MyNotANumber object
     */
    @Override
    public Expression visitSqrtComplexInfix(ComplexExprParser.SqrtComplexInfixContext ctx){
        Expression number = visit(ctx.infix(0));
        List<Expression> params1= new ArrayList<>();
        params1.add(number);
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params2= new ArrayList<>();
        params2.add(number2);
        try {
            return c.eval(new ComplexNumber(c.eval(new Sqrt(params1)).getReal(), c.eval(new Sqrt(params2)).getReal()));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the expression: e(i*a)
     *
     * @param ctx the parse tree
     * @return The result of the expression with i operator or a MyNotANumber object
     */
    @Override
    public Expression visitExpInfixComplex(ComplexExprParser.ExpInfixComplexContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new ExponentialWithI(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the time or divide of two expressions
     *
     * @param ctx the parse tree
     * @return The result of the  time or divide operation or a MyNotANumber object
     */
    @Override
    public Expression visitComplexMulDivInfix(ComplexExprParser.ComplexMulDivInfixContext ctx){
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the addition or subtraction of two expressions
     *
     * @param ctx the parse tree
     * @return The result of the plus or minus operation or a MyNotANumber object
     */
    @Override
    public Expression visitComplexAddSubInfix(ComplexExprParser.ComplexAddSubInfixContext ctx){
        Expression number1 = visit(ctx.infix(0));
        Expression number2 = visit(ctx.infix(1));
        List<Expression> params = new ArrayList<>();
        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the modulus of an expression
     *
     * @param ctx the parse tree
     * @return The result of the modulus operation or a MyNotANumber object
     */
    @Override
    public Expression visitModulusInfix(ComplexExprParser.ModulusInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Modulus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expressio, inside the parenthesis
     *
     * @param ctx the parse tree
     * @return The result of the expression inside the parenthesis
     */
    @Override
    public Expression visitParensComplexInfix(ComplexExprParser.ParensComplexInfixContext ctx) {
        return visit(ctx.infix());
    }

    /**
     * Visit an infix expression for the conversion of complex number to cartesian form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoCartesianInfix(ComplexExprParser.IntoCartesianInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoCartesianFrom(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the conversion of complex number to polar form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoPolarInfix(ComplexExprParser.IntoPolarInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoPolarForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit an infix expression for the conversion of complex number to exponential form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoExpoInfix(ComplexExprParser.IntoExpoInfixContext ctx){
        Expression number = visit(ctx.infix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoExponentialForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    //-------------------- PREFIX ----------------------


    /**
     * Visit a prefix expression for the expression: sqrt(a) + sqrt(b) i
     *
     * @param ctx the parse tree
     * @return A complex number object or a MyNotANumber object
     */
   @Override
    public Expression visitSqrtComplexPrefix(ComplexExprParser.SqrtComplexPrefixContext ctx){
        Expression number = visit(ctx.prefix(0));
        List<Expression> params1= new ArrayList<>();
        params1.add(number);
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params2= new ArrayList<>();
        params2.add(number2);
        try {
            return c.eval(new ComplexNumber(c.eval(new Sqrt(params1)).getReal(), c.eval(new Sqrt(params2)).getReal()));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the expression: sqrt(a)
     *
     * @param ctx the parse tree
     * @return The result of the sqrt operation or a MyNotANumber object
     */
    @Override
    public Expression visitSqrtPrefix(ComplexExprParser.SqrtPrefixContext ctx){
        Expression number = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Sqrt(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the expression: cis(a)
     *
     * @param ctx the parse tree
     * @return The result of the cis operation or a MyNotANumber object
     */
    @Override
    public Expression visitCisPrefix(ComplexExprParser.CisPrefixContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Cis(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the expression: e(i*a)
     *
     * @param ctx the parse tree
     * @return The result of the expression with i operator or a MyNotANumber object
     */
    @Override
    public Expression visitExpPrefixComplex(ComplexExprParser.ExpPrefixComplexContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new ExponentialWithI(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the time or divide of two expressions
     *
     * @param ctx the parse tree
     * @return The result of the  time or divide operation or a MyNotANumber object
     */
    @Override
    public Expression visitMulDivPrefix(ComplexExprParser.MulDivPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the addition or subtraction of two expressions
     *
     * @param ctx the parse tree
     * @return The result of the plus or minus operation or a MyNotANumber object
     */
    @Override
    public Expression visitAddSubPrefix(ComplexExprParser.AddSubPrefixContext ctx){
        Expression number1 = visit(ctx.prefix(0));
        Expression number2 = visit(ctx.prefix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the modulus of an expression
     *
     * @param ctx the parse tree
     * @return The result of the modulus operation or a MyNotANumber object
     */
    @Override
    public Expression visitModulusPrefix(ComplexExprParser.ModulusPrefixContext ctx){
        Expression number = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Modulus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for a number
     *
     * @param ctx the parse tree
     * @return A MyNumber object
     */
    @Override
    public Expression visitIntPrefix(ComplexExprParser.IntPrefixContext ctx){
        if (ctx.SUB() != null){
            return new MyNumber(-Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
    }


    /**
     * Visit a prefix expression for i
     *
     * @param ctx the parse tree
     * @return A complexNumber object
     */
    @Override
    public Expression visitComplexIPrefix(ComplexExprParser.ComplexIPrefixContext ctx){
        if (ctx.SUB() != null){
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, -1);
            return new ComplexNumber(0, -Double.parseDouble(ctx.NUMBER().getText()));
        }
        else {
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, 1);
            return new ComplexNumber(0, Double.parseDouble(ctx.NUMBER().getText()));
        }
    }

    /**
     * Visit a prefix expression, inside the parenthesis
     *
     * @param ctx the parse tree
     * @return The result of the expression inside the parenthesis
     */
    @Override
    public Expression visitParensComplexPrefix(ComplexExprParser.ParensComplexPrefixContext ctx) {
        return visit(ctx.prefix());
    }

    /**
     * Visit a prefix expression for the conversion of complex number to cartesian form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoCartesianPrefix(ComplexExprParser.IntoCartesianPrefixContext ctx){
        Expression number = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoCartesianFrom(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the conversion of complex number to polar form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoPolarPrefix(ComplexExprParser.IntoPolarPrefixContext ctx){
        Expression number = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoPolarForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a prefix expression for the conversion of complex number to exponential form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoEPrefix(ComplexExprParser.IntoEPrefixContext ctx){
        Expression number = visit(ctx.prefix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoExponentialForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    //-------------------- POSTFIX ----------------------

    /**
     * Visit a postfix expression for a number
     *
     * @param ctx the parse tree
     * @return A MyNumber object
     */
    @Override
    public Expression visitSqrtComplexPostfix(ComplexExprParser.SqrtComplexPostfixContext ctx){
        Expression number = visit(ctx.postfix(0));
        List<Expression> params1= new ArrayList<>();
        params1.add(number);
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params2= new ArrayList<>();
        params2.add(number2);
        try {
            return c.eval(new ComplexNumber(c.eval(new Sqrt(params1)).getReal(), c.eval(new Sqrt(params2)).getReal()));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the expression: sqrt(a)
     *
     * @param ctx the parse tree
     * @return The result of the sqrt operation or a MyNotANumber object
     */
    @Override
    public Expression visitSqrtPostfix(ComplexExprParser.SqrtPostfixContext ctx){
        Expression number = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Sqrt(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the expression: cis(a)
     *
     * @param ctx the parse tree
     * @return The result of the cis operation or a MyNotANumber object
     */
    @Override
    public Expression visitCisPostfix(ComplexExprParser.CisPostfixContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new Cis(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the expression: e(i*a)
     *
     * @param ctx the parse tree
     * @return The result of the expression with i operator or a MyNotANumber object
     */
    @Override
    public Expression visitExpPostfixComplex(ComplexExprParser.ExpPostfixComplexContext ctx){
        Expression number1 = new MyNumber(1.0);
        if (ctx.NUMBER() != null)
            number1 = new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
        Expression number2 = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number1);
        params.add(number2);
        try {
            return c.eval(new ExponentialWithI(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the time or divide of two expressions
     *
     * @param ctx the parse tree
     * @return The result of the  time or divide operation or a MyNotANumber object
     */
    @Override
    public Expression visitMulDivPostfix(ComplexExprParser.MulDivPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.MUL)
                return c.eval(new Times(params));
            return c.eval(new Divides(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the addition or subtraction of two expressions
     *
     * @param ctx the parse tree
     * @return The result of the plus or minus operation or a MyNotANumber object
     */
    @Override
    public Expression visitAddSubPostfix(ComplexExprParser.AddSubPostfixContext ctx){
        Expression number1 = visit(ctx.postfix(0));
        Expression number2 = visit(ctx.postfix(1));
        List<Expression> params = new ArrayList<>();

        Collections.addAll(params, number1, number2);
        try {
            if(ctx.op.getType() == ComplexExprParser.ADD)
                return c.eval(new Plus(params));
            return c.eval(new Minus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the modulus of an expression
     *
     * @param ctx the parse tree
     * @return The result of the modulus operation or a MyNotANumber object
     */
    @Override
    public Expression visitModulusPostfix(ComplexExprParser.ModulusPostfixContext ctx){
        Expression number = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new Modulus(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for a number
     *
     * @param ctx the parse tree
     * @return A MyNumber object
     */
    @Override
    public Expression visitIntPostfix(ComplexExprParser.IntPostfixContext ctx){
        if (ctx.SUB() != null){
            return new MyNumber(-Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new MyNumber(Double.parseDouble(ctx.NUMBER().getText()));
    }

    /**
     * Visit a postfix expression for i
     *
     * @param ctx the parse tree
     * @return A complexNumber object
     */
    @Override
    public Expression visitComplexIPostfix(ComplexExprParser.ComplexIPostfixContext ctx){
        if (ctx.SUB() != null){
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, -1);
            return new ComplexNumber(0, -Double.parseDouble(ctx.NUMBER().getText()));
        }
        else {
            if (ctx.NUMBER() == null)
                return new ComplexNumber(0, 1);
            return new ComplexNumber(0, Double.parseDouble(ctx.NUMBER().getText()));
        }
    }

    /**
     * Visit a postfix expression, inside the parenthesis
     *
     * @param ctx the parse tree
     * @return The result of the expression inside the parenthesis
     */
    @Override
    public Expression visitParensComplexPostfix(ComplexExprParser.ParensComplexPostfixContext ctx) {
        return visit(ctx.postfix());
    }

    /**
     * Visit a postfix expression for the conversion of complex number to cartesian form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoCartesianPostfix(ComplexExprParser.IntoCartesianPostfixContext ctx){
        Expression number = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoCartesianFrom(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the conversion of complex number to polar form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoPolarPostfix(ComplexExprParser.IntoPolarPostfixContext ctx){
        Expression number = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoPolarForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }

    /**
     * Visit a postfix expression for the conversion of complex number to exponential form
     *
     * @param ctx the parse tree
     * @return The result of the conversion or a MyNotANumber object
     */
    @Override
    public Expression visitIntoEPostfix(ComplexExprParser.IntoEPostfixContext ctx){
        Expression number = visit(ctx.postfix());
        List<Expression> params = new ArrayList<>();
        params.add(number);
        try {
            return c.eval(new IntoExponentialForm(params));
        }
        catch (IllegalConstruction e){
            return new MyNotANumber();
        }
    }
}
