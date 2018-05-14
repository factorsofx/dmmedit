// Generated from DMM.g4 by ANTLR 4.7.1
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
public class DMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PATH=8, PATH_FRAG=9, 
		STR=10, FILENAME=11, NUM=12, FUNC_CALL=13, NULL=14, DOC_STR=15, IDENTIFIER=16, 
		COMMENT=17, WS=18;
	public static final int
		RULE_map = 0, RULE_assignSection = 1, RULE_mapSection = 2, RULE_keyAssign = 3, 
		RULE_objDecl = 4, RULE_varAssign = 5, RULE_varVal = 6, RULE_mapAssign = 7, 
		RULE_coords = 8;
	public static final String[] ruleNames = {
		"map", "assignSection", "mapSection", "keyAssign", "objDecl", "varAssign", 
		"varVal", "mapAssign", "coords"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "','", "')'", "'{'", "';'", "'}'", null, null, null, 
		null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PATH", "PATH_FRAG", "STR", 
		"FILENAME", "NUM", "FUNC_CALL", "NULL", "DOC_STR", "IDENTIFIER", "COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "DMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MapContext extends ParserRuleContext {
		public AssignSectionContext assignSection() {
			return getRuleContext(AssignSectionContext.class,0);
		}
		public MapSectionContext mapSection() {
			return getRuleContext(MapSectionContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			assignSection();
			setState(19);
			mapSection();
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

	public static class AssignSectionContext extends ParserRuleContext {
		public List<KeyAssignContext> keyAssign() {
			return getRuleContexts(KeyAssignContext.class);
		}
		public KeyAssignContext keyAssign(int i) {
			return getRuleContext(KeyAssignContext.class,i);
		}
		public AssignSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterAssignSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitAssignSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitAssignSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignSectionContext assignSection() throws RecognitionException {
		AssignSectionContext _localctx = new AssignSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				keyAssign();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STR );
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

	public static class MapSectionContext extends ParserRuleContext {
		public List<MapAssignContext> mapAssign() {
			return getRuleContexts(MapAssignContext.class);
		}
		public MapAssignContext mapAssign(int i) {
			return getRuleContext(MapAssignContext.class,i);
		}
		public MapSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterMapSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitMapSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitMapSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapSectionContext mapSection() throws RecognitionException {
		MapSectionContext _localctx = new MapSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				mapAssign();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class KeyAssignContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(DMMParser.STR, 0); }
		public List<ObjDeclContext> objDecl() {
			return getRuleContexts(ObjDeclContext.class);
		}
		public ObjDeclContext objDecl(int i) {
			return getRuleContext(ObjDeclContext.class,i);
		}
		public KeyAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterKeyAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitKeyAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitKeyAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyAssignContext keyAssign() throws RecognitionException {
		KeyAssignContext _localctx = new KeyAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(STR);
			setState(32);
			match(T__0);
			setState(33);
			match(T__1);
			setState(34);
			objDecl();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(35);
				match(T__2);
				setState(36);
				objDecl();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(T__3);
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

	public static class ObjDeclContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(DMMParser.PATH, 0); }
		public List<VarAssignContext> varAssign() {
			return getRuleContexts(VarAssignContext.class);
		}
		public VarAssignContext varAssign(int i) {
			return getRuleContext(VarAssignContext.class,i);
		}
		public ObjDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterObjDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitObjDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitObjDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjDeclContext objDecl() throws RecognitionException {
		ObjDeclContext _localctx = new ObjDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PATH);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(45);
				match(T__4);
				setState(46);
				varAssign();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(47);
					match(T__5);
					setState(48);
					varAssign();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__6);
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

	public static class VarAssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DMMParser.IDENTIFIER, 0); }
		public VarValContext varVal() {
			return getRuleContext(VarValContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(T__0);
			setState(60);
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
		public TerminalNode STR() { return getToken(DMMParser.STR, 0); }
		public TerminalNode FILENAME() { return getToken(DMMParser.FILENAME, 0); }
		public TerminalNode NUM() { return getToken(DMMParser.NUM, 0); }
		public TerminalNode FUNC_CALL() { return getToken(DMMParser.FUNC_CALL, 0); }
		public TerminalNode NULL() { return getToken(DMMParser.NULL, 0); }
		public TerminalNode PATH() { return getToken(DMMParser.PATH, 0); }
		public VarValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterVarVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitVarVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitVarVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarValContext varVal() throws RecognitionException {
		VarValContext _localctx = new VarValContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PATH) | (1L << STR) | (1L << FILENAME) | (1L << NUM) | (1L << FUNC_CALL) | (1L << NULL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MapAssignContext extends ParserRuleContext {
		public CoordsContext coords() {
			return getRuleContext(CoordsContext.class,0);
		}
		public TerminalNode DOC_STR() { return getToken(DMMParser.DOC_STR, 0); }
		public MapAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterMapAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitMapAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitMapAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapAssignContext mapAssign() throws RecognitionException {
		MapAssignContext _localctx = new MapAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mapAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			coords();
			setState(65);
			match(T__0);
			setState(66);
			match(DOC_STR);
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

	public static class CoordsContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(DMMParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(DMMParser.NUM, i);
		}
		public CoordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).enterCoords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMMListener ) ((DMMListener)listener).exitCoords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMMVisitor ) return ((DMMVisitor<? extends T>)visitor).visitCoords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordsContext coords() throws RecognitionException {
		CoordsContext _localctx = new CoordsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coords);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__1);
			setState(69);
			match(NUM);
			setState(70);
			match(T__2);
			setState(71);
			match(NUM);
			setState(72);
			match(T__2);
			setState(73);
			match(NUM);
			setState(74);
			match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\6\3\31\n\3\r\3\16\3\32\3\4\6\4\36\n\4\r\4\16\4\37\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\64\n"+
		"\6\f\6\16\6\67\13\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22"+
		"\2\3\4\2\n\n\f\20\2J\2\24\3\2\2\2\4\30\3\2\2\2\6\35\3\2\2\2\b!\3\2\2\2"+
		"\n.\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2\22F\3\2\2\2\24\25\5\4\3"+
		"\2\25\26\5\6\4\2\26\3\3\2\2\2\27\31\5\b\5\2\30\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\36\5\20\t\2\35\34\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\"\7\f\2\2\"#\7"+
		"\3\2\2#$\7\4\2\2$)\5\n\6\2%&\7\5\2\2&(\5\n\6\2\'%\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\6\2\2-\t\3\2\2\2.:\7\n\2\2"+
		"/\60\7\7\2\2\60\65\5\f\7\2\61\62\7\b\2\2\62\64\5\f\7\2\63\61\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7"+
		"\t\2\29;\3\2\2\2:/\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<=\7\22\2\2=>\7\3\2\2"+
		">?\5\16\b\2?\r\3\2\2\2@A\t\2\2\2A\17\3\2\2\2BC\5\22\n\2CD\7\3\2\2DE\7"+
		"\21\2\2E\21\3\2\2\2FG\7\4\2\2GH\7\16\2\2HI\7\5\2\2IJ\7\16\2\2JK\7\5\2"+
		"\2KL\7\16\2\2LM\7\6\2\2M\23\3\2\2\2\7\32\37)\65:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}