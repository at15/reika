// Generated from src/main/java/me/at15/reika/compiler/parser/Reika.g4 by ANTLR 4.7
package me.at15.reika.compiler.parser;
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
	 * Visit a parse tree produced by the {@code ConsBool}
	 * labeled alternative in {@link ReikaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsBool(ReikaParser.ConsBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsInt}
	 * labeled alternative in {@link ReikaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsInt(ReikaParser.ConsIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsDouble}
	 * labeled alternative in {@link ReikaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsDouble(ReikaParser.ConsDoubleContext ctx);
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
	 * Visit a parse tree produced by the {@code TmCons}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmCons(ReikaParser.TmConsContext ctx);
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