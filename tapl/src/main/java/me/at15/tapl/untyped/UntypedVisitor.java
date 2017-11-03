// Generated from Untyped.g4 by ANTLR 4.7
package me.at15.tapl.untyped;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UntypedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UntypedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UntypedParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(UntypedParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link UntypedParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(UntypedParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code App}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(UntypedParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(UntypedParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(UntypedParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(UntypedParser.VarContext ctx);
}