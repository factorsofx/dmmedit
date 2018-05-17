// Generated from DMParser.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DMParser}.
 */
public interface DMParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DMParser#objectBlock}.
	 * @param ctx the parse tree
	 */
	void enterObjectBlock(DMParser.ObjectBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#objectBlock}.
	 * @param ctx the parse tree
	 */
	void exitObjectBlock(DMParser.ObjectBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(DMParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(DMParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link DMParser#varVal}.
	 * @param ctx the parse tree
	 */
	void enterString(DMParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DMParser#varVal}.
	 * @param ctx the parse tree
	 */
	void exitString(DMParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link DMParser#varVal}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DMParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link DMParser#varVal}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DMParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(DMParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(DMParser.PathContext ctx);
}