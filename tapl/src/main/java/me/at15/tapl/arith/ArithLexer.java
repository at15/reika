// Generated from Arith.g4 by ANTLR 4.7
package me.at15.tapl.arith;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'if'", "'then'", "'else'", "'0'", "'succ'", 
		"'pred'", "'iszero'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS"
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


	public ArithLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arith.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fI\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13D\n\13\r\13\16\13E\3\13"+
		"\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\3\5\2\13"+
		"\f\17\17\"\"\2I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\3\27\3\2\2\2\5\34\3\2\2\2\7\"\3\2\2\2\t%\3\2\2\2\13*\3\2\2\2\r/\3\2\2"+
		"\2\17\61\3\2\2\2\21\66\3\2\2\2\23;\3\2\2\2\25C\3\2\2\2\27\30\7v\2\2\30"+
		"\31\7t\2\2\31\32\7w\2\2\32\33\7g\2\2\33\4\3\2\2\2\34\35\7h\2\2\35\36\7"+
		"c\2\2\36\37\7n\2\2\37 \7u\2\2 !\7g\2\2!\6\3\2\2\2\"#\7k\2\2#$\7h\2\2$"+
		"\b\3\2\2\2%&\7v\2\2&\'\7j\2\2\'(\7g\2\2()\7p\2\2)\n\3\2\2\2*+\7g\2\2+"+
		",\7n\2\2,-\7u\2\2-.\7g\2\2.\f\3\2\2\2/\60\7\62\2\2\60\16\3\2\2\2\61\62"+
		"\7u\2\2\62\63\7w\2\2\63\64\7e\2\2\64\65\7e\2\2\65\20\3\2\2\2\66\67\7r"+
		"\2\2\678\7t\2\289\7g\2\29:\7f\2\2:\22\3\2\2\2;<\7k\2\2<=\7u\2\2=>\7|\2"+
		"\2>?\7g\2\2?@\7t\2\2@A\7q\2\2A\24\3\2\2\2BD\t\2\2\2CB\3\2\2\2DE\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\b\13\2\2H\26\3\2\2\2\4\2E\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}