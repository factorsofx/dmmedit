// Generated from DMM.g4 by ANTLR 4.7.1
package com.github.factorsofx.dmmedit.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PATH=8, PATH_FRAG=9, 
		STR=10, FILENAME=11, NUM=12, FUNC_CALL=13, NULL=14, DOC_STR=15, IDENTIFIER=16, 
		COMMENT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PATH", "PATH_FRAG", 
		"STR", "FILENAME", "NUM", "FUNC_CALL", "NULL", "DOC_STR", "IDENTIFIER", 
		"COMMENT", "WS"
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


	public DMMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DMM.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\6\t\67\n\t\r\t\16\t8\3\n\3\n\3\n\3\13\3\13\7\13@\n\13\f\13\16\13"+
		"C\13\13\3\13\3\13\3\f\3\f\7\fI\n\f\f\f\16\fL\13\f\3\f\3\f\3\r\5\rQ\n\r"+
		"\3\r\6\rT\n\r\r\r\16\rU\3\r\3\r\6\rZ\n\r\r\r\16\r[\5\r^\n\r\3\r\5\ra\n"+
		"\r\3\r\6\rd\n\r\r\r\16\re\3\r\3\r\3\r\6\rk\n\r\r\r\16\rl\5\ro\n\r\3\16"+
		"\3\16\3\16\7\16t\n\16\f\16\16\16w\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\6\20\u0084\n\20\r\20\16\20\u0085\3\20\3\20\3"+
		"\20\3\21\3\21\7\21\u008d\n\21\f\21\16\21\u0090\13\21\3\22\3\22\3\22\3"+
		"\22\6\22\u0096\n\22\r\22\16\22\u0097\3\22\5\22\u009b\n\22\3\22\3\22\3"+
		"\22\3\22\3\23\6\23\u00a2\n\23\r\23\16\23\u00a3\3\23\3\23\7AJu\u0085\u0097"+
		"\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\3\2\7\3\2\62;\4\2--//\5\2C\\aac|\6\2\62;C\\aac|"+
		"\5\2\13\f\17\17\"\"\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3"+
		"\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2"+
		"\23:\3\2\2\2\25=\3\2\2\2\27F\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35z\3\2\2"+
		"\2\37\177\3\2\2\2!\u008a\3\2\2\2#\u0091\3\2\2\2%\u00a1\3\2\2\2\'(\7?\2"+
		"\2(\4\3\2\2\2)*\7*\2\2*\6\3\2\2\2+,\7.\2\2,\b\3\2\2\2-.\7+\2\2.\n\3\2"+
		"\2\2/\60\7}\2\2\60\f\3\2\2\2\61\62\7=\2\2\62\16\3\2\2\2\63\64\7\177\2"+
		"\2\64\20\3\2\2\2\65\67\5\23\n\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29\22\3\2\2\2:;\7\61\2\2;<\5!\21\2<\24\3\2\2\2=A\7$\2\2>@\13"+
		"\2\2\2?>\3\2\2\2@C\3\2\2\2AB\3\2\2\2A?\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7"+
		"$\2\2E\26\3\2\2\2FJ\7)\2\2GI\13\2\2\2HG\3\2\2\2IL\3\2\2\2JK\3\2\2\2JH"+
		"\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7)\2\2N\30\3\2\2\2OQ\7/\2\2PO\3\2\2\2P"+
		"Q\3\2\2\2QS\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V]\3\2\2\2WY\7\60\2\2XZ\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2]W\3\2\2\2]^\3\2\2\2^o\3\2\2\2_a\7/\2\2`_\3\2\2\2`a\3\2\2"+
		"\2ac\3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2"+
		"\2gh\7g\2\2hj\t\3\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mo\3\2\2\2nP\3\2\2\2n`\3\2\2\2o\32\3\2\2\2pq\5!\21\2qu\7*\2\2rt\13\2"+
		"\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7+"+
		"\2\2y\34\3\2\2\2z{\7p\2\2{|\7w\2\2|}\7n\2\2}~\7n\2\2~\36\3\2\2\2\177\u0080"+
		"\7}\2\2\u0080\u0081\7$\2\2\u0081\u0083\3\2\2\2\u0082\u0084\13\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7$\2\2\u0088\u0089\7\177\2\2\u0089"+
		" \3\2\2\2\u008a\u008e\t\4\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\"\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\22\2\2\u009f"+
		"$\3\2\2\2\u00a0\u00a2\t\6\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\b\23\2\2\u00a6&\3\2\2\2\24\28AJPU[]`elnu\u0085\u008e\u0097\u009a\u00a3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}