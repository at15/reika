// Generated from Sb.g4 by ANTLR 4.7
package me.at15.tapl.simplebool;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SbParser}.
 */
public interface SbListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SbParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SbParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SbParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SbParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SbParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conditioanl}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConditioanl(SbParser.ConditioanlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conditioanl}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConditioanl(SbParser.ConditioanlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code App}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterApp(SbParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code App}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitApp(SbParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAbs(SbParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAbs(SbParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(SbParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(SbParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVar(SbParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVar(SbParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConsTrue(SbParser.ConsTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsTrue}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConsTrue(SbParser.ConsTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsFalse}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConsFalse(SbParser.ConsFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsFalse}
	 * labeled alternative in {@link SbParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConsFalse(SbParser.ConsFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TyBool}
	 * labeled alternative in {@link SbParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTyBool(SbParser.TyBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TyBool}
	 * labeled alternative in {@link SbParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTyBool(SbParser.TyBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TyArr}
	 * labeled alternative in {@link SbParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTyArr(SbParser.TyArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TyArr}
	 * labeled alternative in {@link SbParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTyArr(SbParser.TyArrContext ctx);
}