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
		INDENT=1, DEDENT=2, DOC_STRING=3, STRING=4, NUM=5, NL=6, IDENTIFIER=7, 
		PATH_SEPARATOR=8, EQUALS=9, BRACE_OPEN=10, BRACE_CLOSE=11, WS=12;
	public static final int
		RULE_objectBlock = 0, RULE_statement = 1, RULE_varDecl = 2, RULE_varVal = 3, 
		RULE_path = 4;
	public static final String[] ruleNames = {
		"objectBlock", "statement", "varDecl", "varVal", "path"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'/'", "'='", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "DOC_STRING", "STRING", "NUM", "NL", "IDENTIFIER", 
		"PATH_SEPARATOR", "EQUALS", "BRACE_OPEN", "BRACE_CLOSE", "WS"
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==PATH_SEPARATOR );
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
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				varDecl();
				setState(16);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				path();
				setState(19);
				match(INDENT);
				setState(20);
				objectBlock();
				setState(21);
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
		public VarValContext varVal() {
			return getRuleContext(VarValContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			path();
			setState(26);
			match(EQUALS);
			setState(27);
			varVal();
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

	public static class VarValContext extends ParserRuleContext {
		public VarValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varVal; }
	 
		public VarValContext() { }
		public void copyFrom(VarValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends VarValContext {
		public TerminalNode NUM() { return getToken(DMParser.NUM, 0); }
		public NumberContext(VarValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMParserListener ) ((DMParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMParserVisitor ) return ((DMParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends VarValContext {
		public TerminalNode STRING() { return getToken(DMParser.STRING, 0); }
		public StringContext(VarValContext ctx) { copyFrom(ctx); }
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

	public final VarValContext varVal() throws RecognitionException {
		VarValContext _localctx = new VarValContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varVal);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(STRING);
				}
				break;
			case NUM:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(NUM);
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
		public List<TerminalNode> PATH_SEPARATOR() { return getTokens(DMParser.PATH_SEPARATOR); }
		public TerminalNode PATH_SEPARATOR(int i) {
			return getToken(DMParser.PATH_SEPARATOR, i);
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
		enterRule(_localctx, 8, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATH_SEPARATOR) {
				{
				setState(33);
				match(PATH_SEPARATOR);
				}
			}

			setState(36);
			match(IDENTIFIER);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH_SEPARATOR) {
				{
				{
				setState(37);
				match(PATH_SEPARATOR);
				setState(38);
				match(IDENTIFIER);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\"\n\5\3\6\5\6"+
		"%\n\6\3\6\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\6\2\2\7\2\4\6\b\n\2\2\2.\2"+
		"\r\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b!\3\2\2\2\n$\3\2\2\2\f\16\5\4\3"+
		"\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21"+
		"\22\5\6\4\2\22\23\7\b\2\2\23\32\3\2\2\2\24\25\5\n\6\2\25\26\7\3\2\2\26"+
		"\27\5\2\2\2\27\30\7\4\2\2\30\32\3\2\2\2\31\21\3\2\2\2\31\24\3\2\2\2\32"+
		"\5\3\2\2\2\33\34\5\n\6\2\34\35\7\13\2\2\35\36\5\b\5\2\36\7\3\2\2\2\37"+
		"\"\7\6\2\2 \"\7\7\2\2!\37\3\2\2\2! \3\2\2\2\"\t\3\2\2\2#%\7\n\2\2$#\3"+
		"\2\2\2$%\3\2\2\2%&\3\2\2\2&+\7\t\2\2\'(\7\n\2\2(*\7\t\2\2)\'\3\2\2\2*"+
		"-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\13\3\2\2\2-+\3\2\2\2\7\17\31!$+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}