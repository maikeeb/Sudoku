import BasicIO.*;
import sudoku.*;

public class userInterface {

    // name of the board in the form
    private static final String BOARD_NAME = "board";
    BasicForm form;
    Sudoku sudoku;

    public userInterface() {

        // initialize variables
        sudoku = new mySudoku();
        form = new BasicForm();
        buildform();
        fillForm();

        while (true) {
            int response = form.accept("Accept", "Exit");

            if (response == 1) {
                break;
            } else {
                
                int x = form.readInt("x");
                int y = form.readInt("y");
                int newValue = form.readInt("newValue");

                sudoku.update(x - 1, y - 1, newValue);
                fillForm();

            }
        }

    }

    private void fillForm() {
        form.clear(BOARD_NAME);
        int[][] board = sudoku.getArray();
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                form.writeInt(BOARD_NAME, board[x][y]);
            }
            form.newLine(BOARD_NAME);
        }
    }

    private void buildform() {
        form.addTextArea(BOARD_NAME, "Board", 10, 30);
        form.setEditable(BOARD_NAME, false);

        form.addTextField("x", "X: ");
        form.addTextField("y", "Y: ");
        form.addTextField("newValue", "New Value: ");

    }

    public static void main(String[] args) {
        new userInterface();
    }
}
