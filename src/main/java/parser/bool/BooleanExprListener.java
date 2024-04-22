// Generated from /home/marinebodson/Documents/Ecole/MASTER1/Software-Evol/calculator-cucumber-2024/src/main/antlr4/Calculator/BooleanExpr.g4 by ANTLR 4.13.1
package parser.bool;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanExprParser}.
 */
public interface BooleanExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BooleanExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BooleanExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(BooleanExprParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(BooleanExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensBoolInfix}
	 * @param ctx the parse tree
	 */
	void enterParensBoolInfix(BooleanExprParser.ParensBoolInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensBoolInfix}
	 * @param ctx the parse tree
	 */
	void exitParensBoolInfix(BooleanExprParser.ParensBoolInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQinfix}
	 * @param ctx the parse tree
	 */
	void enterEQinfix(BooleanExprParser.EQinfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQinfix}
	 * @param ctx the parse tree
	 */
	void exitEQinfix(BooleanExprParser.EQinfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTinfix}
	 * @param ctx the parse tree
	 */
	void enterNOTinfix(BooleanExprParser.NOTinfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTinfix}
	 * @param ctx the parse tree
	 */
	void exitNOTinfix(BooleanExprParser.NOTinfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORinfix}
	 * @param ctx the parse tree
	 */
	void enterORinfix(BooleanExprParser.ORinfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORinfix}
	 * @param ctx the parse tree
	 */
	void exitORinfix(BooleanExprParser.ORinfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XORinfix}
	 * @param ctx the parse tree
	 */
	void enterXORinfix(BooleanExprParser.XORinfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XORinfix}
	 * @param ctx the parse tree
	 */
	void exitXORinfix(BooleanExprParser.XORinfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolInfix}
	 * @param ctx the parse tree
	 */
	void enterBoolInfix(BooleanExprParser.BoolInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolInfix}
	 * @param ctx the parse tree
	 */
	void exitBoolInfix(BooleanExprParser.BoolInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPLinfix}
	 * @param ctx the parse tree
	 */
	void enterIMPLinfix(BooleanExprParser.IMPLinfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPLinfix}
	 * @param ctx the parse tree
	 */
	void exitIMPLinfix(BooleanExprParser.IMPLinfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDinfix}
	 * @param ctx the parse tree
	 */
	void enterANDinfix(BooleanExprParser.ANDinfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDinfix}
	 * @param ctx the parse tree
	 */
	void exitANDinfix(BooleanExprParser.ANDinfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterNOTprefix(BooleanExprParser.NOTprefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitNOTprefix(BooleanExprParser.NOTprefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterANDprefix(BooleanExprParser.ANDprefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitANDprefix(BooleanExprParser.ANDprefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterORprefix(BooleanExprParser.ORprefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitORprefix(BooleanExprParser.ORprefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPLprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterIMPLprefix(BooleanExprParser.IMPLprefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPLprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitIMPLprefix(BooleanExprParser.IMPLprefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XORprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterXORprefix(BooleanExprParser.XORprefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XORprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitXORprefix(BooleanExprParser.XORprefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterEQprefix(BooleanExprParser.EQprefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQprefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitEQprefix(BooleanExprParser.EQprefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolPrefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterBoolPrefix(BooleanExprParser.BoolPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolPrefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitBoolPrefix(BooleanExprParser.BoolPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensBoolPrefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterParensBoolPrefix(BooleanExprParser.ParensBoolPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensBoolPrefix}
	 * labeled alternative in {@link BooleanExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitParensBoolPrefix(BooleanExprParser.ParensBoolPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDpostfix}
	 * @param ctx the parse tree
	 */
	void enterANDpostfix(BooleanExprParser.ANDpostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDpostfix}
	 * @param ctx the parse tree
	 */
	void exitANDpostfix(BooleanExprParser.ANDpostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTpostfix}
	 * @param ctx the parse tree
	 */
	void enterNOTpostfix(BooleanExprParser.NOTpostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTpostfix}
	 * @param ctx the parse tree
	 */
	void exitNOTpostfix(BooleanExprParser.NOTpostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensBoolPostfix}
	 * @param ctx the parse tree
	 */
	void enterParensBoolPostfix(BooleanExprParser.ParensBoolPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensBoolPostfix}
	 * @param ctx the parse tree
	 */
	void exitParensBoolPostfix(BooleanExprParser.ParensBoolPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XORpostfix}
	 * @param ctx the parse tree
	 */
	void enterXORpostfix(BooleanExprParser.XORpostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XORpostfix}
	 * @param ctx the parse tree
	 */
	void exitXORpostfix(BooleanExprParser.XORpostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQpostfix}
	 * @param ctx the parse tree
	 */
	void enterEQpostfix(BooleanExprParser.EQpostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQpostfix}
	 * @param ctx the parse tree
	 */
	void exitEQpostfix(BooleanExprParser.EQpostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPLpostfix}
	 * @param ctx the parse tree
	 */
	void enterIMPLpostfix(BooleanExprParser.IMPLpostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPLpostfix}
	 * @param ctx the parse tree
	 */
	void exitIMPLpostfix(BooleanExprParser.IMPLpostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolPostfix}
	 * @param ctx the parse tree
	 */
	void enterBoolPostfix(BooleanExprParser.BoolPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolPostfix}
	 * @param ctx the parse tree
	 */
	void exitBoolPostfix(BooleanExprParser.BoolPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORpostfix}
	 * @param ctx the parse tree
	 */
	void enterORpostfix(BooleanExprParser.ORpostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORpostfix}
	 * @param ctx the parse tree
	 */
	void exitORpostfix(BooleanExprParser.ORpostfixContext ctx);
}