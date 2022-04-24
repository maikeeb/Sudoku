public interface Sudoku {

/**
 * scrambles the sudoku board restarting it 
 */
public void scramble();

/**
 * returns an array of the sudoku board
 */
public int[] getArray();

/**
 * updates the value of the selected location
 */
public void update(int x, int y, int newValue);
    



    
}
    

