grammar csce322hmwrk01prt02;

@header {
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
}

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
    boolean neg_num = false;
    ArrayList<Integer> list_of_nums = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> num_matrix = new ArrayList<ArrayList<Integer>>(); 
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
row_list:
	| ( begin_row row_items end_row row_list)
	| ( begin_row row_items) {};

start: START;
end: END;
assignment: VALUE;
begin_move:
	BEGIN_LIST (move '&' move)
	| BEGIN_LIST (move '&' move '&');
begin_board: BEGIN_BOARD;
begin_row: (num '&') {column_counter++;};
first_row: (row_list end_row);
end_board: END_BOARD;
type: TYPE;
move:
	MOVE {
    moves_counter++;
};

num:
	NUM {
    int read_in_num = Integer.parseInt($NUM.text);
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
};

end_row:
	END_ROW {row_counter++; 
    column_counter = 0; 
    num_matrix.add(list_of_nums); 
    list_of_nums = new ArrayList<Integer>();
	};
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
    


    };