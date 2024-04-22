// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExpr.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorExprParser}.
 */
public interface CalculatorExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CalculatorExprParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CalculatorExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterIntInfix(CalculatorExprParser.IntInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitIntInfix(CalculatorExprParser.IntInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterParensInfix(CalculatorExprParser.ParensInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitParensInfix(CalculatorExprParser.ParensInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivInfix(CalculatorExprParser.MulDivInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivInfix(CalculatorExprParser.MulDivInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubInfix(CalculatorExprParser.AddSubInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivPrefix(CalculatorExprParser.MulDivPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPrefix(CalculatorExprParser.AddSubPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterIntPrefix(CalculatorExprParser.IntPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitIntPrefix(CalculatorExprParser.IntPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterParensPrefix(CalculatorExprParser.ParensPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link CalculatorExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitParensPrefix(CalculatorExprParser.ParensPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivPostfix(CalculatorExprParser.MulDivPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPostfix(CalculatorExprParser.AddSubPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterIntPostfix(CalculatorExprParser.IntPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitIntPostfix(CalculatorExprParser.IntPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterParensPostfix(CalculatorExprParser.ParensPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link CalculatorExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitParensPostfix(CalculatorExprParser.ParensPostfixContext ctx);
}