// Generated from Arith.g4 by ANTLR 4.7
package me.at15.tapl.arith;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithParser}.
 */
public interface ArithListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArithParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArithParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConsTrue(ArithParser.ConsTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConsTrue(ArithParser.ConsTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsFalse}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConsFalse(ArithParser.ConsFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsFalse}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConsFalse(ArithParser.ConsFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConditional(ArithParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConditional(ArithParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsZero}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConsZero(ArithParser.ConsZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsZero}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConsZero(ArithParser.ConsZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Succ}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSucc(ArithParser.SuccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Succ}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSucc(ArithParser.SuccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pred}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterPred(ArithParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pred}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitPred(ArithParser.PredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ZeroTest}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void enterZeroTest(ArithParser.ZeroTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ZeroTest}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 */
	void exitZeroTest(ArithParser.ZeroTestContext ctx);
}