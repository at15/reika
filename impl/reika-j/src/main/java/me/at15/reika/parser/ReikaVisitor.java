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
	 * Visit a parse tree produced by the {@code LtBool}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtBool(ReikaParser.LtBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtInt}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtInt(ReikaParser.LtIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtDouble}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtDouble(ReikaParser.LtDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtString}
	 * labeled alternative in {@link ReikaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtString(ReikaParser.LtStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLt}
	 * labeled alternative in {@link ReikaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLt(ReikaParser.ListLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListList}
	 * labeled alternative in {@link ReikaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListList(ReikaParser.ListListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListRecord}
	 * labeled alternative in {@link ReikaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRecord(ReikaParser.ListRecordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RecordLt}
	 * labeled alternative in {@link ReikaParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordLt(ReikaParser.RecordLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmLiteral}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmLiteral(ReikaParser.TmLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmList}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmList(ReikaParser.TmListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmRecord}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmRecord(ReikaParser.TmRecordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TmBrackets}
	 * labeled alternative in {@link ReikaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmBrackets(ReikaParser.TmBracketsContext ctx);
}