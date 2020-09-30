module.exports = {
    puzzleSolvable: puzzleSolvable,
};

const { Console } = require("console");
var helpers = require("./helpers");

function puzzleSolvable(puzzle) {
    function whatever() {
        var zero_location = findZero(puzzle);
        var odd_zero = zero_odd_from_bottom(puzzle, zero_location);
        var odd_width = grid_width_odd(puzzle);
        var inversions_even = inversions_even_function(puzzle);

        // console.log("odd width: ", odd_width);
        // console.log("pos from bottom odd", odd_zero);
        // console.log("inversions even", inversions_even);

        if (odd_width == true) {
            if (inversions_even == true) {
                return true;
            } else {
                return false;
            }
        } else {
            if (odd_zero == inversions_even) {
                return true;
            } else {
                return false;
            }
        }
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

// determining if zero is in an odd row from the bottom
function zero_odd_from_bottom(puzzle, location_of_zero) {
    // console.log("Pos of X from bottom: ", puzzle.length - location_of_zero[0]);
    return (puzzle.length - location_of_zero[0]) % 2 == 1;
}

// determing if grid width is even or odd
function grid_width_odd(puzzle) {
    // console.log(puzzle[0].length);
    return puzzle[0].length % 2 == 1;
}

// determining if inversions are even
function inversions_even_function(puzzle, zero_loc) {
    var inversions = 0;
    var list_of_nums = [];

    for (var i = 0; i < puzzle.length; i++) {
        // console.log(puzzle[i]);
        for (var j = 0; j < puzzle[i].length; j++) {
            list_of_nums.push(parseInt(puzzle[i][j]));
        }
    }
    // console.log("List: ", list_of_nums);
    for (var i = 0; i < list_of_nums.length; i++) {
        for (var j = i; j < list_of_nums.length; j++) {
            if (list_of_nums[j] > 0 && list_of_nums[i] > list_of_nums[j]) {
                inversions++;
            }
        }
    }
    // console.log(inversions);
    return inversions % 2 == 0;
}
