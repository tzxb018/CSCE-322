import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers
  
-- The main method that will be used for testing / command line access
main = do
 args <- getArgs
 filename <- readFile (head args)
 (moves,puzzle) <- readBossPuzzleFile filename
 (printPuzzle (manyMoves moves puzzle))

-- YOUR CODE SHOULD COME AFTER THIS POINT
manyMoves :: [Char] -> [[Int]] -> [[Int]]
manyMoves moves puzzle = puzzle