// Generated from DMM.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DMMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DMMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DMMParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(DMMParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#assignSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSection(DMMParser.AssignSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#mapSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapSection(DMMParser.MapSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#keyAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyAssign(DMMParser.KeyAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#objDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjDecl(DMMParser.ObjDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(DMMParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#varVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVal(DMMParser.VarValContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#mapAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapAssign(DMMParser.MapAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMMParser#coords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoords(DMMParser.CoordsContext ctx);
}