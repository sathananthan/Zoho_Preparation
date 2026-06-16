import java.util.*;

public class ValidSudokuSafe {

    public static boolean isValidSudoku(char[][] board) {
        
        List<HashSet<Character>> rows = new ArrayList<>();
        List<HashSet<Character>> cols = new ArrayList<>();
        List<HashSet<Character>> boxes = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char val = board[r][c];
                if (val == '.') continue;

                if (rows.get(r).contains(val)) return false;
                rows.get(r).add(val);

                if (cols.get(c).contains(val)) return false;
                cols.get(c).add(val);

                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes.get(boxIndex).contains(val)) return false;
                boxes.get(boxIndex).add(val);
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