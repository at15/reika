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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BOOL=9, 
		INT=10, DOUBLE=11, STRING=12, BIN_OP=13, ID=14, WS=15, BLOCK_COMMENT=16, 
		SINGLE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BOOL", 
		"INT", "DOUBLE", "STRING", "ESC", "BIN_OP", "ID", "LETTER", "WS", "BLOCK_COMMENT", 
		"SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'{'", "':'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BOOL", "INT", "DOUBLE", 
		"STRING", "BIN_OP", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nC\n\n\3\13"+
		"\6\13F\n\13\r\13\16\13G\3\13\7\13K\n\13\f\13\16\13N\13\13\3\f\6\fQ\n\f"+
		"\r\f\16\fR\3\f\3\f\6\fW\n\f\r\f\16\fX\3\r\3\r\3\r\7\r^\n\r\f\r\16\ra\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16i\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17r\n\17\3\20\3\20\3\20\7\20w\n\20\f\20\16\20z\13\20\3\21\3\21"+
		"\3\22\6\22\177\n\22\r\22\16\22\u0080\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u0089\n\23\f\23\16\23\u008c\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u0097\n\24\f\24\16\24\u009a\13\24\3\24\3\24\3\24\3\24"+
		"\5_\u008a\u0098\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\2\35\17\37\20!\2#\21%\22\'\23\3\2\7\3\2\63;\3\2\62;\5\2,-"+
		"//\61\61\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2"+
		"\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67"+
		"\3\2\2\2\23B\3\2\2\2\25E\3\2\2\2\27P\3\2\2\2\31Z\3\2\2\2\33h\3\2\2\2\35"+
		"q\3\2\2\2\37s\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0084\3\2\2\2\'\u0092\3\2\2"+
		"\2)*\7=\2\2*\4\3\2\2\2+,\7]\2\2,\6\3\2\2\2-.\7_\2\2.\b\3\2\2\2/\60\7}"+
		"\2\2\60\n\3\2\2\2\61\62\7<\2\2\62\f\3\2\2\2\63\64\7\177\2\2\64\16\3\2"+
		"\2\2\65\66\7*\2\2\66\20\3\2\2\2\678\7+\2\28\22\3\2\2\29:\7v\2\2:;\7t\2"+
		"\2;<\7w\2\2<C\7g\2\2=>\7h\2\2>?\7c\2\2?@\7n\2\2@A\7u\2\2AC\7g\2\2B9\3"+
		"\2\2\2B=\3\2\2\2C\24\3\2\2\2DF\t\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2G"+
		"H\3\2\2\2HL\3\2\2\2IK\t\3\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"M\26\3\2\2\2NL\3\2\2\2OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2ST\3\2\2\2TV\7\60\2\2UW\t\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\30\3\2\2\2Z_\7$\2\2[^\5\33\16\2\\^\13\2\2\2][\3\2\2\2]\\\3\2\2\2"+
		"^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7$\2\2c\32\3\2\2"+
		"\2de\7^\2\2ei\7$\2\2fg\7^\2\2gi\7^\2\2hd\3\2\2\2hf\3\2\2\2i\34\3\2\2\2"+
		"jr\t\4\2\2kl\7t\2\2lm\7c\2\2mn\7p\2\2no\7f\2\2op\7q\2\2pr\7o\2\2qj\3\2"+
		"\2\2qk\3\2\2\2r\36\3\2\2\2sx\5!\21\2tw\5!\21\2uw\t\3\2\2vt\3\2\2\2vu\3"+
		"\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y \3\2\2\2zx\3\2\2\2{|\t\5\2\2|\""+
		"\3\2\2\2}\177\t\6\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\22\2\2\u0083$\3\2\2\2"+
		"\u0084\u0085\7\61\2\2\u0085\u0086\7,\2\2\u0086\u008a\3\2\2\2\u0087\u0089"+
		"\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\7,\2\2\u008e\u008f\7\61\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\23\2\2"+
		"\u0091&\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7\61\2\2\u0094\u0098"+
		"\3\2\2\2\u0095\u0097\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7\f\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\24\2\2"+
		"\u009e(\3\2\2\2\21\2BGLRX]_hqvx\u0080\u008a\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}