:- module( helpers,
	 [ readFile/3
	 , printPuzzle/1
	 ]
    ).

prefix([_],[]).
prefix([H|T],[H|PT]):-
    prefix(T,PT).
    
readFile(File,Moves,Puzzle):-
    open(File,read,Input),
    read(Input,Moves),
    readPuzzle(Input,Temp),
    prefix(Temp,Puzzle),
    close(Input).

readPuzzle(Input,[]):-
    at_end_of_stream(Input),
    !.
readPuzzle(Input,[Row|Rows]):-
    \+ at_end_of_stream(Input),
    read(Input,Row),
    readPuzzle(Input,Rows).

printPuzzle([]).
printPuzzle([Row|Rows]):-
    writeln(Row),
    printPuzzle(Rows).
