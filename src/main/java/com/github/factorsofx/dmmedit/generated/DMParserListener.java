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
	 * Enter a parse tree produced by {@link DMParser#varParam}.
	 * @param ctx the parse tree
	 */
	void enterVarParam(DMParser.VarParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#varParam}.
	 * @param ctx the parse tree
	 */
	void exitVarParam(DMParser.VarParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DMParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DMParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMParser#embed}.
	 * @param ctx the parse tree
	 */
	void enterEmbed(DMParser.EmbedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#embed}.
	 * @param ctx the parse tree
	 */
	void exitEmbed(DMParser.EmbedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDeref}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDeref(DMParser.ExprDerefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDeref}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDeref(DMParser.ExprDerefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprValue}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprValue(DMParser.ExprValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprValue}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprValue(DMParser.ExprValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolNot(DMParser.ExprBoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolNot}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolNot(DMParser.ExprBoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNegate}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegate(DMParser.ExprNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNegate}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegate(DMParser.ExprNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDiv}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDiv(DMParser.ExprDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDiv}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDiv(DMParser.ExprDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPreIncr}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPreIncr(DMParser.ExprPreIncrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPreIncr}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPreIncr(DMParser.ExprPreIncrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(DMParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(DMParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBitNot}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBitNot(DMParser.ExprBitNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBitNot}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBitNot(DMParser.ExprBitNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(DMParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(DMParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(DMParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(DMParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCall}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCall(DMParser.ExprCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCall}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCall(DMParser.ExprCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPreDecr}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPreDecr(DMParser.ExprPreDecrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPreDecr}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPreDecr(DMParser.ExprPreDecrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(DMParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(DMParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMod}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMod(DMParser.ExprModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMod}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMod(DMParser.ExprModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPow}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(DMParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPow}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(DMParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIndex}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIndex(DMParser.ExprIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIndex}
	 * labeled alternative in {@link DMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIndex(DMParser.ExprIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(DMParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(DMParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valPath}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValPath(DMParser.ValPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valPath}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValPath(DMParser.ValPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValNum(DMParser.ValNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valNum}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValNum(DMParser.ValNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valStr}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValStr(DMParser.ValStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valStr}
	 * labeled alternative in {@link DMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValStr(DMParser.ValStrContext ctx);
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