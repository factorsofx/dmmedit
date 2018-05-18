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
	 * Visit a parse tree produced by {@link DMParser#varParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParam(DMParser.VarParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DMParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#embed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbed(DMParser.EmbedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDeref}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDeref(DMParser.ExprDerefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprValue}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValue(DMParser.ExprValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolNot(DMParser.ExprBoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNegate}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegate(DMParser.ExprNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDiv}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDiv(DMParser.ExprDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPreIncr}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPreIncr(DMParser.ExprPreIncrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(DMParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBitNot}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBitNot(DMParser.ExprBitNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(DMParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(DMParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCall}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCall(DMParser.ExprCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPreDecr}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPreDecr(DMParser.ExprPreDecrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(DMParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMod}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMod(DMParser.ExprModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPow}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(DMParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIndex}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIndex(DMParser.ExprIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(DMParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valPath}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValPath(DMParser.ValPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNum(DMParser.ValNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valStr}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValStr(DMParser.ValStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(DMParser.PathContext ctx);
}