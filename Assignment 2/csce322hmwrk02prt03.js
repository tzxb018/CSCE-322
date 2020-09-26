module.exports = {
    puzzleSolvable: puzzleSolvable
}

var helpers = require( './helpers' );

function puzzleSolvable(puzzle){
    
    function whatever(){
	return puzzle.length % 2 == 0;
    }
    
    return whatever;
}
