import java.util.Random;

public class mySudoku implements Sudoku {

    int[][] board = new int[9][9];

    public mySudoku() {
        scramble();
    }

    /**
     * scrambles the sudoku board effectively restarting it
     */
    @Override
    public void scramble() {
        Random ran = new Random();
        // TODO: make a solvable sudoku board
        for (int i = 0; i < 20; i++) {
            board[ran.nextInt(0, 8)][ran.nextInt(0, 8)] = ran.nextInt(1, 9);
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
        board[x][y] = newValue;
    }

    /**
     * sets the board with a given 9x9 int matrix
     */
    @Override
    public void setArray(int[][] newBoard) {
        board = newBoard;

    }

}
