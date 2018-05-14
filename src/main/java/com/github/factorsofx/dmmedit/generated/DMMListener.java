// Generated from DMM.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DMMParser}.
 */
public interface DMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DMMParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(DMMParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(DMMParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#assignSection}.
	 * @param ctx the parse tree
	 */
	void enterAssignSection(DMMParser.AssignSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#assignSection}.
	 * @param ctx the parse tree
	 */
	void exitAssignSection(DMMParser.AssignSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#mapSection}.
	 * @param ctx the parse tree
	 */
	void enterMapSection(DMMParser.MapSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#mapSection}.
	 * @param ctx the parse tree
	 */
	void exitMapSection(DMMParser.MapSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#keyAssign}.
	 * @param ctx the parse tree
	 */
	void enterKeyAssign(DMMParser.KeyAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#keyAssign}.
	 * @param ctx the parse tree
	 */
	void exitKeyAssign(DMMParser.KeyAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#objDecl}.
	 * @param ctx the parse tree
	 */
	void enterObjDecl(DMMParser.ObjDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#objDecl}.
	 * @param ctx the parse tree
	 */
	void exitObjDecl(DMMParser.ObjDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(DMMParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(DMMParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#varVal}.
	 * @param ctx the parse tree
	 */
	void enterVarVal(DMMParser.VarValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#varVal}.
	 * @param ctx the parse tree
	 */
	void exitVarVal(DMMParser.VarValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#mapAssign}.
	 * @param ctx the parse tree
	 */
	void enterMapAssign(DMMParser.MapAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#mapAssign}.
	 * @param ctx the parse tree
	 */
	void exitMapAssign(DMMParser.MapAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMMParser#coords}.
	 * @param ctx the parse tree
	 */
	void enterCoords(DMMParser.CoordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMMParser#coords}.
	 * @param ctx the parse tree
	 */
	void exitCoords(DMMParser.CoordsContext ctx);
}