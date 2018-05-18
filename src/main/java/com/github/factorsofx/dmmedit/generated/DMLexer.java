// Generated from DMLexer.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;

import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMLexer extends Lexer {
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
		DSTR=1, STR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "DSTR", "STR"
	};

	public static final String[] ruleNames = {
		"LINE_ESCAPE", "IGNORE_NL", "NL", "DSTR_OPEN", "SSTR_OPEN", "EMBED_CLOSE", 
		"KW_AS", "KW_IN", "STRICT_DEREF", "LAX_DEREF", "BOOL_NOT", "BIT_NOT", 
		"INCR", "DECR", "NEG", "POW", "MULT", "DIV", "MOD", "ADD", "OPEN_PAREN", 
		"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "ARG_SEP", "NUM", "IDENTIFIER", 
		"EQUALS", "BRACE_OPEN", "BRACE_CLOSE", "CRLF", "WS", "DEMBED_OPEN", "DSTR_END", 
		"DSTR_FRAG", "SEMBED_OPEN", "SSTR_END", "SSTR_FRAG"
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


	private int embeds = 0;
	private int nesting = 0;

	private final DenterHelper denter = new DenterHelper(NL, INDENT, DEDENT)
	{
	    @Override
	    public Token pullToken()
	    {
	        Token nextToken = DMLexer.super.nextToken();
	        return nextToken;
	    }
	};

	@Override
	public Token nextToken()
	{
	    return denter.nextToken();
	}


	public DMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DMLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			EMBED_CLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			OPEN_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			CLOSE_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			DEMBED_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			SEMBED_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EMBED_CLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 embeds--; 
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 nesting++; 
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 nesting--;
			break;
		}
	}
	private void OPEN_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 nesting++; 
			break;
		}
	}
	private void CLOSE_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 nesting--; 
			break;
		}
	}
	private void DEMBED_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 embeds++; 
			break;
		}
	}
	private void SEMBED_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 embeds++; 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return IGNORE_NL_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return EMBED_CLOSE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IGNORE_NL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return nesting > 0;
		}
		return true;
	}
	private boolean EMBED_CLOSE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return embeds > 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00e7\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\5\33\u00a4\n\33\3\33\6\33\u00a7\n\33\r\33\16\33\u00a8\3\33\3\33\6\33"+
		"\u00ad\n\33\r\33\16\33\u00ae\5\33\u00b1\n\33\3\34\3\34\7\34\u00b5\n\34"+
		"\f\34\16\34\u00b8\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \5 \u00c1\n \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\2\2(\5\b\7\t\t\n\13"+
		"\2\r\2\17\13\21\f\23\r\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26"+
		"\'\27)\30+\31-\32/\33\61\34\63\35\65\36\67\379 ;!=\"?#A\2C$E\2G%I\2K\2"+
		"M&O\2\5\2\3\4\7\4\2\13\13\"\"\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u00ea\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\3"+
		"I\3\2\2\2\4K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\5Q\3\2\2\2\7V\3\2\2\2\t[\3"+
		"\2\2\2\13b\3\2\2\2\rh\3\2\2\2\17m\3\2\2\2\21s\3\2\2\2\23v\3\2\2\2\25y"+
		"\3\2\2\2\27{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0081\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2"+
		")\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u009a"+
		"\3\2\2\2\63\u009d\3\2\2\2\65\u00a0\3\2\2\2\67\u00a3\3\2\2\29\u00b2\3\2"+
		"\2\2;\u00b9\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2\2\2A\u00c0\3\2\2\2C\u00c4"+
		"\3\2\2\2E\u00c8\3\2\2\2G\u00ce\3\2\2\2I\u00d4\3\2\2\2K\u00d8\3\2\2\2M"+
		"\u00de\3\2\2\2O\u00e3\3\2\2\2QR\7^\2\2RS\5A \2ST\3\2\2\2TU\b\2\2\2U\6"+
		"\3\2\2\2VW\5A \2WX\6\3\2\2XY\3\2\2\2YZ\b\3\2\2Z\b\3\2\2\2[_\5A \2\\^\t"+
		"\2\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\n\3\2\2\2a_\3\2\2\2b"+
		"c\7}\2\2cd\7$\2\2de\3\2\2\2ef\b\5\3\2fg\b\5\4\2g\f\3\2\2\2hi\7$\2\2ij"+
		"\3\2\2\2jk\b\6\5\2kl\b\6\4\2l\16\3\2\2\2mn\7_\2\2no\6\7\3\2op\b\7\6\2"+
		"pq\3\2\2\2qr\b\7\7\2r\20\3\2\2\2st\7c\2\2tu\7u\2\2u\22\3\2\2\2vw\7k\2"+
		"\2wx\7p\2\2x\24\3\2\2\2yz\7\60\2\2z\26\3\2\2\2{|\7<\2\2|\30\3\2\2\2}~"+
		"\7#\2\2~\32\3\2\2\2\177\u0080\7\u0080\2\2\u0080\34\3\2\2\2\u0081\u0082"+
		"\7-\2\2\u0082\u0083\7-\2\2\u0083\36\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086"+
		"\7/\2\2\u0086 \3\2\2\2\u0087\u0088\7/\2\2\u0088\"\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a\u008b\7,\2\2\u008b$\3\2\2\2\u008c\u008d\7,\2\2\u008d&\3"+
		"\2\2\2\u008e\u008f\7\61\2\2\u008f(\3\2\2\2\u0090\u0091\7\'\2\2\u0091*"+
		"\3\2\2\2\u0092\u0093\7-\2\2\u0093,\3\2\2\2\u0094\u0095\7*\2\2\u0095\u0096"+
		"\b\26\b\2\u0096.\3\2\2\2\u0097\u0098\7+\2\2\u0098\u0099\b\27\t\2\u0099"+
		"\60\3\2\2\2\u009a\u009b\7]\2\2\u009b\u009c\b\30\n\2\u009c\62\3\2\2\2\u009d"+
		"\u009e\7_\2\2\u009e\u009f\b\31\13\2\u009f\64\3\2\2\2\u00a0\u00a1\7.\2"+
		"\2\u00a1\66\3\2\2\2\u00a2\u00a4\7/\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b0\3\2"+
		"\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b18\3\2\2\2\u00b2\u00b6"+
		"\t\4\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7:\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b9\u00ba\7?\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc>\3\2\2\2\u00bd"+
		"\u00be\7\177\2\2\u00be@\3\2\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3B"+
		"\3\2\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b!\2\2\u00c7"+
		"D\3\2\2\2\u00c8\u00c9\7]\2\2\u00c9\u00ca\b\"\f\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\"\r\2\u00cc\u00cd\b\"\16\2\u00cdF\3\2\2\2\u00ce\u00cf\7$\2\2"+
		"\u00cf\u00d0\7\177\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b#\7\2\u00d2\u00d3"+
		"\b#\17\2\u00d3H\3\2\2\2\u00d4\u00d5\13\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\b$\20\2\u00d7J\3\2\2\2\u00d8\u00d9\7]\2\2\u00d9\u00da\b%\21\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\b%\r\2\u00dc\u00dd\b%\16\2\u00ddL\3\2\2\2\u00de"+
		"\u00df\7$\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b&\7\2\u00e1\u00e2\b&\17"+
		"\2\u00e2N\3\2\2\2\u00e3\u00e4\13\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\b\'\20\2\u00e6P\3\2\2\2\f\2\3\4_\u00a3\u00a8\u00ae\u00b0\u00b6\u00c0"+
		"\22\b\2\2\7\3\2\t\5\2\7\4\2\3\7\2\6\2\2\3\26\3\3\27\4\3\30\5\3\31\6\3"+
		"\"\7\t\7\2\7\2\2\t\6\2\5\2\2\3%\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}