import java.util.*;

public class WordBoggle {

    static int M = 3, N = 3;

    static boolean isSafe(int i, int j, boolean visited[][]) {
        return (i >= 0 && i < M && j >= 0 && j < N && !visited[i][j]);
    }

    static void searchWord(char board[][], boolean visited[][],
                           int i, int j, String str, Set<String> dict) {

        visited[i][j] = true;
        str = str + board[i][j];

        if (dict.contains(str))
            System.out.println(str);

        for (int row = i - 1; row <= i + 1; row++) {
            for (int col = j - 1; col <= j + 1; col++) {
                if (isSafe(row, col, visited))
                    searchWord(board, visited, row, col, str, dict);
            }
        }

        visited[i][j] = false; // backtrack
    }

    static void findWords(char board[][], Set<String> dict) {
        boolean visited[][] = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                searchWord(board, visited, i, j, "", dict);
            }
        }
    }

    public static void main(String[] args) {

        char board[][] = {
                {'G','I','Z'},
                {'U','E','K'},
                {'Q','S','E'},
                {'F','O','R'},
        };

        Set<String> dict = new HashSet<>();
        dict.add("GEEKS");
        dict.add("QUIZ");
        dict.add("FOR");

        findWords(board, dict);
    }
}