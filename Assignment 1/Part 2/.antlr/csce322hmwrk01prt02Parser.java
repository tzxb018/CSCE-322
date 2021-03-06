// Generated from c:\Users\14022\Documents\UNL 2020 Fall\CSCE 322\Assignment 1\Part 2\csce322hmwrk01prt02.g4 by ANTLR 4.8

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

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
		RULE_begin_board = 8, RULE_begin_row = 9, RULE_first_row = 10, RULE_end_board = 11, 
		RULE_type = 12, RULE_move = 13, RULE_num = 14, RULE_end_row = 15, RULE_file_end = 16, 
		RULE_moves_sec = 17, RULE_puzzle_sec = 18, RULE_semantic_checks = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"boss", "move_list", "row_items", "row_list", "start", "end", "assignment", 
			"begin_move", "begin_board", "begin_row", "first_row", "end_board", "type", 
			"move", "num", "end_row", "file_end", "moves_sec", "puzzle_sec", "semantic_checks"
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
	    boolean neg_num = false;
	    ArrayList<Integer> list_of_nums = new ArrayList<Integer>();
	    ArrayList<ArrayList<Integer>> num_matrix = new ArrayList<ArrayList<Integer>>(); 

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
		public Begin_rowContext begin_row() {
			return getRuleContext(Begin_rowContext.class,0);
		}
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
	}

	public final Row_listContext row_list() throws RecognitionException {
		Row_listContext _localctx = new Row_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row_list);
		try {
			setState(84);
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
				begin_row();
				setState(75);
				row_items();
				setState(76);
				end_row();
				setState(77);
				row_list();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(79);
				begin_row();
				setState(80);
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
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
	}

	public final Begin_moveContext begin_move() throws RecognitionException {
		Begin_moveContext _localctx = new Begin_moveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_move);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(BEGIN_LIST);
				{
				setState(93);
				move();
				setState(94);
				match(T__0);
				setState(95);
				move();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(BEGIN_LIST);
				{
				setState(98);
				move();
				setState(99);
				match(T__0);
				setState(100);
				move();
				setState(101);
				match(T__0);
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

	public static class Begin_boardContext extends ParserRuleContext {
		public TerminalNode BEGIN_BOARD() { return getToken(csce322hmwrk01prt02Parser.BEGIN_BOARD, 0); }
		public Begin_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_board; }
	}

	public final Begin_boardContext begin_board() throws RecognitionException {
		Begin_boardContext _localctx = new Begin_boardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_begin_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class Begin_rowContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Begin_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_row; }
	}

	public final Begin_rowContext begin_row() throws RecognitionException {
		Begin_rowContext _localctx = new Begin_rowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_begin_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			num();
			setState(108);
			match(T__0);
			}
			column_counter++;
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
		public Row_listContext row_list() {
			return getRuleContext(Row_listContext.class,0);
		}
		public End_rowContext end_row() {
			return getRuleContext(End_rowContext.class,0);
		}
		public First_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_row; }
	}

	public final First_rowContext first_row() throws RecognitionException {
		First_rowContext _localctx = new First_rowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_first_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			row_list();
			setState(113);
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

	public static class End_boardContext extends ParserRuleContext {
		public TerminalNode END_BOARD() { return getToken(csce322hmwrk01prt02Parser.END_BOARD, 0); }
		public End_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_board; }
	}

	public final End_boardContext end_board() throws RecognitionException {
		End_boardContext _localctx = new End_boardContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_end_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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

	public static class NumContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(csce322hmwrk01prt02Parser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((NumContext)_localctx).NUM = match(NUM);

			    int read_in_num = Integer.parseInt((((NumContext)_localctx).NUM!=null?((NumContext)_localctx).NUM.getText():null));
			    if (read_in_num < 0) {
			        neg_num = true;
			        valid = false;
			    }
			    else if (read_in_num >= 0){
			        if (read_in_num > 0){
			            num_counter++;
			        }
			        list_of_nums.add(read_in_num);
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
	}

	public final End_rowContext end_row() throws RecognitionException {
		End_rowContext _localctx = new End_rowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_end_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(END_ROW);
			row_counter++; 
			    column_counter = 0; 
			    num_matrix.add(list_of_nums); 
			    list_of_nums = new ArrayList<Integer>();
				
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
	}

	public final Moves_secContext moves_sec() throws RecognitionException {
		Moves_secContext _localctx = new Moves_secContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_moves_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			start();
			setState(131);
			type();
			setState(132);
			assignment();
			setState(133);
			begin_move();
			setState(134);
			move_list();
			setState(135);
			match(END_LIST);
			setState(136);
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
	}

	public final Puzzle_secContext puzzle_sec() throws RecognitionException {
		Puzzle_secContext _localctx = new Puzzle_secContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_puzzle_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			start();
			setState(140);
			type();
			setState(141);
			assignment();
			setState(142);
			begin_board();
			setState(143);
			first_row();
			setState(144);
			row_list();
			setState(145);
			end_board();
			setState(146);
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
	}

	public final Semantic_checksContext semantic_checks() throws RecognitionException {
		Semantic_checksContext _localctx = new Semantic_checksContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_semantic_checks);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    row_counter ++; //adding last row counter since last row doesn't have '$'
			    num_matrix.add(list_of_nums); 

			    if (max_num > num_counter || neg_num){
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

			     // determining if the puzzle is solveable
			    boolean grid_odd = false;
			    if (column_counter % 2 == 1) {
			        grid_odd = true;
			    }

			    list_of_nums = new ArrayList<Integer>();
			    for (int i = 0; i < num_matrix.size(); i++){
			        for (int j = 0; j < num_matrix.get(i).size(); j++){
			            list_of_nums.add(num_matrix.get(i).get(j));
			        }
			    }

			    // finding the total number of inversions and determining if it is odd or even
			    boolean inversion_odd = false;
			    boolean zero_odd = false;
			    int inversions = 0;
			    for (int i = 0; i < list_of_nums.size(); i++) {
			        for (int j = i; j < list_of_nums.size(); j++) {
			            if (list_of_nums.get(j) > 0 && list_of_nums.get(i) > list_of_nums.get(j)) {
			                inversions++;
			            }
			        }
			    }

			    // finding the row where the zero is
			    int row_zero = 0;
			    for (int i = num_matrix.size() - 1; i >= 0; i--) {
			        for (int j = num_matrix.get(i).size() - 1; j >= 0; j--) {
			            if (num_matrix.get(i).get(j) == 0) {
			                row_zero = num_matrix.size() - i;
			            }
			        }
			    }

			    if ((row_zero % 2 == 1)) {
			        zero_odd = true;
			    }

			    if (inversions % 2 == 1) {
			        inversion_odd = true;
			    }
			    // System.out.println("Inversion: " + inversions);
			    // System.out.println("Zero Row: " + row_zero);
			    // System.out.println("Grid odd: " + grid_odd + ", inversion odd: " + inversion_odd + ", zero odd: " + zero_odd);
			    if ((grid_odd == true && inversion_odd == false) || (grid_odd == false && (zero_odd == !inversion_odd))) {
			        if (valid)
			            System.out.println("The puzzle has " + num_counter + " tiles");
			    } else {
			        System.out.println("Semantic Error: Rule 4 Violated");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5W\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\2\2\u008c\2\66\3\2\2\2\4>\3\2\2\2\6I\3\2\2\2\b"+
		"V\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24"+
		"m\3\2\2\2\26r\3\2\2\2\30u\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36|\3\2\2\2"+
		" \177\3\2\2\2\"\u0082\3\2\2\2$\u0084\3\2\2\2&\u008d\3\2\2\2(\u0097\3\2"+
		"\2\2*+\5$\23\2+,\5&\24\2,-\5\"\22\2-.\5(\25\2./\7\2\2\3/\67\3\2\2\2\60"+
		"\61\5&\24\2\61\62\5$\23\2\62\63\5\"\22\2\63\64\5(\25\2\64\65\7\2\2\3\65"+
		"\67\3\2\2\2\66*\3\2\2\2\66\60\3\2\2\2\67\3\3\2\2\28?\3\2\2\29:\5\34\17"+
		"\2:;\7\3\2\2;<\5\4\3\2<?\3\2\2\2=?\5\34\17\2>8\3\2\2\2>9\3\2\2\2>=\3\2"+
		"\2\2?\5\3\2\2\2@A\5\36\20\2AB\7\3\2\2BC\5\6\4\2CD\3\2\2\2DE\b\4\1\2EJ"+
		"\3\2\2\2FG\5\36\20\2GH\b\4\1\2HJ\3\2\2\2I@\3\2\2\2IF\3\2\2\2J\7\3\2\2"+
		"\2KW\3\2\2\2LM\5\24\13\2MN\5\6\4\2NO\5 \21\2OP\5\b\5\2PW\3\2\2\2QR\5\24"+
		"\13\2RS\5\6\4\2ST\3\2\2\2TU\b\5\1\2UW\3\2\2\2VK\3\2\2\2VL\3\2\2\2VQ\3"+
		"\2\2\2W\t\3\2\2\2XY\7\4\2\2Y\13\3\2\2\2Z[\7\5\2\2[\r\3\2\2\2\\]\7\7\2"+
		"\2]\17\3\2\2\2^_\7\f\2\2_`\5\34\17\2`a\7\3\2\2ab\5\34\17\2bj\3\2\2\2c"+
		"d\7\f\2\2de\5\34\17\2ef\7\3\2\2fg\5\34\17\2gh\7\3\2\2hj\3\2\2\2i^\3\2"+
		"\2\2ic\3\2\2\2j\21\3\2\2\2kl\7\n\2\2l\23\3\2\2\2mn\5\36\20\2no\7\3\2\2"+
		"op\3\2\2\2pq\b\13\1\2q\25\3\2\2\2rs\5\b\5\2st\5 \21\2t\27\3\2\2\2uv\7"+
		"\13\2\2v\31\3\2\2\2wx\7\6\2\2x\33\3\2\2\2yz\7\t\2\2z{\b\17\1\2{\35\3\2"+
		"\2\2|}\7\b\2\2}~\b\20\1\2~\37\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\b"+
		"\21\1\2\u0081!\3\2\2\2\u0082\u0083\b\22\1\2\u0083#\3\2\2\2\u0084\u0085"+
		"\5\n\6\2\u0085\u0086\5\32\16\2\u0086\u0087\5\16\b\2\u0087\u0088\5\20\t"+
		"\2\u0088\u0089\5\4\3\2\u0089\u008a\7\r\2\2\u008a\u008b\5\f\7\2\u008b\u008c"+
		"\b\23\1\2\u008c%\3\2\2\2\u008d\u008e\5\n\6\2\u008e\u008f\5\32\16\2\u008f"+
		"\u0090\5\16\b\2\u0090\u0091\5\22\n\2\u0091\u0092\5\26\f\2\u0092\u0093"+
		"\5\b\5\2\u0093\u0094\5\30\r\2\u0094\u0095\5\f\7\2\u0095\u0096\b\24\1\2"+
		"\u0096\'\3\2\2\2\u0097\u0098\b\25\1\2\u0098)\3\2\2\2\7\66>IVi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}