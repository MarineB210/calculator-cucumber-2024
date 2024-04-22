// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/Calculator/ComplexExpr.g4 by ANTLR 4.13.1
package parser.ComplexNumber;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComplexExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComplexExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ComplexExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ComplexExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComplexExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ComplexExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexAddSubInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAddSubInfix(ComplexExprParser.ComplexAddSubInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusInfix(ComplexExprParser.ModulusInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpInfixComplex}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInfixComplex(ComplexExprParser.ExpInfixComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexIInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexIInfix(ComplexExprParser.ComplexIInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntInfix(ComplexExprParser.IntInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexMulDivInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexMulDivInfix(ComplexExprParser.ComplexMulDivInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CisInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCisInfix(ComplexExprParser.CisInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SqrtInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtInfix(ComplexExprParser.SqrtInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoCartesianInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoCartesianInfix(ComplexExprParser.IntoCartesianInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SqrtComplexInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtComplexInfix(ComplexExprParser.SqrtComplexInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensComplexInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensComplexInfix(ComplexExprParser.ParensComplexInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoExpoInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoExpoInfix(ComplexExprParser.IntoExpoInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoPolarInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoPolarInfix(ComplexExprParser.IntoPolarInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SqrtComplexPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtComplexPrefix(ComplexExprParser.SqrtComplexPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtPrefix(ComplexExprParser.SqrtPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cisPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCisPrefix(ComplexExprParser.CisPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPrefixComplex}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPrefixComplex(ComplexExprParser.ExpPrefixComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPrefix(ComplexExprParser.MulDivPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPrefix(ComplexExprParser.AddSubPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusPrefix(ComplexExprParser.ModulusPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexIPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexIPrefix(ComplexExprParser.ComplexIPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPrefix(ComplexExprParser.IntPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensComplexPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensComplexPrefix(ComplexExprParser.ParensComplexPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoCartesianPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoCartesianPrefix(ComplexExprParser.IntoCartesianPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoPolarPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoPolarPrefix(ComplexExprParser.IntoPolarPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoEPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoEPrefix(ComplexExprParser.IntoEPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SqrtComplexPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtComplexPostfix(ComplexExprParser.SqrtComplexPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtPostfix(ComplexExprParser.SqrtPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cisPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCisPostfix(ComplexExprParser.CisPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPostfixComplex}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPostfixComplex(ComplexExprParser.ExpPostfixComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPostfix(ComplexExprParser.MulDivPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubPostfix(ComplexExprParser.AddSubPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusPostfix(ComplexExprParser.ModulusPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexIPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexIPostfix(ComplexExprParser.ComplexIPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntPostfix(ComplexExprParser.IntPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensComplexPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensComplexPostfix(ComplexExprParser.ParensComplexPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoCartesianPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoCartesianPostfix(ComplexExprParser.IntoCartesianPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoPolarPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoPolarPostfix(ComplexExprParser.IntoPolarPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntoEPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoEPostfix(ComplexExprParser.IntoEPostfixContext ctx);
}