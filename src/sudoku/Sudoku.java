package sudoku;

public interface Sudoku {

    /**
     * scrambles the sudoku board restarting it
     */
    public void scramble();

    /**
     * returns an array of the sudoku board
     * 
     * @return returns an array of the sudoku board
     */
    public int[][] getArray();

    /**
     * sets the board with a given 9x9 int matrix
     * 
     * @param newBoard board given to replace current board
     */
    public void setArray(int[][] newBoard);

    /**
     * updates the value of the selected location
     * 
     * @param x        x coordinate
     * @param y        y coordinate
     * @param newValue value to be inserted
     */
    public void update(int x, int y, int newValue);

    /**
     * Checks if the given value is in a given column
     * 
     * 
     * @param x     x value of the column
     * @param value value to be checked if in column
     * @return returns true if the value given is in the given column
     */
    public boolean inColumn(int x, int value);

    /**
     * Checks if the given value is in a given row
     * 
     * 
     * @param y     y value of the row
     * @param value value to be checked if in row
     * @return returns true if the value given is in the given row
     */
    public boolean inRow(int y, int value);

    /**
     * Checks if the given value is in the cell around a given coordinate
     * 
     * @param x     x coordinate
     * @param y     y coordinate
     * @param value value to be checked in the cell
     * @return returns true if the value given is in the given cell
     */
    public boolean inCell(int x, int y, int value);

    /**
     * Checks if a value can be placed on the board be checking if it is already in
     * the cell, row or column
     * 
     * @param x     x coordinate
     * @param y     y coordinate
     * @param value value to be checked
     * @return returns true if the given value is allowed at the given location
     */
    public boolean isAllowed(int x, int y, int value);

}
