public interface Sudoku {

/**
 * scrambles the sudoku board restarting it 
 */
public void scramble();

/**
 * returns an array of the sudoku board
 */
public int[][] getArray();

/**
 * sets the board with a given 9x9 int matrix 
 */
public void setArray(int[][] newBoard);

/**
 * updates the value of the selected location
 */
public void update(int x, int y, int newValue);
    



    
}
    

