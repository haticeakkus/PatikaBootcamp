package minesweeperGame;


import java.util.Random;
import java.util.Scanner;

public class MinesweeperGame {
    static void print(String[][] gameArea, int row, int col, boolean revealMines) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!revealMines && gameArea[i][j].equals("*")) {
                    System.out.print("- ");
                } else {
                    System.out.print(gameArea[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the row number: ");
        int row = input.nextInt();
        System.out.print("Enter the column number: ");
        int col = input.nextInt();

        String[][] gameArea = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameArea[i][j] = "-";
            }
        }
        int mineNums = (row * col) / 4;
        int[][] mines = new int[row][col];

        int[] mineRow = new int[mineNums];
        int[] mineCol = new int[mineNums];
        int count = 0;
        while (count != mineNums) {
            mineRow[count] = random.nextInt(row);
            mineCol[count] = random.nextInt(col);
            if (gameArea[mineRow[count]][mineCol[count]] != "*") {
                gameArea[mineRow[count]][mineCol[count]] = "*";
                count++;
            }
        }

        System.out.println("Welcome to the Minesweeper Game!");
        //    print(gameArea, row, col, true);

        boolean gameOver = false;
        int uncoveredCount = 0;

        while (!gameOver) {
            System.out.println("Minesweeper Game");
            print(gameArea, row, col, false);

            System.out.print("Enter the row number: ");
            int selectedRow = input.nextInt();
            System.out.print("Enter the column number: ");
            int selectedCol = input.nextInt();
            selectedRow--;
            selectedCol--;
            if (selectedRow < 0 || selectedRow >= row || selectedCol < 0 || selectedCol >= col) {
                System.out.println("Invalid move! Please select a valid position.");
                continue;
            }

            if (gameArea[selectedRow][selectedCol].equals("*")) {
                System.out.println("Boom! You hit a mine. Game over!");
                gameOver = true;
            } else {
                int mineCount = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int neighborRow = selectedRow + i;
                        int neighborCol = selectedCol + j;

                        if (neighborRow < 0 || neighborRow >= row || neighborCol < 0 || neighborCol >= col ||
                                (neighborRow == selectedRow && neighborCol == selectedCol)) {
                            continue;
                        }

                        if (gameArea[neighborRow][neighborCol].equals("*")) {
                            mineCount++;
                        }
                    }
                }

                if (mineCount > 0) {
                    gameArea[selectedRow][selectedCol] = String.valueOf(mineCount);
                } else {
                    gameArea[selectedRow][selectedCol] = "0";
                }

                uncoveredCount++;
                if (uncoveredCount == row * col - mineNums) {
                    System.out.println("Congratulations! You've uncovered all safe positions. You win!");
                    gameOver = true;
                }
            }
        }

        System.out.println("Final Game Area:");
        print(gameArea, row, col, true);
    }
}