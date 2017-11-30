// Generated from SimpleBin.g4 by ANTLR 4.7
package me.at15.reika.playground;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleBinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleBinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleBinParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleBinParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link SimpleBinParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(SimpleBinParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link SimpleBinParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SimpleBinParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link SimpleBinParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(SimpleBinParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link SimpleBinParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SimpleBinParser.IntContext ctx);
}