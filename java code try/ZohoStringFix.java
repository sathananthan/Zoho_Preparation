import java.util.*;

public class ZohoStringFix {
    public static String fixDuplicates(String input) {
        Set<Character> used = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {

            char current = ch;

            // If already used → find next unused char
            while (used.contains(current)) {
                current++;

                // Wrap digits 9 -> 0
                if (ch >= '0' && ch <= '9' && current > '9') {
                    current = '0';
                }

                // Wrap lowercase z -> a
                if (ch >= 'a' && ch <= 'z' && current > 'z') {
                    current = 'a';
                }

                // Wrap uppercase Z -> A
                if (ch >= 'A' && ch <= 'Z' && current > 'Z') {
                    current = 'A';
                }
            }

            used.add(current);
            result.append(current);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fixDuplicates("Java1234"));
        System.out.println(fixDuplicates("Python1223"));
        System.out.println(fixDuplicates("aBuzZ9900"));
    }
}