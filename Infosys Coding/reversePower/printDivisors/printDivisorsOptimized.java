import java.util.*;

public class printDivisorsOptimized {

    public static void printDivisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            // System.out.println("i : "+i);

            if (n % i == 0) {

                list.add(i);

                // Avoid duplicate for perfect square
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int n = 10;

        printDivisors(n);
    }
}