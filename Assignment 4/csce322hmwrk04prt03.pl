twoConditions(Puzzle):-
    length(Puzzle,PuzzleLength),
    PuzzleLength < 3.
twoConditions(Puzzle):-
    length(Puzzle,PuzzleLength),
    PuzzleLength > 5.
