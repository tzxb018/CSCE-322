var helpers = require("./helpers");
var part = require("./csce322hmwrk02prt01");

var puzzle = helpers.readPuzzleFile("./Part 1 Solutions/part01test01.puzzle.bpf");
var moves = helpers.readMovesFile("./Part 1 Solutions/part01test01.moves.bpf");

var theFunction = part.oneMove(puzzle);

console.log(moves[0]);
var after = theFunction(moves[0]);

for (var i = 0; i < after.length; i++) {
    console.log(after[i]);
}
