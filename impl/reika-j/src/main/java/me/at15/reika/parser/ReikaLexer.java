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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BOOL=6, INT=7, DOUBLE=8, STRING=9, 
		BINARY_OP_LOW=10, BINARY_OP_HIGH=11, ID=12, WS=13, BLOCK_COMMENT=14, SINGLE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "BOOL", "INT", "DOUBLE", "STRING", 
		"ESC", "BINARY_OP_LOW", "BINARY_OP_HIGH", "ID", "LETTER", "WS", "BLOCK_COMMENT", 
		"SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-'", "'!'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BOOL", "INT", "DOUBLE", "STRING", 
		"BINARY_OP_LOW", "BINARY_OP_HIGH", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\79\n\7\3\b\6\b<\n\b\r\b\16\b=\3\b\7\bA\n\b\f\b\16\bD\13"+
		"\b\3\t\6\tG\n\t\r\t\16\tH\3\t\3\t\6\tM\n\t\r\t\16\tN\3\n\3\n\3\n\7\nT"+
		"\n\n\f\n\16\nW\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13_\n\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\7\16h\n\16\f\16\16\16k\13\16\3\17\3\17\3\20\6\20p"+
		"\n\20\r\20\16\20q\3\20\3\20\3\21\3\21\3\21\3\21\7\21z\n\21\f\21\16\21"+
		"}\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0088\n\22\f"+
		"\22\16\22\u008b\13\22\3\22\3\22\3\22\3\22\5U{\u0089\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\2\27\f\31\r\33\16\35\2\37\17!\20#\21\3"+
		"\2\b\3\2\63;\3\2\62;\4\2--//\5\2\'\',,\61\61\4\2C\\c|\5\2\13\f\17\17\""+
		"\"\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5"+
		"\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r8\3\2\2\2\17;\3\2\2\2\21"+
		"F\3\2\2\2\23P\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2"+
		"\35l\3\2\2\2\37o\3\2\2\2!u\3\2\2\2#\u0083\3\2\2\2%&\7=\2\2&\4\3\2\2\2"+
		"\'(\7/\2\2(\6\3\2\2\2)*\7#\2\2*\b\3\2\2\2+,\7*\2\2,\n\3\2\2\2-.\7+\2\2"+
		".\f\3\2\2\2/\60\7v\2\2\60\61\7t\2\2\61\62\7w\2\2\629\7g\2\2\63\64\7h\2"+
		"\2\64\65\7c\2\2\65\66\7n\2\2\66\67\7u\2\2\679\7g\2\28/\3\2\2\28\63\3\2"+
		"\2\29\16\3\2\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3"+
		"\2\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\20\3\2\2\2D"+
		"B\3\2\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2"+
		"JL\7\60\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\22\3\2"+
		"\2\2PU\7$\2\2QT\5\25\13\2RT\13\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3"+
		"\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7$\2\2Y\24\3\2\2\2Z[\7^\2\2[_\7"+
		"$\2\2\\]\7^\2\2]_\7^\2\2^Z\3\2\2\2^\\\3\2\2\2_\26\3\2\2\2`a\t\4\2\2a\30"+
		"\3\2\2\2bc\t\5\2\2c\32\3\2\2\2di\5\35\17\2eh\5\35\17\2fh\t\3\2\2ge\3\2"+
		"\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\34\3\2\2\2ki\3\2\2\2lm\t"+
		"\6\2\2m\36\3\2\2\2np\t\7\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r"+
		"s\3\2\2\2st\b\20\2\2t \3\2\2\2uv\7\61\2\2vw\7,\2\2w{\3\2\2\2xz\13\2\2"+
		"\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7"+
		",\2\2\177\u0080\7\61\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\21\2\2\u0082"+
		"\"\3\2\2\2\u0083\u0084\7\61\2\2\u0084\u0085\7\61\2\2\u0085\u0089\3\2\2"+
		"\2\u0086\u0088\13\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008d\7\f\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\22\2\2\u008f"+
		"$\3\2\2\2\20\28=BHNSU^giq{\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}