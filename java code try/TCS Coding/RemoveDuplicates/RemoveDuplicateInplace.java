public class RemoveDuplicateInplace {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int j = 0; // pointer for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Print unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew length = " + (j + 1));
    }
}