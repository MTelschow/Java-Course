package projects.tictactoe;

import projects.utils.ConsoleColors;

import java.util.Scanner;

public class TicTacToe {
    public char[][] board;
    public char currentPlayer;

    public TicTacToe() {
        currentPlayer = 'X';
        board = new char[3][3];
        for (char[] row : board) {
            for (int i = 0; i < 3; i++) {
                row[i] = ' ';
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean isWon = false;

        while (!isWon && !isBoardFull()) {
            printBoard();
            System.out.println("Current player: " + currentPlayer);
            System.out.println("Enter a row(1-3) and a column(1-3): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (!(board[row][col] == ' ')) {
                System.out.println("Cell is already occupied. Please try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            if (isWinningMove()) {
                isWon = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        if (isWon) {
            System.out.println(ConsoleColors.GREEN + "Player " + currentPlayer + " has won the game!!!!");
        } else {
            System.out.println(ConsoleColors.GREEN + "It's a draw!");
        }
    }

    private void printBoard() {
        for (char[] row : board) {
            for (char cell: row) {
                System.out.print(  ConsoleColors.WHITE_UNDERLINED + cell + ConsoleColors.RESET + " ");
            }
            System.out.print("\n");
        }
    }

    private boolean isWinningMove() {
        final int[][][] winningPermutations = {
                {{0, 0}, {0, 1}, {0, 2}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},

                {{0, 0}, {1, 0}, {2, 0}},
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 2}, {1, 2}, {2, 2}},

                {{0, 0}, {1, 1}, {2, 2}},
                {{2, 0}, {1, 1}, {0, 2}},
        };


        for (int[][] permutation: winningPermutations) {
            boolean allMatching = true;
            for (int[] cords : permutation) {
                if (currentPlayer != board[cords[0]][cords[1]]) allMatching = false;
            }
            if (allMatching) return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') isFull = false;
            }
        }
        return isFull;
    }
}
