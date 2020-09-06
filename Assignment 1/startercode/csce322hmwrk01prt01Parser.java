// Generated from csce322hmwrk01prt01.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hmwrk01prt01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, TYPE=3, VALUE=4, NUM=5, MOVE=6, ROW_SEP=7, BEGIN_BOARD=8, 
		END_BOARD=9, BEGIN_LIST=10, END_LIST=11, AND=12, WS=13;
	public static final int
		RULE_boss = 0, RULE_start = 1, RULE_end = 2, RULE_moves = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"boss", "start", "end", "moves"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<alpha'", "'omega>>'", null, "'='", null, null, "'$'", "'{'", 
			"'}'", "'['", "']'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "END", "TYPE", "VALUE", "NUM", "MOVE", "ROW_SEP", "BEGIN_BOARD", 
			"END_BOARD", "BEGIN_LIST", "END_LIST", "AND", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "csce322hmwrk01prt01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322hmwrk01prt01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BossContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public BossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterBoss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitBoss(this);
		}
	}

	public final BossContext boss() throws RecognitionException {
		BossContext _localctx = new BossContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_boss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			start();
			setState(9);
			moves();
			setState(10);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(csce322hmwrk01prt01Parser.START, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(START);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(csce322hmwrk01prt01Parser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovesContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(csce322hmwrk01prt01Parser.TYPE, 0); }
		public TerminalNode VALUE() { return getToken(csce322hmwrk01prt01Parser.VALUE, 0); }
		public TerminalNode BEGIN_LIST() { return getToken(csce322hmwrk01prt01Parser.BEGIN_LIST, 0); }
		public TerminalNode MOVE() { return getToken(csce322hmwrk01prt01Parser.MOVE, 0); }
		public TerminalNode END_LIST() { return getToken(csce322hmwrk01prt01Parser.END_LIST, 0); }
		public TerminalNode END() { return getToken(csce322hmwrk01prt01Parser.END, 0); }
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterMoves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitMoves(this);
		}
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(TYPE);
			setState(17);
			match(VALUE);
			setState(18);
			match(BEGIN_LIST);
			setState(19);
			match(MOVE);
			setState(20);
			match(END_LIST);
			setState(21);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\32\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\25\2\n\3\2\2\2\4\16\3\2\2\2\6\20\3"+
		"\2\2\2\b\22\3\2\2\2\n\13\5\4\3\2\13\f\5\b\5\2\f\r\5\6\4\2\r\3\3\2\2\2"+
		"\16\17\7\3\2\2\17\5\3\2\2\2\20\21\7\4\2\2\21\7\3\2\2\2\22\23\7\5\2\2\23"+
		"\24\7\6\2\2\24\25\7\f\2\2\25\26\7\b\2\2\26\27\7\r\2\2\27\30\7\4\2\2\30"+
		"\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}