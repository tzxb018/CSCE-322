printPaths([]).
printPaths([Path|Paths]):-
    writeln(Path),
    printPaths(Paths).

loadHelpers:-
    ['helpers.pl'],
    ['csce322hmwrk04prt01.pl'],
    ['csce322hmwrk04prt02.pl'],
    ['csce322hmwrk04prt03.pl'],
    ['csce322hmwrk04prt04.pl'].

part01:-
    readFile('part01test01.bpf',_,Puzzle),
    printPuzzle(Puzzle),
    oddWidthEvenInversions(Puzzle).

part02:-
    readFile('part02test01.bpf',_,Puzzle),
    printPuzzle(Puzzle),
    setof(Path,quickestWin(Puzzle,Path),Paths),
    writeln(paths),
    printPaths(Paths).

part03:-
    readFile('part03test01.bpf',_,Puzzle),
    printPuzzle(Puzzle),
    twoConditions(Puzzle).

part04:-
    readFile('part04test01.bpf',_,Puzzle),
    printPuzzle(Puzzle),
    puzzleSolvable(Puzzle).
    
