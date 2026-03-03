import java.util.Arrays;

public class MinimizeSumProduct {

    public static int minSumProduct(int[] A, int[] B) {
        Arrays.sort(A); // ascending
        Arrays.sort(B); // ascending
        
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n - 1 - i];  //3*4 + 1*5 + 1*6
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 1};
        int[] B = {6, 5, 4};

        int result = minSumProduct(A, B);
        System.out.println("Minimum sum of products: " + result);
    }
}