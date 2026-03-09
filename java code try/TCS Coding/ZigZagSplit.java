import java.util.Scanner;

public class ZigZagSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        sc.nextLine();         // consume newline (if it not include new line also add str)

        while (t-- > 0) {
            String str = sc.nextLine();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0)
                    even.append(str.charAt(i));
                else
                    odd.append(str.charAt(i));
            }

            System.out.println(even + " " + odd);
        }

        sc.close();
    }
}