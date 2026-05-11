import java.util.*;

public class printDivisors {

    public static void printDivisors(int n) {

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int n = 10;

        printDivisors(n);
    }
}