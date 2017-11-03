// Generated from Untyped.g4 by ANTLR 4.7
package me.at15.tapl.untyped;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UntypedParser}.
 */
public interface UntypedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UntypedParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(UntypedParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link UntypedParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(UntypedParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link UntypedParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(UntypedParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UntypedParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(UntypedParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code App}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void enterApp(UntypedParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code App}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void exitApp(UntypedParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAbs(UntypedParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAbs(UntypedParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(UntypedParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(UntypedParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVar(UntypedParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link UntypedParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVar(UntypedParser.VarContext ctx);
}