// Generated from Sb.g4 by ANTLR 4.7
package me.at15.tapl.simplebool;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SbParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SbVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SbParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SbParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SbParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conditioanl}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditioanl(SbParser.ConditioanlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code App}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(SbParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(SbParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(SbParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SbParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsTrue(SbParser.ConsTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsFalse}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsFalse(SbParser.ConsFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TyBool}
	 * labeled alternative in {@link SbParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyBool(SbParser.TyBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TyArr}
	 * labeled alternative in {@link SbParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyArr(SbParser.TyArrContext ctx);
}