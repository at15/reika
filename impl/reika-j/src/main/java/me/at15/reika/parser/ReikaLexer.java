// Generated from Reika.g4 by ANTLR 4.7
package me.at15.reika.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReikaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BOOL=5, INT=6, DOUBLE=7, STRING=8, BINARY_OP_LOW=9, 
		BINARY_OP_HIGH=10, ID=11, WS=12, BLOCK_COMMENT=13, SINGLE_COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "BOOL", "INT", "DOUBLE", "STRING", "ESC", 
		"BINARY_OP_LOW", "BINARY_OP_HIGH", "ID", "LETTER", "WS", "BLOCK_COMMENT", 
		"SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "BOOL", "INT", "DOUBLE", "STRING", "BINARY_OP_LOW", 
		"BINARY_OP_HIGH", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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


	public ReikaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Reika.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65"+
		"\n\6\3\7\6\78\n\7\r\7\16\79\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\6\bC\n\b\r"+
		"\b\16\bD\3\b\3\b\6\bI\n\b\r\b\16\bJ\3\t\3\t\3\t\7\tP\n\t\f\t\16\tS\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r"+
		"d\n\r\f\r\16\rg\13\r\3\16\3\16\3\17\6\17l\n\17\r\17\16\17m\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20v\n\20\f\20\16\20y\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\7\21\u0084\n\21\f\21\16\21\u0087\13\21\3\21\3"+
		"\21\3\21\3\21\5Qw\u0085\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25"+
		"\13\27\f\31\r\33\2\35\16\37\17!\20\3\2\b\3\2\63;\3\2\62;\4\2--//\5\2\'"+
		"\',,\61\61\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0096\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13\64\3\2\2"+
		"\2\r\67\3\2\2\2\17B\3\2\2\2\21L\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27^\3"+
		"\2\2\2\31`\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37q\3\2\2\2!\177\3\2\2\2#$"+
		"\7=\2\2$\4\3\2\2\2%&\7/\2\2&\6\3\2\2\2\'(\7*\2\2(\b\3\2\2\2)*\7+\2\2*"+
		"\n\3\2\2\2+,\7v\2\2,-\7t\2\2-.\7w\2\2.\65\7g\2\2/\60\7h\2\2\60\61\7c\2"+
		"\2\61\62\7n\2\2\62\63\7u\2\2\63\65\7g\2\2\64+\3\2\2\2\64/\3\2\2\2\65\f"+
		"\3\2\2\2\668\t\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3"+
		"\2\2\2;=\t\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\16\3\2\2\2@"+
		">\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2"+
		"FH\7\60\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\20\3\2"+
		"\2\2LQ\7$\2\2MP\5\23\n\2NP\13\2\2\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QR\3"+
		"\2\2\2QO\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7$\2\2U\22\3\2\2\2VW\7^\2\2W[\7"+
		"$\2\2XY\7^\2\2Y[\7^\2\2ZV\3\2\2\2ZX\3\2\2\2[\24\3\2\2\2\\]\t\4\2\2]\26"+
		"\3\2\2\2^_\t\5\2\2_\30\3\2\2\2`e\5\33\16\2ad\5\33\16\2bd\t\3\2\2ca\3\2"+
		"\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\32\3\2\2\2ge\3\2\2\2hi\t"+
		"\6\2\2i\34\3\2\2\2jl\t\7\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"o\3\2\2\2op\b\17\2\2p\36\3\2\2\2qr\7\61\2\2rs\7,\2\2sw\3\2\2\2tv\13\2"+
		"\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7,"+
		"\2\2{|\7\61\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2\177\u0080\7\61\2\2\u0080"+
		"\u0081\7\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\f\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\b\21\2\2\u008b\"\3\2\2\2\20\2\649>DJOQZcemw\u0085\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}