// Generated from DMI.g4 by ANTLR 4.7.1
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
public class DMIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1;
	public static final int
		RULE_dmi = 0, RULE_iconStates = 1, RULE_header = 2, RULE_iconDesc = 3;
	public static final String[] ruleNames = {
		"dmi", "iconStates", "header", "iconDesc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
	public String getGrammarFileName() { return "DMI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DmiContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public IconStatesContext iconStates() {
			return getRuleContext(IconStatesContext.class,0);
		}
		public DmiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).enterDmi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).exitDmi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMIVisitor ) return ((DMIVisitor<? extends T>)visitor).visitDmi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmiContext dmi() throws RecognitionException {
		DmiContext _localctx = new DmiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dmi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			header();
			setState(9);
			iconStates();
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

	public static class IconStatesContext extends ParserRuleContext {
		public List<IconDescContext> iconDesc() {
			return getRuleContexts(IconDescContext.class);
		}
		public IconDescContext iconDesc(int i) {
			return getRuleContext(IconDescContext.class,i);
		}
		public IconStatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconStates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).enterIconStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).exitIconStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMIVisitor ) return ((DMIVisitor<? extends T>)visitor).visitIconStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconStatesContext iconStates() throws RecognitionException {
		IconStatesContext _localctx = new IconStatesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iconStates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				iconDesc();
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMIVisitor ) return ((DMIVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
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

	public static class IconDescContext extends ParserRuleContext {
		public IconDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).enterIconDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMIListener ) ((DMIListener)listener).exitIconDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMIVisitor ) return ((DMIVisitor<? extends T>)visitor).visitIconDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconDescContext iconDesc() throws RecognitionException {
		IconDescContext _localctx = new IconDescContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iconDesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\3\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\6\3\17\n\3\r\3\16\3\20\3\4\3\4\3"+
		"\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\23\2\n\3\2\2\2\4\16\3\2\2\2\6\22\3\2\2"+
		"\2\b\24\3\2\2\2\n\13\5\6\4\2\13\f\5\4\3\2\f\3\3\2\2\2\r\17\5\b\5\2\16"+
		"\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\5\3\2\2\2\22\23"+
		"\7\3\2\2\23\7\3\2\2\2\24\25\7\3\2\2\25\t\3\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}