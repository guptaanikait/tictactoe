# Tic Tac Toe Kotlin Console Game

A console-based Tic Tac Toe game implemented in Kotlin. Two players alternate turns entering coordinates to place X's and O's on a 3x3 grid. The game checks for input validity, win conditions, draw, and impossible states.

---

## Features

- Interactive console input for players to enter moves.
- Input validation: coordinates must be numbers and within 1 to 3.
- Prevents overwriting already occupied cells.
- Displays game board after each move.
- Detects and announces winner (X or O), draw, or impossible game states.
- Alternates turns automatically between two players.
- Recursion on invalid inputs for better user experience.



## How to Play

- The board is a 3x3 grid with rows and columns numbered 1 through 3.
- Enter moves as two numbers representing row and column, separated by space (e.g., "1 3").
- Player 1 places 'X', Player 2 places 'O'.
- The board is displayed after each valid move.
- The game ends and announces the result when:
  - A player wins by completing a row, column, or diagonal.
  - The board is full resulting in a draw.
  - An impossible game state is detected (e.g., both players winning or invalid counts).

---

## Code Highlights

- Uses a `MutableList<Char>` of size 9 to represent the board.
- Recursive `helper()` function handles move input and validation.
- Validation checks for numeric input, coordinate range, and cell availability.
- Board state checks for winners or draw conditions after each move.
- Alternates `flag1` between 0 and 1 to switch turns between 'X' and 'O'.



