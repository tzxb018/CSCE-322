grammar csce322hmwrk01prt02;

// variables used to store data for syntax and semantics
@members {
    int moves_sec_num = 0;
    int puzzles_sec_num = 0;
    int moves_counter = 0;
    int row_counter = 0;
    int column_counter = 0;
    int num_counter = 0;
    int max_num = -1; 
    boolean valid = true;
}

// tokens
START: '<<alpha';
END: 'omega>>';
TYPE: 'Moves' | 'Puzzle';
VALUE: '=';
NUM: ('-')? [0-9]+;
MOVE: 'u' | 'd' | 'l' | 'r';
BEGIN_BOARD: '{';
END_BOARD: '}';
BEGIN_LIST: '[';
END_LIST: ']';
END_ROW: '$';
WS: [ \t\r\n]+ { skip(); };

// defining the error as another token
ANYTHING: (.);

// rules
boss:
	moves_sec puzzle_sec file_end semantic_checks EOF
	| puzzle_sec moves_sec file_end semantic_checks EOF;

// recursive rule for calling the items in the move list 
move_list: | (move '&' move_list) | move;

// recursive rule for calling the items of a row on the board
row_items: (num '&' row_items) {column_counter++; }
	| num {column_counter++; };

// recursive rule for calling the rows on the board
row_list: | ( row_items end_row row_list) | ( row_items);

start: START;
end: END;
assignment: VALUE;
begin_move: BEGIN_LIST (move '&' move '&');
begin_board: BEGIN_BOARD;
end_board: END_BOARD;
type: TYPE;
move:
	MOVE {
    moves_counter++;
};
row_start: (num '&' num '&') {column_counter += 2;}
	| (num '&' num) {column_counter += 2;};
first_row: ( row_start row_items end_row);
num:
	NUM {
    int read_in_num = Integer.parseInt($NUM.text);
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
    
};
end_row: END_ROW {row_counter++; column_counter = 0;};
file_end: {};

moves_sec:
	start type assignment begin_move move_list END_LIST end {moves_sec_num++;
		};
puzzle_sec:
	start type assignment begin_board first_row row_list end_board end {puzzles_sec_num++;
		};

// semantic rules that are used to find the semantic errors
semantic_checks:
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
        System.out.println("The puzzle has " + num_counter + " tiles");
    }

};

