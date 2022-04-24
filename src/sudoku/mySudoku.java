package sudoku;

import java.util.Random;

public class mySudoku implements Sudoku {
    Random ran = new Random();
    int[][] board;

    public mySudoku() {
        this(new int[9][9]);

    }

    public mySudoku(int[][] boardTemp) {
        board = boardTemp;
    }

    /**
     * scrambles the sudoku board effectively restarting it
     */
    @Override
    public void scramble() {
        // TODO: make a solvable sudoku board
        for (int i = 0; i < 20; i++) {
            update(ran.nextInt(0, 8), ran.nextInt(0, 8), ran.nextInt(1, 9));
        }
    }

    /**
     * returns an array of the sudoku board
     */
    @Override
    public int[][] getArray() {
        return board;
    }

    /**
     * updates the value of the selected location
     */
    @Override
    public void update(int x, int y, int newValue) {

        if (isAllowed(x, y, newValue)) {
            board[x][y] = newValue;
        }

    }

    /**
     * sets the board with a given 9x9 int matrix
     */
    @Override
    public void setArray(int[][] newBoard) {
        board = newBoard;

    }

    @Override
    public boolean inColumn(int x, int value) {
        for (int i = 0; i < board.length; i++) {
            if (board[x][i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean inRow(int y, int value) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean inCell(int x, int y, int value) {
        int cellY = Math.floorDiv(y, 3);
        int cellX = Math.floorDiv(x, 3);

        for (int i = cellX * 3; i < cellX * 3 + 3; i++) {
            for (int k = cellY * 3; k < cellY * 3 + 3; k++) {
                if (board[i][k] == value) {
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public boolean isAllowed(int x, int y, int value) {

        return !(inCell(x, y, value) || inRow(y, value) || inColumn(x, value));
    }

}
