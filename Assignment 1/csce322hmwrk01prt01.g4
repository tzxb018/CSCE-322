grammar csce322hmwrk01prt01;

// tokens
START: '<<alpha';
END: 'omega>>';
TYPE: 'Moves'|'Puzzle';
VALUE: '=';
NUM: ('-')?[0-9]+;
MOVE: 'u'|'d'|'l'|'r';
BEGIN_BOARD: '{';
END_BOARD: '}';
BEGIN_LIST: '[';
END_LIST: ']';
END_ROW: '$';
WS : [ \t\r\n]+{ skip(); };

// defining the error as another token
ANYTHING : (.);



// rules
boss : moves_sec puzzle_sec file_end EOF| puzzle_sec file_end EOF| puzzle_sec moves_sec file_end EOF| ANYTHING{System.out.println("Line " + $ANYTHING.line + " Contains Unrecognized Token " + $ANYTHING.text); System.exit(1);};


// recursive rule for calling the items in the move list 
move_list: 
    | (move '&' move_list) | move
    ;
// recursive rule for calling the items of a row on the board
row_items:
    (num '&' row_items) | num
    ;
// recursive rule for calling the rows on the board
row_list:
    | (row_items end_row row_list) | row_items
    ;

start: START{System.out.println("Start Section: " + $START.text);};
end: END{System.out.println("End Section: " + $END.text);};
assignment: VALUE{System.out.println("Assignment: = ");};
begin_board: BEGIN_BOARD{System.out.println("Start Puzzle: {");};
end_board: END_BOARD{System.out.println("End Puzzle: }");};
type: TYPE{System.out.println("Section: " + $TYPE.text);};
move: MOVE{System.out.println("Move: " + $MOVE.text);};
num: NUM{System.out.println("Tile: " + $NUM.text);};
end_row: END_ROW{System.out.println("End Row: $");};
file_end: {System.out.print("End of File");};

moves_sec: start type assignment BEGIN_LIST move_list END_LIST end;
puzzle_sec: start type assignment begin_board row_list  end_board end;
