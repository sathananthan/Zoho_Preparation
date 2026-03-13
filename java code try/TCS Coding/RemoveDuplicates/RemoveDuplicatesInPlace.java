import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {       //witout HashSet
        int[] arr = {4, 2, 5, 2, 1, 4, 3, 4};
        int n = arr.length;

        int newLength = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newLength++] = arr[i];
            }
        }

        // Print result
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newLength)));
        // System.out.println(Arrays.toString(arr));
    }
}  // t - O(n^2) s - O(n)

   // we doing copy so s - O(n)