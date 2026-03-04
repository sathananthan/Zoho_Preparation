import java.util.*;

public class PhoneDigits {

    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void generateCombinations(String digits, int index, String current) {

        if (index == digits.length()) {  // if no button pressed
            System.out.print(current + " ");
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];
        // System.out.println(letters);
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, current + letters.charAt(i));   //recursive call
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        generateCombinations(digits, 0, "");
    }
}