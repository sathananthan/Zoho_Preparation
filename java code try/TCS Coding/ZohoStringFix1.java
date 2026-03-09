import java.util.Scanner;
//using time/space Complexity
public class ZohoStringFix1 {

    public static String fixDuplicates(String input) {

        boolean[] used = new boolean[128]; // ASCII tracking
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {

            char current = ch;

            while (used[current]) {
                current++;

                // Wrap digits
                if (ch >= '0' && ch <= '9' && current > '9') {
                    current = '0';
                }

                // Wrap lowercase
                if (ch >= 'a' && ch <= 'z' && current > 'z') {
                    current = 'a';
                }

                // Wrap uppercase
                if (ch >= 'A' && ch <= 'Z' && current > 'Z') {
                    current = 'A';
                }
            }

            used[current] = true;
            result.append(current);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // String output = ;

        System.out.println("Output: " + fixDuplicates(input));

        sc.close();
    }
}