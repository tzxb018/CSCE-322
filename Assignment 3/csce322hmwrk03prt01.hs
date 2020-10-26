import Data.List ()
import Helpers (printPuzzle, readBossPuzzleFile)
import System.Environment (getArgs)
import Prelude

-- The main method that will be used for testing / command line access
main :: IO ()
main = do
  args <- getArgs
  filename <- readFile (head args)
  (moves, puzzle) <- readBossPuzzleFile filename
  (printPuzzle (oneMove (head moves) puzzle))

-- YOUR CODE SHOULD COME AFTER THIS POINT
oneMove :: Char -> [[Int]] -> [[Int]]
oneMove _ [] = []
oneMove move puzzle
  | (validateMove move puzzle zero_loc) == True = twoDListReplace updatedPuzzle switch_val zero_loc
  | otherwise = puzzle
  where
    zero_loc = (head (find2D puzzle 0))
    switch_val = (getNumber2D puzzle (updateMove move (zero_loc)))
    temp_loc = (head (find2D puzzle switch_val))
    updatedPuzzle = swap2D puzzle temp_loc zero_loc

-- finds the number of rows in the puzzle
puzzleRows :: [[Int]] -> Int
puzzleRows [] = 0
puzzleRows (h : t) = 1 + (puzzleRows t)

-- finds the number of columns in the puzzle
puzzleColumns :: [[Int]] -> Int
puzzleColumns [] = 0
puzzleColumns (h : t) = length h

-- given a list of list and a number to search for, it returns an array of tuples of the location(s) of that element
find2D :: (Eq a) => [[a]] -> a -> [(Int, Int)]
find2D a target = find2DHelper a target 0

find2DHelper :: (Eq a) => [[a]] -> a -> Int -> [(Int, Int)]
find2DHelper [] target row_counter = []
find2DHelper (h : t) target row_counter = (find1D h target row_counter 0) ++ find2DHelper t target (row_counter + 1)

find1D :: (Eq a) => [a] -> a -> Int -> Int -> [(Int, Int)]
find1D [] target row_counter column_counter = []
find1D (h : t) target row_counter column_counter
  | (target == h) = (row_counter, column_counter) : nextPart
  | otherwise = nextPart
  where
    nextPart = find1D t target row_counter (column_counter + 1)

-- list modifications (list, new replacement, index)
oneDListReplace :: [a] -> a -> Int -> [a]
oneDListReplace (h : t) c 0 = c : t
oneDListReplace (h : t) c i = h : (oneDListReplace t c (i -1))

-- 2D list modifications (list, new replacement, (column, row))
twoDListReplace :: [[a]] -> a -> (Int, Int) -> [[a]]
twoDListReplace (h : t) c (0, x) = (oneDListReplace h c x) : t
twoDListReplace (h : t) c (y, x) = h : (twoDListReplace t c ((y -1), (x)))

-- given a certain move and a coordinate, it gives the updated coordinate after the move
updateMove :: Char -> (Int, Int) -> (Int, Int)
updateMove move (y, x)
  | move == 'u' = ((y + 1), x)
  | move == 'd' = ((y -1), x)
  | move == 'l' = (y, (x + 1))
  | move == 'r' = (y, (x - 1))

-- validates the move by determing where the zero is and predicting where it would go
validateMove :: Char -> [[Int]] -> (Int, Int) -> Bool
validateMove move puzzle (y, x)
  | move == 'd' && y > 0 = True
  | move == 'u' && y < (puzzleRows puzzle - 1 ) = True
  | move == 'r' && x > 0 = True
  | move == 'l' && x < (puzzleColumns puzzle - 1) = True
  | otherwise = False

-- returns the number at a certain coordiante
getNumber2D :: [[a]] -> (Int, Int) -> a
getNumber2D puzzle (y, x) = getNumber2DHelper puzzle (y, x) 0

getNumber2DHelper :: [[a]] -> (Int, Int) -> Int -> a
getNumber2DHelper (h : t) (y_target, x_target) counter
  | (counter == y_target) = (getNumber1D h x_target)
  | otherwise = (getNumber2DHelper t (y_target, x_target) (counter + 1))

getNumber1D :: [a] -> Int -> a
getNumber1D list target = getNumber1DHelper list target 0

getNumber1DHelper :: [a] -> Int -> Int -> a
getNumber1DHelper (h : t) target counter
  | (target == counter) = h
  | otherwise = getNumber1DHelper t target (counter + 1)

-- swap function
swap2D :: [[a]] -> (Int, Int) -> (Int, Int) -> [[a]]
swap2D puzzle (y1, x1) (y2, x2) = twoDListReplace puzzle (getNumber2D puzzle (y2, x2)) (y1, x1)