puzzleSolvable(Puzzle):-
    oddWidthEvenInversions(Puzzle).

puzzleSolvable(Puzzle):-
    evenWidthCase(Puzzle).

evenWidthCase(Puzzle):-
    findWidth(Puzzle, RowSize),
    0 is mod(RowSize, 2),
    flattenMatrix(Puzzle, FlatPuzzle),
    iterateList(FlatPuzzle, Inversions, Sum),
    oddFindZeroRowFromBottom(Puzzle, Remainder),
    Remainder =:= mod(Sum, 2).

oddWidthEvenInversions(Puzzle):-
    findWidth(Puzzle, RowSize),
    1 is mod(RowSize, 2),
    flattenMatrix(Puzzle, FlatPuzzle),
    iterateList(FlatPuzzle, Inversions, Sum),
    0 is mod(Sum, 2).

findWidth([H|T], Row):-
    length(H, Row).

flattenMatrix([],[]).

flattenMatrix([H|T], FlatPuzzle):-
    flattenMatrix(T, UpdatedFlatPuzzle),
    append(H, UpdatedFlatPuzzle, FlatPuzzle).

oddFindZeroRowFromBottom(Puzzle, Remainder):-
    findWidth(Puzzle, RowSize),
    flattenMatrix(Puzzle, FlatPuzzle),
    nth0(I, FlatPuzzle, 0),
    length(FlatPuzzle, PuzzleLength),
    RowFromBottom is (((PuzzleLength//RowSize) - (I//RowSize)) + 1),
    Remainder is mod(RowFromBottom, 2).

iterateList([],0, 0).

iterateList([H|T], Inversions2, Sum2):-
    countInversions(H, T, Inversions3), 
    iterateList(T, Inversions4, Sum4),
    Sum2 is Sum4 + Inversions3.


countInversions(H, [], 0).

countInversions(H, [TH|TT], Inversions):-
    H > TH,
    TH > 0,
    countInversions(H, TT, Inversions1), Inversions is Inversions1 + 1.

countInversions(H, [TH|TT], Inversions):-
    H > TH,
    TH = 0,
    countInversions(H, TT, Inversions).

countInversions(H, [TH|TT], Inversions):-
    H =< TH,
    countInversions(H, TT, Inversions).
 