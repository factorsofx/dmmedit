// Generated from DMI.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DMIParser}.
 */
public interface DMIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DMIParser#dmi}.
	 * @param ctx the parse tree
	 */
	void enterDmi(DMIParser.DmiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMIParser#dmi}.
	 * @param ctx the parse tree
	 */
	void exitDmi(DMIParser.DmiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMIParser#iconStates}.
	 * @param ctx the parse tree
	 */
	void enterIconStates(DMIParser.IconStatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMIParser#iconStates}.
	 * @param ctx the parse tree
	 */
	void exitIconStates(DMIParser.IconStatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMIParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(DMIParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMIParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(DMIParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMIParser#iconDesc}.
	 * @param ctx the parse tree
	 */
	void enterIconDesc(DMIParser.IconDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMIParser#iconDesc}.
	 * @param ctx the parse tree
	 */
	void exitIconDesc(DMIParser.IconDescContext ctx);
}