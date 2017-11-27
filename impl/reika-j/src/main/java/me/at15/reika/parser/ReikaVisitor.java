// Generated from Reika.g4 by ANTLR 4.7
package me.at15.reika.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReikaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReikaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReikaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ReikaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link ReikaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(ReikaParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link ReikaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(ReikaParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValDouble}
	 * labeled alternative in {@link ReikaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDouble(ReikaParser.ValDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link ReikaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(ReikaParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDouble}
	 * labeled alternative in {@link ReikaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDouble(ReikaParser.TypeDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link ReikaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(ReikaParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmLet}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmLet(ReikaParser.TmLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmUnary}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmUnary(ReikaParser.TmUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmVar}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmVar(ReikaParser.TmVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmValue}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmValue(ReikaParser.TmValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmBinary}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmBinary(ReikaParser.TmBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmBrackets}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmBrackets(ReikaParser.TmBracketsContext ctx);
}