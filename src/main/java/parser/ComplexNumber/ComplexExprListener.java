// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/Calculator/ComplexExpr.g4 by ANTLR 4.13.1
package parser.ComplexNumber;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComplexExprParser}.
 */
public interface ComplexExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComplexExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ComplexExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ComplexExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComplexExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ComplexExprParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComplexExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ComplexExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexAddSubInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterComplexAddSubInfix(ComplexExprParser.ComplexAddSubInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexAddSubInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitComplexAddSubInfix(ComplexExprParser.ComplexAddSubInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterModulusInfix(ComplexExprParser.ModulusInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitModulusInfix(ComplexExprParser.ModulusInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpInfixComplex}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterExpInfixComplex(ComplexExprParser.ExpInfixComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpInfixComplex}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitExpInfixComplex(ComplexExprParser.ExpInfixComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexIInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterComplexIInfix(ComplexExprParser.ComplexIInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexIInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitComplexIInfix(ComplexExprParser.ComplexIInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterIntInfix(ComplexExprParser.IntInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitIntInfix(ComplexExprParser.IntInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexMulDivInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterComplexMulDivInfix(ComplexExprParser.ComplexMulDivInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexMulDivInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitComplexMulDivInfix(ComplexExprParser.ComplexMulDivInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CisInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterCisInfix(ComplexExprParser.CisInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CisInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitCisInfix(ComplexExprParser.CisInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterSqrtInfix(ComplexExprParser.SqrtInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitSqrtInfix(ComplexExprParser.SqrtInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoCartesianInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterIntoCartesianInfix(ComplexExprParser.IntoCartesianInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoCartesianInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitIntoCartesianInfix(ComplexExprParser.IntoCartesianInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtComplexInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterSqrtComplexInfix(ComplexExprParser.SqrtComplexInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtComplexInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitSqrtComplexInfix(ComplexExprParser.SqrtComplexInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensComplexInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterParensComplexInfix(ComplexExprParser.ParensComplexInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensComplexInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitParensComplexInfix(ComplexExprParser.ParensComplexInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoExpoInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterIntoExpoInfix(ComplexExprParser.IntoExpoInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoExpoInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitIntoExpoInfix(ComplexExprParser.IntoExpoInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoPolarInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void enterIntoPolarInfix(ComplexExprParser.IntoPolarInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoPolarInfix}
	 * labeled alternative in {@link ComplexExprParser#infix}.
	 * @param ctx the parse tree
	 */
	void exitIntoPolarInfix(ComplexExprParser.IntoPolarInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtComplexPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterSqrtComplexPrefix(ComplexExprParser.SqrtComplexPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtComplexPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitSqrtComplexPrefix(ComplexExprParser.SqrtComplexPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterSqrtPrefix(ComplexExprParser.SqrtPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitSqrtPrefix(ComplexExprParser.SqrtPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cisPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterCisPrefix(ComplexExprParser.CisPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cisPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitCisPrefix(ComplexExprParser.CisPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPrefixComplex}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpPrefixComplex(ComplexExprParser.ExpPrefixComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPrefixComplex}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpPrefixComplex(ComplexExprParser.ExpPrefixComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivPrefix(ComplexExprParser.MulDivPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivPrefix(ComplexExprParser.MulDivPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPrefix(ComplexExprParser.AddSubPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPrefix(ComplexExprParser.AddSubPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterModulusPrefix(ComplexExprParser.ModulusPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitModulusPrefix(ComplexExprParser.ModulusPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexIPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterComplexIPrefix(ComplexExprParser.ComplexIPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexIPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitComplexIPrefix(ComplexExprParser.ComplexIPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterIntPrefix(ComplexExprParser.IntPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitIntPrefix(ComplexExprParser.IntPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensComplexPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterParensComplexPrefix(ComplexExprParser.ParensComplexPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensComplexPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitParensComplexPrefix(ComplexExprParser.ParensComplexPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoCartesianPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterIntoCartesianPrefix(ComplexExprParser.IntoCartesianPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoCartesianPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitIntoCartesianPrefix(ComplexExprParser.IntoCartesianPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoPolarPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterIntoPolarPrefix(ComplexExprParser.IntoPolarPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoPolarPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitIntoPolarPrefix(ComplexExprParser.IntoPolarPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoEPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterIntoEPrefix(ComplexExprParser.IntoEPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoEPrefix}
	 * labeled alternative in {@link ComplexExprParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitIntoEPrefix(ComplexExprParser.IntoEPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtComplexPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterSqrtComplexPostfix(ComplexExprParser.SqrtComplexPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtComplexPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitSqrtComplexPostfix(ComplexExprParser.SqrtComplexPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterSqrtPostfix(ComplexExprParser.SqrtPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitSqrtPostfix(ComplexExprParser.SqrtPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cisPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterCisPostfix(ComplexExprParser.CisPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cisPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitCisPostfix(ComplexExprParser.CisPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPostfixComplex}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterExpPostfixComplex(ComplexExprParser.ExpPostfixComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPostfixComplex}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitExpPostfixComplex(ComplexExprParser.ExpPostfixComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterMulDivPostfix(ComplexExprParser.MulDivPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitMulDivPostfix(ComplexExprParser.MulDivPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterAddSubPostfix(ComplexExprParser.AddSubPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitAddSubPostfix(ComplexExprParser.AddSubPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterModulusPostfix(ComplexExprParser.ModulusPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitModulusPostfix(ComplexExprParser.ModulusPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexIPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterComplexIPostfix(ComplexExprParser.ComplexIPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexIPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitComplexIPostfix(ComplexExprParser.ComplexIPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterIntPostfix(ComplexExprParser.IntPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitIntPostfix(ComplexExprParser.IntPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensComplexPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterParensComplexPostfix(ComplexExprParser.ParensComplexPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensComplexPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitParensComplexPostfix(ComplexExprParser.ParensComplexPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoCartesianPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterIntoCartesianPostfix(ComplexExprParser.IntoCartesianPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoCartesianPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitIntoCartesianPostfix(ComplexExprParser.IntoCartesianPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoPolarPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterIntoPolarPostfix(ComplexExprParser.IntoPolarPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoPolarPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitIntoPolarPostfix(ComplexExprParser.IntoPolarPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntoEPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterIntoEPostfix(ComplexExprParser.IntoEPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntoEPostfix}
	 * labeled alternative in {@link ComplexExprParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitIntoEPostfix(ComplexExprParser.IntoEPostfixContext ctx);
}