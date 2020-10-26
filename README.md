# CSCE-322
## Overview
This is a repo holding all of my code for CSCE 322, Programming Languages and Concepts. For the class, we were required to do 4 different coding projects, all of which were related to solving the [boss puzzle](https://en.wikipedia.org/wiki/15_puzzle). The 4 different languages I used for this class were ANTLR, JavaScript, Haskell, and Prolog. Each of these languages have their own advantages, disadvantages, logic, and syntax that I had to learn to correctly implement. The general functions I had to implement in each assignment was making a single move in the puzzle given a direction, making several moves given a list of directions to move in, and determining if the puzzle was [solvable](https://www.cs.bham.ac.uk/~mdr/teaching/modules04/java2/TilesSolvability.html).  

*It is important to note that this repo is to only display my coding experience and not for other people to copy my solutions. I am not responsible for any violations to academic integrity policies for future classes should other people use parts of my code for their solutions.*

## Compiling ANTLR 4 (Assignment 1)
* Make sure [ANTLR4](https://www.antlr.org/download.html) is installed on your machine
* These commands are built for Windows
* Please visit this link to see [how to setup ANTLR4](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)
* Use the following commands to compile and run the code for part 1
```
cd ".\Assignment 1\Part 1"
antlr4 csce322hmwrk01prt01.g4
javac csce322hmwrk01prt01*.java   
grun csce322hmwrk01prt01 boss .\Solutions\part01test01.bpf
```
* Use the following commands to compile and run the code for part 2
```
cd ".\Assignment 1\Part 2"
antlr4 csce322hmwrk01prt02.g4
javac csce322hmwrk01prt02*.java   
grun csce322hmwrk01prt02 boss .\Solutions\part02test01.bpf
```

## Compiling JavaScript (Assignment 2)
* Make sure to have [node](https://nodejs.org/en/download/) installed on your local machine
* These commands are also built for Windows
* Use the following commands to compile and run the code
```
cd ".\Assignment 2\"
node template01.js
```
* When running parts 2 and 3, just replace `template01.js` with `template02.js` or `template03.js`

## Compiling Haskell (Assignment 3)
* Make sure that [Haskell](https://www.haskell.org/platform/) is installed on your local machine
* These comands are also built for Windows
* Use the following commands to compile and run the code
```
cd ".\Assignment 3\"
ghc .\csce322hmwrk03prt01.hs
.\csce322hmwrk03prt01.exe .\part01test01.bpf
```
* When running parts 2 and 3, just replace `csce322hmwrk03prt01` with `csce322hmwrk03prt02` or `csce322hmwrk03prt03` and set the path to the correct test case file.



