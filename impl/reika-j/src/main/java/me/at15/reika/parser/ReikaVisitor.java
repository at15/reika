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
	 * Visit a parse tree produced by {@link ReikaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ReikaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralTerm}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralTerm(ReikaParser.LiteralTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListTerm}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTerm(ReikaParser.ListTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RecordTerm}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTerm(ReikaParser.RecordTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketsTerm}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsTerm(ReikaParser.BracketsTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(ReikaParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(ReikaParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(ReikaParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ReikaParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReikaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ReikaParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReikaParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(ReikaParser.RecordContext ctx);
}