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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BOOL=11, INT=12, DOUBLE=13, STRING=14, BIN_OP=15, ID=16, WS=17, 
		BLOCK_COMMENT=18, SINGLE_COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "BOOL", "INT", "DOUBLE", "STRING", "ESC", "BIN_OP", "ID", "LETTER", 
		"WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "' '", "']'", "'{'", "':'", "','", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "BOOL", 
		"INT", "DOUBLE", "STRING", "BIN_OP", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\fK\n\f\3\r\6\rN\n\r\r\r\16\rO\3\r\7\rS\n\r"+
		"\f\r\16\rV\13\r\3\16\6\16Y\n\16\r\16\16\16Z\3\16\3\16\6\16_\n\16\r\16"+
		"\16\16`\3\17\3\17\3\17\7\17f\n\17\f\17\16\17i\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\5\20q\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21z\n\21\3"+
		"\22\3\22\3\22\7\22\177\n\22\f\22\16\22\u0082\13\22\3\23\3\23\3\24\6\24"+
		"\u0087\n\24\r\24\16\24\u0088\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0091"+
		"\n\25\f\25\16\25\u0094\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\u009f\n\26\f\26\16\26\u00a2\13\26\3\26\3\26\3\26\3\26\5g\u0092"+
		"\u00a0\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\2!\21#\22%\2\'\23)\24+\25\3\2\b\3\2\63;\3\2\62;\3\2\62\62"+
		"\5\2,-//\61\61\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00b2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67"+
		"\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27J\3\2\2\2\31"+
		"M\3\2\2\2\33X\3\2\2\2\35b\3\2\2\2\37p\3\2\2\2!y\3\2\2\2#{\3\2\2\2%\u0083"+
		"\3\2\2\2\'\u0086\3\2\2\2)\u008c\3\2\2\2+\u009a\3\2\2\2-.\7=\2\2.\4\3\2"+
		"\2\2/\60\7]\2\2\60\6\3\2\2\2\61\62\7\"\2\2\62\b\3\2\2\2\63\64\7_\2\2\64"+
		"\n\3\2\2\2\65\66\7}\2\2\66\f\3\2\2\2\678\7<\2\28\16\3\2\2\29:\7.\2\2:"+
		"\20\3\2\2\2;<\7\177\2\2<\22\3\2\2\2=>\7*\2\2>\24\3\2\2\2?@\7+\2\2@\26"+
		"\3\2\2\2AB\7v\2\2BC\7t\2\2CD\7w\2\2DK\7g\2\2EF\7h\2\2FG\7c\2\2GH\7n\2"+
		"\2HI\7u\2\2IK\7g\2\2JA\3\2\2\2JE\3\2\2\2K\30\3\2\2\2LN\t\2\2\2ML\3\2\2"+
		"\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\t\3\2\2RQ\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VT\3\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\60\2\2]_\t\4\2\2^]\3\2\2\2_`"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\34\3\2\2\2bg\7$\2\2cf\5\37\20\2df\13\2\2"+
		"\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2"+
		"\2jk\7$\2\2k\36\3\2\2\2lm\7^\2\2mq\7$\2\2no\7^\2\2oq\7^\2\2pl\3\2\2\2"+
		"pn\3\2\2\2q \3\2\2\2rz\t\5\2\2st\7t\2\2tu\7c\2\2uv\7p\2\2vw\7f\2\2wx\7"+
		"q\2\2xz\7o\2\2yr\3\2\2\2ys\3\2\2\2z\"\3\2\2\2{\u0080\5%\23\2|\177\5%\23"+
		"\2}\177\t\3\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081$\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\t\6\2\2"+
		"\u0084&\3\2\2\2\u0085\u0087\t\7\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\24\2\2\u008b(\3\2\2\2\u008c\u008d\7\61\2\2\u008d\u008e\7,\2\2"+
		"\u008e\u0092\3\2\2\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7,\2\2\u0096\u0097\7\61\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\b\25\2\2\u0099*\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c"+
		"\7\61\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\b\26\2\2\u00a6,\3\2\2\2\21\2JOTZ`egpy~\u0080\u0088\u0092\u00a0"+
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