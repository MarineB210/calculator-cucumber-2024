package parser.rational;
// Generated from /Users/romeoibraimovski/Library/Mobile Documents/com~apple~CloudDocs/Codespace/Java Codespace/calculator-cucumber-2024/src/main/antlr4/Calculator/RationalExpr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RationalExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RationalExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RationalExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RationalExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RationalExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(RationalExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensInfix(RationalExprParser.ParensInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalInfix(RationalExprParser.RationalInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivInfix(RationalExprParser.MulDivInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubInfix}
	 * labeled alternative in {@link RationalExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubInfix(RationalExprParser.AddSubInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPrefix(RationalExprParser.MulDivPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPrefix(RationalExprParser.AddSubPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalPrefix(RationalExprParser.RationalPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPrefix}
	 * labeled alternative in {@link RationalExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPrefix(RationalExprParser.ParensPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPostfix(RationalExprParser.MulDivPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPostfix(RationalExprParser.AddSubPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalPostfix(RationalExprParser.RationalPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensPostfix}
	 * labeled alternative in {@link RationalExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensPostfix(RationalExprParser.ParensPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalNumber}
	 * labeled alternative in {@link RationalExprParser#rational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalNumber(RationalExprParser.RationalNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerNumber}
	 * labeled alternative in {@link RationalExprParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumber(RationalExprParser.IntegerNumberContext ctx);
}