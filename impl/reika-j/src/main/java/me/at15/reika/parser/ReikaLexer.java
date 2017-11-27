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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOL=16, INT=17, 
		DOUBLE=18, ID=19, WS=20, BLOCK_COMMENT=21, SINGLE_COMMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "BOOL", "INT", "DOUBLE", 
		"ID", "DIGIT", "ID_LETTER", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'Int'", "'Double'", "'Bool'", "'-'", "'!'", "'*'", "'/'", 
		"'%'", "'+'", "'let'", "':'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOL", "INT", "DOUBLE", "ID", "WS", "BLOCK_COMMENT", 
		"SINGLE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21g\n\21\3\22\3\22\3\22\7\22l\n\22\f\22\16\22o\13"+
		"\22\5\22q\n\22\3\23\6\23t\n\23\r\23\16\23u\3\23\3\23\6\23z\n\23\r\23\16"+
		"\23{\3\24\3\24\7\24\u0080\n\24\f\24\16\24\u0083\13\24\3\25\3\25\3\26\5"+
		"\26\u0088\n\26\3\27\6\27\u008b\n\27\r\27\16\27\u008c\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u0095\n\30\f\30\16\30\u0098\13\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\7\31\u00a3\n\31\f\31\16\31\u00a6\13\31\3"+
		"\31\3\31\3\31\3\31\4\u0096\u00a4\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\26"+
		"/\27\61\30\3\2\7\3\2\63;\3\2c|\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\3\63\3\2\2\2\5\65\3\2\2\2\79\3\2\2\2\t@\3\2\2\2\13E\3\2\2\2\rG\3\2\2"+
		"\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31U\3\2"+
		"\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!f\3\2\2\2#p\3\2\2\2%s\3\2\2\2"+
		"\'}\3\2\2\2)\u0084\3\2\2\2+\u0087\3\2\2\2-\u008a\3\2\2\2/\u0090\3\2\2"+
		"\2\61\u009e\3\2\2\2\63\64\7=\2\2\64\4\3\2\2\2\65\66\7K\2\2\66\67\7p\2"+
		"\2\678\7v\2\28\6\3\2\2\29:\7F\2\2:;\7q\2\2;<\7w\2\2<=\7d\2\2=>\7n\2\2"+
		">?\7g\2\2?\b\3\2\2\2@A\7D\2\2AB\7q\2\2BC\7q\2\2CD\7n\2\2D\n\3\2\2\2EF"+
		"\7/\2\2F\f\3\2\2\2GH\7#\2\2H\16\3\2\2\2IJ\7,\2\2J\20\3\2\2\2KL\7\61\2"+
		"\2L\22\3\2\2\2MN\7\'\2\2N\24\3\2\2\2OP\7-\2\2P\26\3\2\2\2QR\7n\2\2RS\7"+
		"g\2\2ST\7v\2\2T\30\3\2\2\2UV\7<\2\2V\32\3\2\2\2WX\7?\2\2X\34\3\2\2\2Y"+
		"Z\7*\2\2Z\36\3\2\2\2[\\\7+\2\2\\ \3\2\2\2]^\7v\2\2^_\7t\2\2_`\7w\2\2`"+
		"g\7g\2\2ab\7h\2\2bc\7c\2\2cd\7n\2\2de\7u\2\2eg\7g\2\2f]\3\2\2\2fa\3\2"+
		"\2\2g\"\3\2\2\2hq\7\62\2\2im\t\2\2\2jl\5)\25\2kj\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2ph\3\2\2\2pi\3\2\2\2q$\3\2\2\2rt\5"+
		")\25\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\60\2\2xz"+
		"\5)\25\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|&\3\2\2\2}\u0081\t\3"+
		"\2\2~\u0080\5+\26\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082(\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\t"+
		"\4\2\2\u0085*\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2\u0088,\3"+
		"\2\2\2\u0089\u008b\t\6\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\27"+
		"\2\2\u008f.\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7,\2\2\u0092\u0096"+
		"\3\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\7,\2\2\u009a\u009b\7\61\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\30\2\2\u009d\60\3\2\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\7\61"+
		"\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\b\31\2\2\u00aa\62\3\2\2\2\r\2fmpu{\u0081\u0087\u008c\u0096\u00a4"+
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