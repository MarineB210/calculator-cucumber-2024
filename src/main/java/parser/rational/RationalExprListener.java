package parser.rational;
// Generated from /Users/romeoibraimovski/Library/Mobile Documents/com~apple~CloudDocs/Codespace/Java Codespace/calculator-cucumber-2024/src/main/antlr4/Calculator/RationalExpr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RationalExprParser}.
 */
public interface RationalExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RationalExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RationalExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RationalExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(RationalExprParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(RationalExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterParensInfix(RationalExprParser.ParensInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitParensInfix(RationalExprParser.ParensInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterRationalInfix(RationalExprParser.RationalInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitRationalInfix(RationalExprParser.RationalInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivInfix(RationalExprParser.MulDivInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivInfix(RationalExprParser.MulDivInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubInfix(RationalExprParser.AddSubInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubInfix(RationalExprParser.AddSubInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivPrefix(RationalExprParser.MulDivPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivPrefix(RationalExprParser.MulDivPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPrefix(RationalExprParser.AddSubPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPrefix(RationalExprParser.AddSubPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterRationalPrefix(RationalExprParser.RationalPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitRationalPrefix(RationalExprParser.RationalPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterParensPrefix(RationalExprParser.ParensPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitParensPrefix(RationalExprParser.ParensPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivPostfix(RationalExprParser.MulDivPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivPostfix(RationalExprParser.MulDivPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPostfix(RationalExprParser.AddSubPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPostfix(RationalExprParser.AddSubPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterRationalPostfix(RationalExprParser.RationalPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitRationalPostfix(RationalExprParser.RationalPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterParensPostfix(RationalExprParser.ParensPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitParensPostfix(RationalExprParser.ParensPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalNumber}
	 * labeled alternative in {@link RationalExprParser#rational}.
	 * @param ctx the parse tree
	 */
	void enterRationalNumber(RationalExprParser.RationalNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalNumber}
	 * labeled alternative in {@link RationalExprParser#rational}.
	 * @param ctx the parse tree
	 */
	void exitRationalNumber(RationalExprParser.RationalNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link RationalExprParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNumber(RationalExprParser.IntegerNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link RationalExprParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNumber(RationalExprParser.IntegerNumberContext ctx);
}