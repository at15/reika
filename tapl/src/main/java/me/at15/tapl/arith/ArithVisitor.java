// Generated from Arith.g4 by ANTLR 4.7
package me.at15.tapl.arith;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ArithParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ArithParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsTrue(ArithParser.ConsTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsFalse}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsFalse(ArithParser.ConsFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ArithParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsZero}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsZero(ArithParser.ConsZeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Succ}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSucc(ArithParser.SuccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pred}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(ArithParser.PredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ZeroTest}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroTest(ArithParser.ZeroTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ArithParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(ArithParser.BracketsContext ctx);
}