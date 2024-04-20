package parser.time;// Generated from /Users/sam/Documents/MA1/Software Evo/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExprTime.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorExprTimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorExprTimeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorExprTimeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorExprTimeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorExprTimeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CalculatorExprTimeParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensInfix(CalculatorExprTimeParser.ParensInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateInfix(CalculatorExprTimeParser.DateInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeInfix(CalculatorExprTimeParser.TimeInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfix(CalculatorExprTimeParser.AddSubInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPrefix(CalculatorExprTimeParser.AddSubPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timePrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePrefix(CalculatorExprTimeParser.TimePrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datePrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatePrefix(CalculatorExprTimeParser.DatePrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPrefix(CalculatorExprTimeParser.ParensPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPostfix(CalculatorExprTimeParser.AddSubPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timePostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePostfix(CalculatorExprTimeParser.TimePostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datePostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatePostfix(CalculatorExprTimeParser.DatePostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPostfix(CalculatorExprTimeParser.ParensPostfixContext ctx);
}