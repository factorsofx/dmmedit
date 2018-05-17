// Generated from DMParser.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DMParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DMParser#objectBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBlock(DMParser.ObjectBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DMParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(DMParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DMParser#varVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DMParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link DMParser#varVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DMParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(DMParser.PathContext ctx);
}