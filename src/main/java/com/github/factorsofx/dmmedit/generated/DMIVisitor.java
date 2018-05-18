// Generated from DMI.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DMIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DMIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DMIParser#dmi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmi(DMIParser.DmiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMIParser#iconStates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconStates(DMIParser.IconStatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMIParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(DMIParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMIParser#iconDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconDesc(DMIParser.IconDescContext ctx);
}