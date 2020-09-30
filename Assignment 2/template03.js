var helpers = require("./helpers");
var part = require("./csce322hmwrk02prt03");

var puzzle = helpers.readPuzzleFile(
    "./Part 3 Solutions/part03test11.puzzle.bpf"
);
var moves = helpers.readMovesFile("./Part 3 Solutions/part03test01.moves.bpf");

var theFunction = part.puzzleSolvable(puzzle);

// console.log( moves[0] );
var after = theFunction();

console.log(after);
