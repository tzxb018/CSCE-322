module.exports = {
    oneMove: oneMove,
};

var helpers = require("./helpers");

function oneMove(puzzle) {
    function whatever(direction) {
        if (validateMove(puzzle, direction) == true) {
            updateMove(puzzle, direction);
        }
        return puzzle;
    }
    return whatever;
}

// find where the empty space is
function findZero(puzzle) {
    var zero_loc = [-1, -1];
    for (var i = 0; i < puzzle.length; i++) {
        for (var j = 0; j < puzzle[i].length; j++) {
            if (puzzle[i][j] == 0) {
                zero_loc = [i, j];
            }
        }
    }
    return zero_loc;
}

// determining if we can move in the direction (avoid out of bounds errors)
function validateMove(puzzle, direction) {
    var zero_loc = findZero(puzzle);
    if (direction.localeCompare("d") == 0) {
        if (zero_loc[0] > 0) {
            return true;
        } else {
            return false;
        }
    } else if (direction.localeCompare("u") == 0) {
        if (zero_loc[0] < puzzle.length - 1) {
            return true;
        } else {
            return false;
        }
    } else if (direction.localeCompare("r") == 0) {
        if (zero_loc[1] > 0) {
            return true;
        } else {
            return false;
        }
    } else if (direction.localeCompare("l") == 0) {
        if (zero_loc[1] < puzzle[1].length - 1) {
            return true;
        } else {
            return false;
        }
    }
}

// if we can move in that direction, update the puzzle by moving the empty space
function updateMove(puzzle, direction) {
    var zero_loc = findZero(puzzle);

    if (direction.localeCompare("d") == 0) {
        var temp = puzzle[zero_loc[0] - 1][zero_loc[1]];
        puzzle[zero_loc[0] - 1][zero_loc[1]] = "0";
        puzzle[zero_loc[0]][zero_loc[1]] = temp;
    } else if (direction.localeCompare("u") == 0) {
        var temp = puzzle[zero_loc[0] + 1][zero_loc[1]];
        puzzle[zero_loc[0] + 1][zero_loc[1]] = "0";
        puzzle[zero_loc[0]][zero_loc[1]] = temp;
    } else if (direction.localeCompare("l") == 0) {
        var temp = puzzle[zero_loc[0]][zero_loc[1] + 1];
        puzzle[zero_loc[0]][zero_loc[1] + 1] = "0";
        puzzle[zero_loc[0]][zero_loc[1]] = temp;
    } else if (direction.localeCompare("r") == 0) {
        var temp = puzzle[zero_loc[0]][zero_loc[1] - 1];
        puzzle[zero_loc[0]][zero_loc[1] - 1] = "0";
        puzzle[zero_loc[0]][zero_loc[1]] = temp;
    }

    return puzzle;
}
