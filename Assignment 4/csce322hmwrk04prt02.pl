%quickestWin(Puzzle,[a,b,l,l,l,c]).

% the driver of the program 
quickestWin(Puzzle, []):-
    winningState(Puzzle).

quickestWin(Puzzle, Moves):-
    not(winningState(Puzzle)),
    storeAllQuickWins(Puzzle, Wins),
    getMinLengths(Wins, Min),
    member(Moves, Wins),
    length(Moves, Min).

% finds the lenght of all the moves stored in a list
getLenghtsOfMoves([],[]).
getLenghtsOfMoves([H|T], [HH|TT]):-
    length(H, HH),
    getLenghtsOfMoves(T, TT).

% finds the length of the shortest sequence
getMinLengths(Moves, Min):-
    getLenghtsOfMoves(Moves, LengthofMove),
    min_list(LengthofMove, Min).

% finds and stores all the possible win scenarios
storeAllQuickWins(Puzzle, Wins):-
    findall(Moves, findQuickestWins(Puzzle, Moves), Wins).

% by using a list of length 10, finds all possible sequences with a length of less than 10 that solve puzzle
findQuickestWins(Puzzle, Moves):-
    numlist(1,10, LimitMoves),
    member(MoveLength, LimitMoves),
    length(Moves, MoveLength),
    playMoves(Puzzle, Moves, Output),
    winningState(Output).

% flattens the 2D into a 1D 
flattenMatrix([],[]).
flattenMatrix([H|T], FlatPuzzle):-
    flattenMatrix(T, UpdatedFlatPuzzle),
    append(H, UpdatedFlatPuzzle, FlatPuzzle).

% checks if the puzzle is a win by flattening and checking the order
winningState(Puzzle) :-
    flattenMatrix(Puzzle, FlatPuzzle),
    length(FlatPuzzle, FlatLength),
    MinusOne is (FlatLength - 1),
    numlist(1, MinusOne, Range),
    append(Range, [0], FlatPuzzle).

% modifies the 1d array at a given index
mod1D([_|T], 0, Val, [Val|T]).
mod1D([H|T], I, Val, [H|UpdatedT]):-
    I > 0,
    IteratedI is (I - 1),
    mod1D(T, IteratedI, Val, UpdatedT).

% modifies the 2-D array given a (R,C) 
mod2D([H|T], 0, Column, Val, [UpdatedH|T]):-
    mod1D(H, Column, Val, UpdatedH).
mod2D([H|T], Row, Column, Val, [H|UpdatedT]):-
    Row > 0,
    IteratedRow is (Row - 1),
    mod2D(T, IteratedRow, Column, Val, UpdatedT).

% finds the (r,c) of a certain value in a 2D
% also finds what value is at (r,c)
nth2D(Puzzle, Row, Column, Val):-
    nth0(Row, Puzzle, RVal),
    nth0(Column, RVal, Val).

% plays all the moves
playMoves(InputPuzzle, [], InputPuzzle).
playMoves(InputPuzzle, [H|T], OutputPuzzle):-
    playMove(InputPuzzle, H, UpdatedPuzzle),
    playMoves(UpdatedPuzzle, T, OutputPuzzle).

% updates the puzzle when a tile is slid up into the empty
playMove(Puzzle, u, Out):-
    nth2D(Puzzle, R, C, 0),
    DownR is (R + 1),
    nth2D(Puzzle, DownR, C, ValBelowZero),
    mod2D(Puzzle, R, C, ValBelowZero, UpdatedPuzzle),
    mod2D(UpdatedPuzzle, DownR, C, 0, Out).

% updates the puzzle when a tile is slid down into the empty
playMove(Puzzle, d, Out):-
    nth2D(Puzzle, R, C, 0),
    UpR is (R - 1),
    nth2D(Puzzle, UpR, C, ValAboveZero),
    mod2D(Puzzle, R, C, ValAboveZero, UpdatedPuzzle),
    mod2D(UpdatedPuzzle, UpR, C, 0, Out).

% updates the puzzle when a tile is slid right into the empty
playMove(Puzzle, r, Out):-
    nth2D(Puzzle, R, C, 0),
    LeftC is (C-1),
    nth2D(Puzzle, R, LeftC, ValByZero),
    mod2D(Puzzle, R, C, ValByZero, UpdatedPuzzle),
    mod2D(UpdatedPuzzle, R, LeftC, 0, Out).

% updates the puzzle when a tile is slid left into the empty
playMove(Puzzle, l, Out):-
    nth2D(Puzzle, R, C, 0),
    RightC is (C+1),
    nth2D(Puzzle, R, RightC, ValByZero),
    mod2D(Puzzle, R, C, ValByZero, UpdatedPuzzle),
    mod2D(UpdatedPuzzle, R, RightC, 0, Out).