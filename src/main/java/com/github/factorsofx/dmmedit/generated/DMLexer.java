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
		INDENT=1, DEDENT=2, DOC_STRING=3, STRING=4, NUM=5, NL=6, IDENTIFIER=7, 
		PATH_SEPARATOR=8, EQUALS=9, BRACE_OPEN=10, BRACE_CLOSE=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DOC_STRING", "STRING", "NUM", "NL", "IDENTIFIER", "PATH_SEPARATOR", "EQUALS", 
		"BRACE_OPEN", "BRACE_CLOSE", "WS"
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


	private final DenterHelper denter = new DenterHelper(NL, DMLexer.INDENT, DMLexer.DEDENT)
	{
	    @Override
	    public Token pullToken()
	    {
	        return DMLexer.super.nextToken();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\4\5\4.\n\4\3\4\6\4\61\n\4\r\4\16\4"+
		"\62\3\4\3\4\6\4\67\n\4\r\4\16\48\5\4;\n\4\3\5\5\5>\n\5\3\5\3\5\7\5B\n"+
		"\5\f\5\16\5E\13\5\3\5\5\5H\n\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\4\35\'\2\f\3\5\5\6\7\7\t"+
		"\b\13\t\r\n\17\13\21\f\23\r\25\16\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aa"+
		"c|\4\2\13\13\"\"\2e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\3\27\3\2\2\2\5#\3\2\2\2\7-\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rP\3"+
		"\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27\30\7}\2\2\30"+
		"\31\7$\2\2\31\35\3\2\2\2\32\34\13\2\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35"+
		"\36\3\2\2\2\35\33\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7$\2\2!\"\7\177"+
		"\2\2\"\4\3\2\2\2#\'\7$\2\2$&\13\2\2\2%$\3\2\2\2&)\3\2\2\2\'(\3\2\2\2\'"+
		"%\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7$\2\2+\6\3\2\2\2,.\7/\2\2-,\3\2\2\2"+
		"-.\3\2\2\2.\60\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2"+
		"\2\2\62\63\3\2\2\2\63:\3\2\2\2\64\66\7\60\2\2\65\67\t\2\2\2\66\65\3\2"+
		"\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:\64\3\2\2\2:;\3\2\2\2"+
		";\b\3\2\2\2<>\7\17\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?C\7\f\2\2@B\5\25"+
		"\13\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2EC\3\2\2\2FH\7"+
		"=\2\2G=\3\2\2\2GF\3\2\2\2H\n\3\2\2\2IM\t\3\2\2JL\t\4\2\2KJ\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2N\f\3\2\2\2OM\3\2\2\2PQ\7\61\2\2Q\16\3\2\2\2"+
		"RS\7?\2\2S\20\3\2\2\2TU\7}\2\2U\22\3\2\2\2VW\7\177\2\2W\24\3\2\2\2XY\t"+
		"\5\2\2YZ\3\2\2\2Z[\b\13\2\2[\26\3\2\2\2\r\2\35\'-\628:=CGM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}