// Generated from DMParser.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, STR_OPEN=3, STR_END=4, EMBED_OPEN=5, LINE_ESCAPE=6, 
		IGNORE_NL=7, NL=8, EMBED_CLOSE=9, KW_AS=10, KW_IN=11, STRICT_DEREF=12, 
		LAX_DEREF=13, BOOL_NOT=14, BIT_NOT=15, INCR=16, DECR=17, NEG=18, POW=19, 
		MULT=20, DIV=21, MOD=22, ADD=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_BRACKET=26, 
		CLOSE_BRACKET=27, ARG_SEP=28, NUM=29, IDENTIFIER=30, EQUALS=31, BRACE_OPEN=32, 
		BRACE_CLOSE=33, WS=34, DSTR_END=35, SSTR_END=36;
	public static final int
		RULE_objectBlock = 0, RULE_statement = 1, RULE_varDecl = 2, RULE_varParam = 3, 
		RULE_string = 4, RULE_embed = 5, RULE_expr = 6, RULE_arg = 7, RULE_value = 8, 
		RULE_path = 9;
	public static final String[] ruleNames = {
		"objectBlock", "statement", "varDecl", "varParam", "string", "embed", 
		"expr", "arg", "value", "path"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'as'", "'in'", 
		"'.'", "':'", "'!'", "'~'", "'++'", "'--'", "'-'", "'**'", "'*'", "'/'", 
		"'%'", "'+'", "'('", "')'", "'['", "']'", "','", null, null, "'='", "'{'", 
		"'}'", null, "'\"}'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "STR_OPEN", "STR_END", "EMBED_OPEN", "LINE_ESCAPE", 
		"IGNORE_NL", "NL", "EMBED_CLOSE", "KW_AS", "KW_IN", "STRICT_DEREF", "LAX_DEREF", 
		"BOOL_NOT", "BIT_NOT", "INCR", "DECR", "NEG", "POW", "MULT", "DIV", "MOD", 
		"ADD", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "ARG_SEP", 
		"NUM", "IDENTIFIER", "EQUALS", "BRACE_OPEN", "BRACE_CLOSE", "WS", "DSTR_END", 
		"SSTR_END"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ObjectBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ObjectBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterObjectBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitObjectBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitObjectBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBlockContext objectBlock() throws RecognitionException {
		ObjectBlockContext _localctx = new ObjectBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_objectBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIV || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode NL() { return getToken(DMParser.NL, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(DMParser.INDENT, 0); }
		public ObjectBlockContext objectBlock() {
			return getRuleContext(ObjectBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(DMParser.DEDENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				varDecl();
				setState(26);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				path();
				setState(29);
				match(INDENT);
				setState(30);
				objectBlock();
				setState(31);
				match(DEDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DMParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarParamContext varParam() {
			return getRuleContext(VarParamContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			path();
			setState(36);
			match(EQUALS);
			setState(37);
			expr(0);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IN) {
				{
				setState(38);
				varParam();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarParamContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(DMParser.KW_IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterVarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitVarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitVarParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamContext varParam() throws RecognitionException {
		VarParamContext _localctx = new VarParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(KW_IN);
			setState(42);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STR_OPEN() { return getToken(DMParser.STR_OPEN, 0); }
		public TerminalNode STR_END() { return getToken(DMParser.STR_END, 0); }
		public List<EmbedContext> embed() {
			return getRuleContexts(EmbedContext.class);
		}
		public EmbedContext embed(int i) {
			return getRuleContext(EmbedContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(STR_OPEN);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EMBED_OPEN) {
				{
				{
				setState(45);
				embed();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(STR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmbedContext extends ParserRuleContext {
		public TerminalNode EMBED_OPEN() { return getToken(DMParser.EMBED_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EMBED_CLOSE() { return getToken(DMParser.EMBED_CLOSE, 0); }
		public EmbedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterEmbed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitEmbed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitEmbed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmbedContext embed() throws RecognitionException {
		EmbedContext _localctx = new EmbedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_embed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(EMBED_OPEN);
			setState(54);
			expr(0);
			setState(55);
			match(EMBED_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprDerefContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DMParser.IDENTIFIER, 0); }
		public TerminalNode STRICT_DEREF() { return getToken(DMParser.STRICT_DEREF, 0); }
		public TerminalNode LAX_DEREF() { return getToken(DMParser.LAX_DEREF, 0); }
		public ExprDerefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprDeref(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprValueContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolNotContext extends ExprContext {
		public TerminalNode BOOL_NOT() { return getToken(DMParser.BOOL_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprBoolNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegateContext extends ExprContext {
		public TerminalNode NEG() { return getToken(DMParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(DMParser.DIV, 0); }
		public ExprDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPreIncrContext extends ExprContext {
		public TerminalNode INCR() { return getToken(DMParser.INCR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPreIncrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprPreIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprPreIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprPreIncr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(DMParser.MULT, 0); }
		public ExprMultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBitNotContext extends ExprContext {
		public TerminalNode BIT_NOT() { return getToken(DMParser.BIT_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprBitNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprBitNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprBitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprBitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenContext extends ExprContext {
		public TerminalNode OPEN_PAREN() { return getToken(DMParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DMParser.CLOSE_PAREN, 0); }
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEG() { return getToken(DMParser.NEG, 0); }
		public ExprSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(DMParser.OPEN_PAREN, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(DMParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> ARG_SEP() { return getTokens(DMParser.ARG_SEP); }
		public TerminalNode ARG_SEP(int i) {
			return getToken(DMParser.ARG_SEP, i);
		}
		public ExprCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPreDecrContext extends ExprContext {
		public TerminalNode DECR() { return getToken(DMParser.DECR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPreDecrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprPreDecr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprPreDecr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprPreDecr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(DMParser.ADD, 0); }
		public ExprAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(DMParser.MOD, 0); }
		public ExprModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPowContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(DMParser.POW, 0); }
		public ExprPowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(DMParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(DMParser.CLOSE_BRACKET, 0); }
		public ExprIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterExprIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitExprIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitExprIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(OPEN_PAREN);
				setState(59);
				expr(0);
				setState(60);
				match(CLOSE_PAREN);
				}
				break;
			case BOOL_NOT:
				{
				_localctx = new ExprBoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(BOOL_NOT);
				setState(63);
				expr(12);
				}
				break;
			case BIT_NOT:
				{
				_localctx = new ExprBitNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(BIT_NOT);
				setState(65);
				expr(11);
				}
				break;
			case INCR:
				{
				_localctx = new ExprPreIncrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(INCR);
				setState(67);
				expr(10);
				}
				break;
			case DECR:
				{
				_localctx = new ExprPreDecrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(DECR);
				setState(69);
				expr(9);
				}
				break;
			case NEG:
				{
				_localctx = new ExprNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(NEG);
				setState(71);
				expr(8);
				}
				break;
			case STR_OPEN:
			case DIV:
			case NUM:
			case IDENTIFIER:
				{
				_localctx = new ExprValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPowContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(76);
						match(POW);
						setState(77);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(79);
						match(MULT);
						setState(80);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(82);
						match(DIV);
						setState(83);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(85);
						match(MOD);
						setState(86);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88);
						match(ADD);
						setState(89);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(91);
						match(NEG);
						setState(92);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprDerefContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==STRICT_DEREF || _la==LAX_DEREF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						match(IDENTIFIER);
						}
						break;
					case 8:
						{
						_localctx = new ExprCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(97);
						match(OPEN_PAREN);
						setState(98);
						arg();
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ARG_SEP) {
							{
							{
							setState(99);
							match(ARG_SEP);
							setState(100);
							arg();
							}
							}
							setState(105);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(106);
						match(CLOSE_PAREN);
						}
						break;
					case 9:
						{
						_localctx = new ExprIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(109);
						match(OPEN_BRACKET);
						setState(110);
						expr(0);
						setState(111);
						match(CLOSE_BRACKET);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode KW_AS() { return getToken(DMParser.KW_AS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(DMParser.KW_IN, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			expr(0);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(119);
				match(KW_AS);
				setState(120);
				path();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IN) {
					{
					setState(121);
					match(KW_IN);
					setState(122);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValNumContext extends ValueContext {
		public TerminalNode NUM() { return getToken(DMParser.NUM, 0); }
		public ValNumContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterValNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitValNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitValNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStrContext extends ValueContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValStrContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterValStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitValStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitValStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValPathContext extends ValueContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ValPathContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterValPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitValPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitValPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV:
			case IDENTIFIER:
				_localctx = new ValPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				path();
				}
				break;
			case NUM:
				_localctx = new ValNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(NUM);
				}
				break;
			case STR_OPEN:
				_localctx = new ValStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DMParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DMParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DMParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DMParser.DIV, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV) {
				{
				setState(132);
				match(DIV);
				}
			}

			setState(135);
			match(IDENTIFIER);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(DIV);
					setState(137);
					match(IDENTIFIER);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\4\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bL\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bh\n\b\f\b\16\bk\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bt\n\b\f\b\16\bw"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\5\t\u0080\n\t\3\n\3\n\3\n\5\n\u0085"+
		"\n\n\3\13\5\13\u0088\n\13\3\13\3\13\3\13\7\13\u008d\n\13\f\13\16\13\u0090"+
		"\13\13\3\13\2\3\16\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\16\17\2\u00a1\2\27"+
		"\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\b+\3\2\2\2\n.\3\2\2\2\f\67\3\2\2\2\16K"+
		"\3\2\2\2\20x\3\2\2\2\22\u0084\3\2\2\2\24\u0087\3\2\2\2\26\30\5\4\3\2\27"+
		"\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33"+
		"\34\5\6\4\2\34\35\7\n\2\2\35$\3\2\2\2\36\37\5\24\13\2\37 \7\3\2\2 !\5"+
		"\2\2\2!\"\7\4\2\2\"$\3\2\2\2#\33\3\2\2\2#\36\3\2\2\2$\5\3\2\2\2%&\5\24"+
		"\13\2&\'\7!\2\2\')\5\16\b\2(*\5\b\5\2)(\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+"+
		",\7\r\2\2,-\5\16\b\2-\t\3\2\2\2.\62\7\5\2\2/\61\5\f\7\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\7\6\2\2\66\13\3\2\2\2\678\7\7\2\289\5\16\b\29:\7\13\2\2:\r\3\2\2\2"+
		";<\b\b\1\2<=\7\32\2\2=>\5\16\b\2>?\7\33\2\2?L\3\2\2\2@A\7\20\2\2AL\5\16"+
		"\b\16BC\7\21\2\2CL\5\16\b\rDE\7\22\2\2EL\5\16\b\fFG\7\23\2\2GL\5\16\b"+
		"\13HI\7\24\2\2IL\5\16\b\nJL\5\22\n\2K;\3\2\2\2K@\3\2\2\2KB\3\2\2\2KD\3"+
		"\2\2\2KF\3\2\2\2KH\3\2\2\2KJ\3\2\2\2Lu\3\2\2\2MN\f\t\2\2NO\7\25\2\2Ot"+
		"\5\16\b\nPQ\f\b\2\2QR\7\26\2\2Rt\5\16\b\tST\f\7\2\2TU\7\27\2\2Ut\5\16"+
		"\b\bVW\f\6\2\2WX\7\30\2\2Xt\5\16\b\7YZ\f\5\2\2Z[\7\31\2\2[t\5\16\b\6\\"+
		"]\f\4\2\2]^\7\24\2\2^t\5\16\b\5_`\f\22\2\2`a\t\2\2\2at\7 \2\2bc\f\21\2"+
		"\2cd\7\32\2\2di\5\20\t\2ef\7\36\2\2fh\5\20\t\2ge\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\33\2\2mt\3\2\2\2no\f\20\2\2o"+
		"p\7\34\2\2pq\5\16\b\2qr\7\35\2\2rt\3\2\2\2sM\3\2\2\2sP\3\2\2\2sS\3\2\2"+
		"\2sV\3\2\2\2sY\3\2\2\2s\\\3\2\2\2s_\3\2\2\2sb\3\2\2\2sn\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2\2x\177\5\16\b\2yz\7\f\2\2"+
		"z}\5\24\13\2{|\7\r\2\2|~\5\16\b\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"y\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\u0085\5\24\13\2\u0082"+
		"\u0085\7\37\2\2\u0083\u0085\5\n\6\2\u0084\u0081\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0083\3\2\2\2\u0085\23\3\2\2\2\u0086\u0088\7\27\2\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008e\7 "+
		"\2\2\u008a\u008b\7\27\2\2\u008b\u008d\7 \2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\25\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\17\31#)\62Kisu}\177\u0084\u0087\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}