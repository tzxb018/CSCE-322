import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers
  
-- The main method that will be used for testing / command line access
main = do
 args <- getArgs
 filename <- readFile (head args)
 (moves,puzzle) <- readBossPuzzleFile filename
 (printPuzzle (oneMove (head moves) puzzle))

-- YOUR CODE SHOULD COME AFTER THIS POINT
oneMove :: Char -> [[Int]] -> [[Int]]
oneMove move puzzle = puzzle
