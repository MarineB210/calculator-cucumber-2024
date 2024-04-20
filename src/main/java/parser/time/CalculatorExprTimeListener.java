package parser.time;// Generated from /Users/sam/Documents/MA1/Software Evo/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExprTime.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorExprTimeParser}.
 */
public interface CalculatorExprTimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorExprTimeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorExprTimeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorExprTimeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorExprTimeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorExprTimeParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CalculatorExprTimeParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorExprTimeParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CalculatorExprTimeParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterParensInfix(CalculatorExprTimeParser.ParensInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitParensInfix(CalculatorExprTimeParser.ParensInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterDateInfix(CalculatorExprTimeParser.DateInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitDateInfix(CalculatorExprTimeParser.DateInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterTimeInfix(CalculatorExprTimeParser.TimeInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitTimeInfix(CalculatorExprTimeParser.TimeInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubInfix(CalculatorExprTimeParser.AddSubInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubInfix(CalculatorExprTimeParser.AddSubInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPrefix(CalculatorExprTimeParser.AddSubPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPrefix(CalculatorExprTimeParser.AddSubPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timePrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterTimePrefix(CalculatorExprTimeParser.TimePrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timePrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitTimePrefix(CalculatorExprTimeParser.TimePrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datePrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterDatePrefix(CalculatorExprTimeParser.DatePrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datePrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitDatePrefix(CalculatorExprTimeParser.DatePrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterParensPrefix(CalculatorExprTimeParser.ParensPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link CalculatorExprTimeParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitParensPrefix(CalculatorExprTimeParser.ParensPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPostfix(CalculatorExprTimeParser.AddSubPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPostfix(CalculatorExprTimeParser.AddSubPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timePostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterTimePostfix(CalculatorExprTimeParser.TimePostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timePostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitTimePostfix(CalculatorExprTimeParser.TimePostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datePostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterDatePostfix(CalculatorExprTimeParser.DatePostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datePostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitDatePostfix(CalculatorExprTimeParser.DatePostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterParensPostfix(CalculatorExprTimeParser.ParensPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link CalculatorExprTimeParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitParensPostfix(CalculatorExprTimeParser.ParensPostfixContext ctx);
}