public class FalseOddPattern {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            // System.out.println("character present :"+ch);

            if (i == n / 2) { // middle row: single character
                for (int s = 0; s < i; s++) System.out.print(" ");
                System.out.println(ch);
            } else {
                int leading, middle;
                if (i < n / 2) { // top half
                    leading = i;
                    middle = n - 2 * i - 2;
                } else { // bottom half (mirror)
                    int j = n - i - 1;
                    leading = j;
                    middle = n - 2 * j - 2;
                }

                // Print leading spaces
                for (int s = 0; s < leading; s++) System.out.print(" ");
                System.out.print(ch);

                // Print middle spaces
                for (int s = 0; s < middle; s++) System.out.print(" ");
                System.out.println(ch);
            }
        }
    }
}