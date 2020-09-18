// Generated from csce322hmwrk01prt02.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hmwrk01prt02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, START=2, END=3, TYPE=4, VALUE=5, NUM=6, MOVE=7, BEGIN_BOARD=8, 
		END_BOARD=9, BEGIN_LIST=10, END_LIST=11, END_ROW=12, WS=13, ANYTHING=14;
	public static final int
		RULE_boss = 0, RULE_move_list = 1, RULE_row_items = 2, RULE_row_list = 3, 
		RULE_start = 4, RULE_end = 5, RULE_assignment = 6, RULE_begin_move = 7, 
		RULE_begin_board = 8, RULE_end_board = 9, RULE_type = 10, RULE_move = 11, 
		RULE_row_start = 12, RULE_first_row = 13, RULE_num = 14, RULE_end_row = 15, 
		RULE_file_end = 16, RULE_moves_sec = 17, RULE_puzzle_sec = 18, RULE_semantic_checks = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"boss", "move_list", "row_items", "row_list", "start", "end", "assignment", 
			"begin_move", "begin_board", "end_board", "type", "move", "row_start", 
			"first_row", "num", "end_row", "file_end", "moves_sec", "puzzle_sec", 
			"semantic_checks"
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
	public String getGrammarFileName() { return "csce322hmwrk01prt02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int moves_sec_num = 0;
	    int puzzles_sec_num = 0;
	    int moves_counter = 0;
	    int row_counter = 0;
	    int column_counter = 0;
	    int num_counter = 0;
	    int max_num = -1; 
	    boolean valid = true;

	public csce322hmwrk01prt02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BossContext extends ParserRuleContext {
		public Moves_secContext moves_sec() {
			return getRuleContext(Moves_secContext.class,0);
		}
		public Puzzle_secContext puzzle_sec() {
			return getRuleContext(Puzzle_secContext.class,0);
		}
		public File_endContext file_end() {
			return getRuleContext(File_endContext.class,0);
		}
		public Semantic_checksContext semantic_checks() {
			return getRuleContext(Semantic_checksContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322hmwrk01prt02Parser.EOF, 0); }
		public BossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterBoss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitBoss(this);
		}
	}

	public final BossContext boss() throws RecognitionException {
		BossContext _localctx = new BossContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_boss);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				moves_sec();
				setState(41);
				puzzle_sec();
				setState(42);
				file_end();
				setState(43);
				semantic_checks();
				setState(44);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				puzzle_sec();
				setState(47);
				moves_sec();
				setState(48);
				file_end();
				setState(49);
				semantic_checks();
				setState(50);
				match(EOF);
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
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterMove_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitMove_list(this);
		}
	}

	public final Move_listContext move_list() throws RecognitionException {
		Move_listContext _localctx = new Move_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_move_list);
		try {
			setState(60);
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
				setState(55);
				move();
				setState(56);
				match(T__0);
				setState(57);
				move_list();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
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
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterRow_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitRow_items(this);
		}
	}

	public final Row_itemsContext row_items() throws RecognitionException {
		Row_itemsContext _localctx = new Row_itemsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row_items);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(62);
				num();
				setState(63);
				match(T__0);
				setState(64);
				row_items();
				}
				column_counter++; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				num();
				column_counter++; 
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
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterRow_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitRow_list(this);
		}
	}

	public final Row_listContext row_list() throws RecognitionException {
		Row_listContext _localctx = new Row_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row_list);
		try {
			setState(79);
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
				setState(74);
				row_items();
				setState(75);
				end_row();
				setState(76);
				row_list();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(78);
				row_items();
				}
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
		public TerminalNode START() { return getToken(csce322hmwrk01prt02Parser.START, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		public TerminalNode END() { return getToken(csce322hmwrk01prt02Parser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(csce322hmwrk01prt02Parser.VALUE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VALUE);
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

	public static class Begin_moveContext extends ParserRuleContext {
		public TerminalNode BEGIN_LIST() { return getToken(csce322hmwrk01prt02Parser.BEGIN_LIST, 0); }
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public Begin_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterBegin_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitBegin_move(this);
		}
	}

	public final Begin_moveContext begin_move() throws RecognitionException {
		Begin_moveContext _localctx = new Begin_moveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(BEGIN_LIST);
			{
			setState(88);
			move();
			setState(89);
			match(T__0);
			setState(90);
			move();
			setState(91);
			match(T__0);
			}
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
		public TerminalNode BEGIN_BOARD() { return getToken(csce322hmwrk01prt02Parser.BEGIN_BOARD, 0); }
		public Begin_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterBegin_board(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitBegin_board(this);
		}
	}

	public final Begin_boardContext begin_board() throws RecognitionException {
		Begin_boardContext _localctx = new Begin_boardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_begin_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(BEGIN_BOARD);
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
		public TerminalNode END_BOARD() { return getToken(csce322hmwrk01prt02Parser.END_BOARD, 0); }
		public End_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterEnd_board(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitEnd_board(this);
		}
	}

	public final End_boardContext end_board() throws RecognitionException {
		End_boardContext _localctx = new End_boardContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(END_BOARD);
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
		public TerminalNode TYPE() { return getToken(csce322hmwrk01prt02Parser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TYPE);
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
		public TerminalNode MOVE() { return getToken(csce322hmwrk01prt02Parser.MOVE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(MOVE);

			    moves_counter++;

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

	public static class Row_startContext extends ParserRuleContext {
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public Row_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterRow_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitRow_start(this);
		}
	}

	public final Row_startContext row_start() throws RecognitionException {
		Row_startContext _localctx = new Row_startContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_row_start);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				num();
				setState(103);
				match(T__0);
				setState(104);
				num();
				setState(105);
				match(T__0);
				}
				column_counter += 2;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(109);
				num();
				setState(110);
				match(T__0);
				setState(111);
				num();
				}
				column_counter += 2;
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

	public static class First_rowContext extends ParserRuleContext {
		public Row_startContext row_start() {
			return getRuleContext(Row_startContext.class,0);
		}
		public Row_itemsContext row_items() {
			return getRuleContext(Row_itemsContext.class,0);
		}
		public End_rowContext end_row() {
			return getRuleContext(End_rowContext.class,0);
		}
		public First_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterFirst_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitFirst_row(this);
		}
	}

	public final First_rowContext first_row() throws RecognitionException {
		First_rowContext _localctx = new First_rowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_first_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			row_start();
			setState(118);
			row_items();
			setState(119);
			end_row();
			}
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
		public TerminalNode NUM() { return getToken(csce322hmwrk01prt02Parser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((NumContext)_localctx).NUM = match(NUM);

			    int read_in_num = Integer.parseInt((((NumContext)_localctx).NUM!=null?((NumContext)_localctx).NUM.getText():null));
			    if (read_in_num < 0) {
			        System.out.println("Semantic Error: Rule 1 Violated");
			        valid = false;
			    }
			    else if (read_in_num > 0){
			        num_counter++;
			    }
			    if (read_in_num > max_num){
			        max_num = read_in_num;
			    }
			    

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
		public TerminalNode END_ROW() { return getToken(csce322hmwrk01prt02Parser.END_ROW, 0); }
		public End_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterEnd_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitEnd_row(this);
		}
	}

	public final End_rowContext end_row() throws RecognitionException {
		End_rowContext _localctx = new End_rowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_end_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(END_ROW);
			row_counter++; column_counter = 0;
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
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterFile_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitFile_end(this);
		}
	}

	public final File_endContext file_end() throws RecognitionException {
		File_endContext _localctx = new File_endContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_file_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public Begin_moveContext begin_move() {
			return getRuleContext(Begin_moveContext.class,0);
		}
		public Move_listContext move_list() {
			return getRuleContext(Move_listContext.class,0);
		}
		public TerminalNode END_LIST() { return getToken(csce322hmwrk01prt02Parser.END_LIST, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Moves_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterMoves_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitMoves_sec(this);
		}
	}

	public final Moves_secContext moves_sec() throws RecognitionException {
		Moves_secContext _localctx = new Moves_secContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_moves_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			start();
			setState(130);
			type();
			setState(131);
			assignment();
			setState(132);
			begin_move();
			setState(133);
			move_list();
			setState(134);
			match(END_LIST);
			setState(135);
			end();
			moves_sec_num++;
					
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
		public First_rowContext first_row() {
			return getRuleContext(First_rowContext.class,0);
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
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterPuzzle_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitPuzzle_sec(this);
		}
	}

	public final Puzzle_secContext puzzle_sec() throws RecognitionException {
		Puzzle_secContext _localctx = new Puzzle_secContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_puzzle_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			start();
			setState(139);
			type();
			setState(140);
			assignment();
			setState(141);
			begin_board();
			setState(142);
			first_row();
			setState(143);
			row_list();
			setState(144);
			end_board();
			setState(145);
			end();
			puzzles_sec_num++;
					
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

	public static class Semantic_checksContext extends ParserRuleContext {
		public Semantic_checksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semantic_checks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).enterSemantic_checks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hmwrk01prt02Listener ) ((csce322hmwrk01prt02Listener)listener).exitSemantic_checks(this);
		}
	}

	public final Semantic_checksContext semantic_checks() throws RecognitionException {
		Semantic_checksContext _localctx = new Semantic_checksContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_semantic_checks);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    row_counter ++; //adding last row counter since last row doesn't have '$'

			    if (max_num > num_counter){
			        System.out.println("Semantic Error: Rule 1 Violated");
			        valid = false;
			    }

			    if (row_counter <= 2 || row_counter >= 10){
			        System.out.println("Semantic Error: Rule 2 Violated");
			        valid = false;
			    }

			    if (column_counter <= 2 || column_counter >= 10){
			        System.out.println("Semantic Error: Rule 3 Violated");
			        valid = false;
			    }

			    if (valid){
			        System.out.println("The puzzle has " + num_counter + " tiles.");
			    }


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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16v\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\2\2\u008b\2\66\3\2\2\2\4>\3\2\2\2\6I\3\2\2\2\b"+
		"Q\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22_\3\2\2\2\24"+
		"a\3\2\2\2\26c\3\2\2\2\30e\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36{\3\2\2\2"+
		" ~\3\2\2\2\"\u0081\3\2\2\2$\u0083\3\2\2\2&\u008c\3\2\2\2(\u0096\3\2\2"+
		"\2*+\5$\23\2+,\5&\24\2,-\5\"\22\2-.\5(\25\2./\7\2\2\3/\67\3\2\2\2\60\61"+
		"\5&\24\2\61\62\5$\23\2\62\63\5\"\22\2\63\64\5(\25\2\64\65\7\2\2\3\65\67"+
		"\3\2\2\2\66*\3\2\2\2\66\60\3\2\2\2\67\3\3\2\2\28?\3\2\2\29:\5\30\r\2:"+
		";\7\3\2\2;<\5\4\3\2<?\3\2\2\2=?\5\30\r\2>8\3\2\2\2>9\3\2\2\2>=\3\2\2\2"+
		"?\5\3\2\2\2@A\5\36\20\2AB\7\3\2\2BC\5\6\4\2CD\3\2\2\2DE\b\4\1\2EJ\3\2"+
		"\2\2FG\5\36\20\2GH\b\4\1\2HJ\3\2\2\2I@\3\2\2\2IF\3\2\2\2J\7\3\2\2\2KR"+
		"\3\2\2\2LM\5\6\4\2MN\5 \21\2NO\5\b\5\2OR\3\2\2\2PR\5\6\4\2QK\3\2\2\2Q"+
		"L\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\7\4\2\2T\13\3\2\2\2UV\7\5\2\2V\r\3\2"+
		"\2\2WX\7\7\2\2X\17\3\2\2\2YZ\7\f\2\2Z[\5\30\r\2[\\\7\3\2\2\\]\5\30\r\2"+
		"]^\7\3\2\2^\21\3\2\2\2_`\7\n\2\2`\23\3\2\2\2ab\7\13\2\2b\25\3\2\2\2cd"+
		"\7\6\2\2d\27\3\2\2\2ef\7\t\2\2fg\b\r\1\2g\31\3\2\2\2hi\5\36\20\2ij\7\3"+
		"\2\2jk\5\36\20\2kl\7\3\2\2lm\3\2\2\2mn\b\16\1\2nv\3\2\2\2op\5\36\20\2"+
		"pq\7\3\2\2qr\5\36\20\2rs\3\2\2\2st\b\16\1\2tv\3\2\2\2uh\3\2\2\2uo\3\2"+
		"\2\2v\33\3\2\2\2wx\5\32\16\2xy\5\6\4\2yz\5 \21\2z\35\3\2\2\2{|\7\b\2\2"+
		"|}\b\20\1\2}\37\3\2\2\2~\177\7\16\2\2\177\u0080\b\21\1\2\u0080!\3\2\2"+
		"\2\u0081\u0082\b\22\1\2\u0082#\3\2\2\2\u0083\u0084\5\n\6\2\u0084\u0085"+
		"\5\26\f\2\u0085\u0086\5\16\b\2\u0086\u0087\5\20\t\2\u0087\u0088\5\4\3"+
		"\2\u0088\u0089\7\r\2\2\u0089\u008a\5\f\7\2\u008a\u008b\b\23\1\2\u008b"+
		"%\3\2\2\2\u008c\u008d\5\n\6\2\u008d\u008e\5\26\f\2\u008e\u008f\5\16\b"+
		"\2\u008f\u0090\5\22\n\2\u0090\u0091\5\34\17\2\u0091\u0092\5\b\5\2\u0092"+
		"\u0093\5\24\13\2\u0093\u0094\5\f\7\2\u0094\u0095\b\24\1\2\u0095\'\3\2"+
		"\2\2\u0096\u0097\b\25\1\2\u0097)\3\2\2\2\7\66>IQu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}