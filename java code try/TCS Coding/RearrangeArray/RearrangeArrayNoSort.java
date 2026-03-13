import java.util.Arrays;

public class RearrangeArrayNoSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 3};
        int n = arr.length;
        int mid = n / 2;

        int[] result = new int[n];
        boolean[] used = new boolean[n];

        // Step 1: Find first half minimum elements
        for (int i = 0; i < mid; i++) {
            int minIndex = -1;
            for (int j = 0; j < n; j++) {
                if (!used[j] && (minIndex == -1 || arr[j] < arr[minIndex])) {
                    minIndex = j;
                }
            }
            result[i] = arr[minIndex];
            used[minIndex] = true;
        }

        // Step 2: Find second half maximum elements
        for (int i = mid; i < n; i++) {
            int maxIndex = -1;
            for (int j = 0; j < n; j++) {
                if (!used[j] && (maxIndex == -1 || arr[j] > arr[maxIndex])) {
                    maxIndex = j;
                }
            }
            result[i] = arr[maxIndex];
            used[maxIndex] = true;
        }

        System.out.println(Arrays.toString(result));
    }
}