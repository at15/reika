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
		BOOL=10, INT=11, DOUBLE=12, STRING=13, BIN_OP=14, ID=15, WS=16, BLOCK_COMMENT=17, 
		SINGLE_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"BOOL", "INT", "DOUBLE", "STRING", "ESC", "BIN_OP", "ID", "LETTER", "WS", 
		"BLOCK_COMMENT", "SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'['", "']'", "'{'", "':'", "','", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BOOL", "INT", 
		"DOUBLE", "STRING", "BIN_OP", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13G\n\13\3\f\6\fJ\n\f\r\f\16\fK\3\f\7\fO\n\f\f\f\16\f"+
		"R\13\f\3\r\6\rU\n\r\r\r\16\rV\3\r\3\r\6\r[\n\r\r\r\16\r\\\3\16\3\16\3"+
		"\16\7\16b\n\16\f\16\16\16e\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17m\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20v\n\20\3\21\3\21\3\21\7\21"+
		"{\n\21\f\21\16\21~\13\21\3\22\3\22\3\23\6\23\u0083\n\23\r\23\16\23\u0084"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u008d\n\24\f\24\16\24\u0090\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009b\n\25\f\25\16"+
		"\25\u009e\13\25\3\25\3\25\3\25\3\25\5c\u008e\u009c\2\26\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\20!\21#\2%\22"+
		"\'\23)\24\3\2\7\3\2\63;\3\2\62;\5\2,-//\61\61\4\2C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2"+
		"\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25"+
		"F\3\2\2\2\27I\3\2\2\2\31T\3\2\2\2\33^\3\2\2\2\35l\3\2\2\2\37u\3\2\2\2"+
		"!w\3\2\2\2#\177\3\2\2\2%\u0082\3\2\2\2\'\u0088\3\2\2\2)\u0096\3\2\2\2"+
		"+,\7=\2\2,\4\3\2\2\2-.\7*\2\2.\6\3\2\2\2/\60\7+\2\2\60\b\3\2\2\2\61\62"+
		"\7]\2\2\62\n\3\2\2\2\63\64\7_\2\2\64\f\3\2\2\2\65\66\7}\2\2\66\16\3\2"+
		"\2\2\678\7<\2\28\20\3\2\2\29:\7.\2\2:\22\3\2\2\2;<\7\177\2\2<\24\3\2\2"+
		"\2=>\7v\2\2>?\7t\2\2?@\7w\2\2@G\7g\2\2AB\7h\2\2BC\7c\2\2CD\7n\2\2DE\7"+
		"u\2\2EG\7g\2\2F=\3\2\2\2FA\3\2\2\2G\26\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2\2MO\t\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RP\3\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2V"+
		"T\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7\60\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\32\3\2\2\2^c\7$\2\2_b\5\35\17\2`b\13\2\2\2a"+
		"_\3\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fg\7$\2\2g\34\3\2\2\2hi\7^\2\2im\7$\2\2jk\7^\2\2km\7^\2\2lh\3\2\2\2lj"+
		"\3\2\2\2m\36\3\2\2\2nv\t\4\2\2op\7t\2\2pq\7c\2\2qr\7p\2\2rs\7f\2\2st\7"+
		"q\2\2tv\7o\2\2un\3\2\2\2uo\3\2\2\2v \3\2\2\2w|\5#\22\2x{\5#\22\2y{\t\3"+
		"\2\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\"\3\2\2\2~|\3"+
		"\2\2\2\177\u0080\t\5\2\2\u0080$\3\2\2\2\u0081\u0083\t\6\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\23\2\2\u0087&\3\2\2\2\u0088\u0089\7\61\2"+
		"\2\u0089\u008a\7,\2\2\u008a\u008e\3\2\2\2\u008b\u008d\13\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0093\7\61"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\24\2\2\u0095(\3\2\2\2\u0096\u0097"+
		"\7\61\2\2\u0097\u0098\7\61\2\2\u0098\u009c\3\2\2\2\u0099\u009b\13\2\2"+
		"\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\b\25\2\2\u00a2*\3\2\2\2\21\2FKPV\\acluz|\u0084"+
		"\u008e\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}