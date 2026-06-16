import java.util.HashSet;

public class ValidSudokuSingleSetTrick {
    public static boolean isValidSudoku(char[][] board) {   //easy pesy
        HashSet<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char val = board[r][c];
                if (val == '.') continue;

                if (!seen.add(val + " in row " + r) ||
                    !seen.add(val + " in col " + c) ||
                    !seen.add(val + " in box " + (r/3)*3 + (c/3))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'1','2','.','.','3','.','.','.','.'},
            {'4','.','.','5','.','.','.','.','.'},
            {'.','9','8','.','.','.','.','.','3'},
            {'5','.','.','.','6','.','.','.','4'},
            {'.','.','.','8','.','3','.','.','5'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','.','.','.','.','.','2','.','.'},
            {'.','.','.','4','1','9','.','.','8'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        boolean result = isValidSudoku(board);

        if (result) {
            System.out.println("Valid Sudoku");
        } else {
            System.out.println("Invalid Sudoku");
        }
    }
}