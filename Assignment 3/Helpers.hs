module Helpers
( readBossPuzzleFile
, printPuzzle
) where

import Data.Char
import Prelude

printPuzzle :: [[Int]] -> IO ()
printPuzzle []         = print ""
printPuzzle (row:rows) = do
 print row
 printPuzzle rows

readBossPuzzleFile :: String -> IO ([Char],[[Int]])
readBossPuzzleFile = readIO
