var helpers = require( './helpers' );
var part = require( './csce322hmwrk02prt02' );

var puzzle = helpers.readPuzzleFile( 'part02test01.puzzle.bpf' );
var moves = helpers.readMovesFile( 'part02test01.moves.bpf' );

var theFunction = part.manyMoves( puzzle );

var after = theFunction( moves );

for( var i = 0; i < after.length; i++ ){
    console.log( after[i] );
}
