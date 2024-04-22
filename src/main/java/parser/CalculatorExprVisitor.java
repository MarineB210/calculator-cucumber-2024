// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExpr.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CalculatorExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntInfix(CalculatorExprParser.IntInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensInfix(CalculatorExprParser.ParensInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivInfix(CalculatorExprParser.MulDivInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPrefix(CalculatorExprParser.IntPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPostfix(CalculatorExprParser.IntPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx);
}