module.exports = {
    oneMove: oneMove
}

var helpers = require( './helpers' );

function oneMove(puzzle){
    
    function whatever(direction){
	return puzzle;
    }

    return whatever;
}
