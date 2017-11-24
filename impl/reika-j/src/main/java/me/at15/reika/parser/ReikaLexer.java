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
		T__0=1, T__1=2, T__2=3, T__3=4, BOOL=5, INT=6, DOUBLE=7, STRING=8, BINARY_OP=9, 
		ID=10, WS=11, BLOCK_COMMENT=12, SINGLE_COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "BOOL", "INT", "DOUBLE", "STRING", "ESC", 
		"BINARY_OP", "ID", "LETTER", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "BOOL", "INT", "DOUBLE", "STRING", "BINARY_OP", 
		"ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\6"+
		"\7\66\n\7\r\7\16\7\67\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\6\bA\n\b\r\b\16"+
		"\bB\3\b\3\b\6\bG\n\b\r\b\16\bH\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\5\nY\n\n\3\13\3\13\3\f\3\f\3\f\7\f`\n\f\f\f\16\f"+
		"c\13\f\3\r\3\r\3\16\6\16h\n\16\r\16\16\16i\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\7\17r\n\17\f\17\16\17u\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\7\20\u0080\n\20\f\20\16\20\u0083\13\20\3\20\3\20\3\20\3\20\5"+
		"Os\u0081\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31\2"+
		"\33\r\35\16\37\17\3\2\7\3\2\63;\3\2\62;\5\2,-//\61\61\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7"+
		"%\3\2\2\2\t\'\3\2\2\2\13\62\3\2\2\2\r\65\3\2\2\2\17@\3\2\2\2\21J\3\2\2"+
		"\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31d\3\2\2\2\33g\3\2\2\2\35m\3"+
		"\2\2\2\37{\3\2\2\2!\"\7=\2\2\"\4\3\2\2\2#$\7/\2\2$\6\3\2\2\2%&\7*\2\2"+
		"&\b\3\2\2\2\'(\7+\2\2(\n\3\2\2\2)*\7v\2\2*+\7t\2\2+,\7w\2\2,\63\7g\2\2"+
		"-.\7h\2\2./\7c\2\2/\60\7n\2\2\60\61\7u\2\2\61\63\7g\2\2\62)\3\2\2\2\62"+
		"-\3\2\2\2\63\f\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28<\3\2\2\29;\t\3\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=\16\3\2\2\2><\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CD\3\2\2\2DF\7\60\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2I\20\3\2\2\2JO\7$\2\2KN\5\23\n\2LN\13\2\2\2MK\3\2\2\2ML"+
		"\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7$\2\2S\22"+
		"\3\2\2\2TU\7^\2\2UY\7$\2\2VW\7^\2\2WY\7^\2\2XT\3\2\2\2XV\3\2\2\2Y\24\3"+
		"\2\2\2Z[\t\4\2\2[\26\3\2\2\2\\a\5\31\r\2]`\5\31\r\2^`\t\3\2\2_]\3\2\2"+
		"\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\30\3\2\2\2ca\3\2\2\2de\t\5"+
		"\2\2e\32\3\2\2\2fh\t\6\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3"+
		"\2\2\2kl\b\16\2\2l\34\3\2\2\2mn\7\61\2\2no\7,\2\2os\3\2\2\2pr\13\2\2\2"+
		"qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7,\2\2"+
		"wx\7\61\2\2xy\3\2\2\2yz\b\17\2\2z\36\3\2\2\2{|\7\61\2\2|}\7\61\2\2}\u0081"+
		"\3\2\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\7\f\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\20\2\2\u0087 \3\2\2\2"+
		"\20\2\62\67<BHMOX_ais\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}