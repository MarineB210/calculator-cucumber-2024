// Generated from /home/marinebodson/Documents/Ecole/MASTER1/Software-Evol/calculator-cucumber-2024/src/main/antlr4/Calculator/BooleanExpr.g4 by ANTLR 4.13.1
package parser.bool;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BooleanExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BooleanExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BooleanExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BooleanExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(BooleanExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensBoolInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensBoolInfix(BooleanExprParser.ParensBoolInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQinfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQinfix(BooleanExprParser.EQinfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTinfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTinfix(BooleanExprParser.NOTinfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORinfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORinfix(BooleanExprParser.ORinfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XORinfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXORinfix(BooleanExprParser.XORinfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolInfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolInfix(BooleanExprParser.BoolInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPLinfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPLinfix(BooleanExprParser.IMPLinfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANDinfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDinfix(BooleanExprParser.ANDinfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTprefix(BooleanExprParser.NOTprefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANDprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDprefix(BooleanExprParser.ANDprefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORprefix(BooleanExprParser.ORprefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPLprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPLprefix(BooleanExprParser.IMPLprefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XORprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXORprefix(BooleanExprParser.XORprefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQprefix(BooleanExprParser.EQprefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolPrefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPrefix(BooleanExprParser.BoolPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensBoolPrefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensBoolPrefix(BooleanExprParser.ParensBoolPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANDpostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDpostfix(BooleanExprParser.ANDpostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTpostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTpostfix(BooleanExprParser.NOTpostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensBoolPostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensBoolPostfix(BooleanExprParser.ParensBoolPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XORpostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXORpostfix(BooleanExprParser.XORpostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQpostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQpostfix(BooleanExprParser.EQpostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPLpostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPLpostfix(BooleanExprParser.IMPLpostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolPostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPostfix(BooleanExprParser.BoolPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORpostfix}
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORpostfix(BooleanExprParser.ORpostfixContext ctx);
}