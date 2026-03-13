import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 2, 8, 9};

        // Step 1: Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Step 2: Add array elements to HashSet (duplicates will be ignored)
        for (int num : arr) {
            set.add(num);
        }

        // Step 3: Convert HashSet back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        System.out.println("hashset"+set);
        // Step 4: Print result
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}  // t - O(n) s - O(n)