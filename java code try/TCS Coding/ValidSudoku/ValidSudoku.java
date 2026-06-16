import java.util.HashSet;

public class ValidSudoku {
    @SuppressWarnings("unchecked")
    public static boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char val = board[r][c];

                if (val == '.') continue;

                // Check row
                if (rows[r].contains(val)) return false;
                rows[r].add(val);

                // Check column
                if (cols[c].contains(val)) return false;
                cols[c].add(val);

                // Check box
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex].contains(val)) return false;
                boxes[boxIndex].add(val);
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