// Generated from csce322hmwrk01prt01.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, START=2, END=3, TYPE=4, VALUE=5, NUM=6, MOVE=7, BEGIN_BOARD=8, 
		END_BOARD=9, BEGIN_LIST=10, END_LIST=11, END_ROW=12, WS=13, ANYTHING=14;
	public static final int
		RULE_boss = 0, RULE_move_list = 1, RULE_row_items = 2, RULE_row_list = 3, 
		RULE_start = 4, RULE_end = 5, RULE_assignment = 6, RULE_begin_board = 7, 
		RULE_end_board = 8, RULE_type = 9, RULE_move = 10, RULE_num = 11, RULE_end_row = 12, 
		RULE_file_end = 13, RULE_moves_sec = 14, RULE_puzzle_sec = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"boss", "move_list", "row_items", "row_list", "start", "end", "assignment", 
			"begin_board", "end_board", "type", "move", "num", "end_row", "file_end", 
			"moves_sec", "puzzle_sec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'<<alpha'", "'omega>>'", null, "'='", null, null, "'{'", 
			"'}'", "'['", "']'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "START", "END", "TYPE", "VALUE", "NUM", "MOVE", "BEGIN_BOARD", 
			"END_BOARD", "BEGIN_LIST", "END_LIST", "END_ROW", "WS", "ANYTHING"
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
		public Token ANYTHING;
		public Moves_secContext moves_sec() {
			return getRuleContext(Moves_secContext.class,0);
		}
		public Puzzle_secContext puzzle_sec() {
			return getRuleContext(Puzzle_secContext.class,0);
		}
		public File_endContext file_end() {
			return getRuleContext(File_endContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322hmwrk01prt01Parser.EOF, 0); }
		public TerminalNode ANYTHING() { return getToken(csce322hmwrk01prt01Parser.ANYTHING, 0); }
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				moves_sec();
				setState(33);
				puzzle_sec();
				setState(34);
				file_end();
				setState(35);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				puzzle_sec();
				setState(38);
				file_end();
				setState(39);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				puzzle_sec();
				setState(42);
				moves_sec();
				setState(43);
				file_end();
				setState(44);
				match(EOF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				((BossContext)_localctx).ANYTHING = match(ANYTHING);
				System.out.println("Line " + (((BossContext)_localctx).ANYTHING!=null?((BossContext)_localctx).ANYTHING.getLine():0) + " Contains Unrecognized Token " + (((BossContext)_localctx).ANYTHING!=null?((BossContext)_localctx).ANYTHING.getText():null)); System.exit(1);
				}
				break;
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

	public static class Move_listContext extends ParserRuleContext {
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public Move_listContext move_list() {
			return getRuleContext(Move_listContext.class,0);
		}
		public Move_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterMove_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitMove_list(this);
		}
	}

	public final Move_listContext move_list() throws RecognitionException {
		Move_listContext _localctx = new Move_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_move_list);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(51);
				move();
				setState(52);
				match(T__0);
				setState(53);
				move_list();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				move();
				}
				break;
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

	public static class Row_itemsContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Row_itemsContext row_items() {
			return getRuleContext(Row_itemsContext.class,0);
		}
		public Row_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterRow_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitRow_items(this);
		}
	}

	public final Row_itemsContext row_items() throws RecognitionException {
		Row_itemsContext _localctx = new Row_itemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row_items);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(58);
				num();
				setState(59);
				match(T__0);
				setState(60);
				row_items();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				num();
				}
				break;
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

	public static class Row_listContext extends ParserRuleContext {
		public Row_itemsContext row_items() {
			return getRuleContext(Row_itemsContext.class,0);
		}
		public End_rowContext end_row() {
			return getRuleContext(End_rowContext.class,0);
		}
		public Row_listContext row_list() {
			return getRuleContext(Row_listContext.class,0);
		}
		public Row_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterRow_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitRow_list(this);
		}
	}

	public final Row_listContext row_list() throws RecognitionException {
		Row_listContext _localctx = new Row_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row_list);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(66);
				row_items();
				setState(67);
				end_row();
				setState(68);
				row_list();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				row_items();
				}
				break;
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
		public Token START;
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
		enterRule(_localctx, 8, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((StartContext)_localctx).START = match(START);
			System.out.println("Start Section: " + (((StartContext)_localctx).START!=null?((StartContext)_localctx).START.getText():null));
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
		public Token END;
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
		enterRule(_localctx, 10, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((EndContext)_localctx).END = match(END);
			System.out.println("End Section: " + (((EndContext)_localctx).END!=null?((EndContext)_localctx).END.getText():null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(csce322hmwrk01prt01Parser.VALUE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(VALUE);
			System.out.println("Assignment: = ");
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

	public static class Begin_boardContext extends ParserRuleContext {
		public TerminalNode BEGIN_BOARD() { return getToken(csce322hmwrk01prt01Parser.BEGIN_BOARD, 0); }
		public Begin_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterBegin_board(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitBegin_board(this);
		}
	}

	public final Begin_boardContext begin_board() throws RecognitionException {
		Begin_boardContext _localctx = new Begin_boardContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(BEGIN_BOARD);
			System.out.println("Start Puzzle: {");
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

	public static class End_boardContext extends ParserRuleContext {
		public TerminalNode END_BOARD() { return getToken(csce322hmwrk01prt01Parser.END_BOARD, 0); }
		public End_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterEnd_board(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitEnd_board(this);
		}
	}

	public final End_boardContext end_board() throws RecognitionException {
		End_boardContext _localctx = new End_boardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(END_BOARD);
			System.out.println("End Puzzle: }");
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

	public static class TypeContext extends ParserRuleContext {
		public Token TYPE;
		public TerminalNode TYPE() { return getToken(csce322hmwrk01prt01Parser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((TypeContext)_localctx).TYPE = match(TYPE);
			System.out.println("Section: " + (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null));
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

	public static class MoveContext extends ParserRuleContext {
		public Token MOVE;
		public TerminalNode MOVE() { return getToken(csce322hmwrk01prt01Parser.MOVE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((MoveContext)_localctx).MOVE = match(MOVE);
			System.out.println("Move: " + (((MoveContext)_localctx).MOVE!=null?((MoveContext)_localctx).MOVE.getText():null));
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

	public static class NumContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(csce322hmwrk01prt01Parser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((NumContext)_localctx).NUM = match(NUM);
			System.out.println("Tile: " + (((NumContext)_localctx).NUM!=null?((NumContext)_localctx).NUM.getText():null));
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

	public static class End_rowContext extends ParserRuleContext {
		public TerminalNode END_ROW() { return getToken(csce322hmwrk01prt01Parser.END_ROW, 0); }
		public End_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterEnd_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitEnd_row(this);
		}
	}

	public final End_rowContext end_row() throws RecognitionException {
		End_rowContext _localctx = new End_rowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_end_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(END_ROW);
			System.out.println("End Row: $");
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

	public static class File_endContext extends ParserRuleContext {
		public File_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterFile_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitFile_end(this);
		}
	}

	public final File_endContext file_end() throws RecognitionException {
		File_endContext _localctx = new File_endContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_file_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.print("End of File");
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

	public static class Moves_secContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode BEGIN_LIST() { return getToken(csce322hmwrk01prt01Parser.BEGIN_LIST, 0); }
		public Move_listContext move_list() {
			return getRuleContext(Move_listContext.class,0);
		}
		public TerminalNode END_LIST() { return getToken(csce322hmwrk01prt01Parser.END_LIST, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Moves_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterMoves_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitMoves_sec(this);
		}
	}

	public final Moves_secContext moves_sec() throws RecognitionException {
		Moves_secContext _localctx = new Moves_secContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_moves_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			start();
			setState(103);
			type();
			setState(104);
			assignment();
			setState(105);
			match(BEGIN_LIST);
			setState(106);
			move_list();
			setState(107);
			match(END_LIST);
			setState(108);
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

	public static class Puzzle_secContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Begin_boardContext begin_board() {
			return getRuleContext(Begin_boardContext.class,0);
		}
		public Row_listContext row_list() {
			return getRuleContext(Row_listContext.class,0);
		}
		public End_boardContext end_board() {
			return getRuleContext(End_boardContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Puzzle_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puzzle_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).enterPuzzle_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt01Listener ) ((csce322hmwrk01prt01Listener)listener).exitPuzzle_sec(this);
		}
	}

	public final Puzzle_secContext puzzle_sec() throws RecognitionException {
		Puzzle_secContext _localctx = new Puzzle_secContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_puzzle_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			start();
			setState(111);
			type();
			setState(112);
			assignment();
			setState(113);
			begin_board();
			setState(114);
			row_list();
			setState(115);
			end_board();
			setState(116);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2p"+
		"\2\62\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fN\3\2\2\2\16"+
		"Q\3\2\2\2\20T\3\2\2\2\22W\3\2\2\2\24Z\3\2\2\2\26]\3\2\2\2\30`\3\2\2\2"+
		"\32c\3\2\2\2\34f\3\2\2\2\36h\3\2\2\2 p\3\2\2\2\"#\5\36\20\2#$\5 \21\2"+
		"$%\5\34\17\2%&\7\2\2\3&\63\3\2\2\2\'(\5 \21\2()\5\34\17\2)*\7\2\2\3*\63"+
		"\3\2\2\2+,\5 \21\2,-\5\36\20\2-.\5\34\17\2./\7\2\2\3/\63\3\2\2\2\60\61"+
		"\7\20\2\2\61\63\b\2\1\2\62\"\3\2\2\2\62\'\3\2\2\2\62+\3\2\2\2\62\60\3"+
		"\2\2\2\63\3\3\2\2\2\64;\3\2\2\2\65\66\5\26\f\2\66\67\7\3\2\2\678\5\4\3"+
		"\28;\3\2\2\29;\5\26\f\2:\64\3\2\2\2:\65\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<"+
		"=\5\30\r\2=>\7\3\2\2>?\5\6\4\2?B\3\2\2\2@B\5\30\r\2A<\3\2\2\2A@\3\2\2"+
		"\2B\7\3\2\2\2CJ\3\2\2\2DE\5\6\4\2EF\5\32\16\2FG\5\b\5\2GJ\3\2\2\2HJ\5"+
		"\6\4\2IC\3\2\2\2ID\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\7\4\2\2LM\b\6\1\2M\13"+
		"\3\2\2\2NO\7\5\2\2OP\b\7\1\2P\r\3\2\2\2QR\7\7\2\2RS\b\b\1\2S\17\3\2\2"+
		"\2TU\7\n\2\2UV\b\t\1\2V\21\3\2\2\2WX\7\13\2\2XY\b\n\1\2Y\23\3\2\2\2Z["+
		"\7\6\2\2[\\\b\13\1\2\\\25\3\2\2\2]^\7\t\2\2^_\b\f\1\2_\27\3\2\2\2`a\7"+
		"\b\2\2ab\b\r\1\2b\31\3\2\2\2cd\7\16\2\2de\b\16\1\2e\33\3\2\2\2fg\b\17"+
		"\1\2g\35\3\2\2\2hi\5\n\6\2ij\5\24\13\2jk\5\16\b\2kl\7\f\2\2lm\5\4\3\2"+
		"mn\7\r\2\2no\5\f\7\2o\37\3\2\2\2pq\5\n\6\2qr\5\24\13\2rs\5\16\b\2st\5"+
		"\20\t\2tu\5\b\5\2uv\5\22\n\2vw\5\f\7\2w!\3\2\2\2\6\62:AI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}