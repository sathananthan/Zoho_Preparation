class LargestNumberKSwaps {

    static String max;

    static void findMaximum(String str, int k, int index) {

        if (k == 0) return;

        int n = str.length();
        char[] arr = str.toCharArray();

        for (int i = index; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {

                    // swap
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    String newStr = new String(arr);
                    // System.out.println("Comare to : "+max.compareTo(newStr));
                    // update max
                    if (max.compareTo(newStr) < 0) {
                        max = newStr;
                    }

                    // recursion
                    findMaximum(newStr, k - 1, i + 1);

                    // backtrack
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        String str = "129814999";
        int k = 4;

        max = str;

        findMaximum(str, k, 0);

        System.out.println("Largest number: " + max);
    }
}

/*  | Feature              | Basic Solution    | Optimized Solution |
    | -------------------- | ----------------- | ------------------ |
    | Core technique       | Backtracking      | Backtracking       |
    | Swaps attempted      | All larger digits | Only max digit     |
    | Branches             | Many              | Few                |
    | Time complexity      | ~ O(n²k)          | ~ O(n^k)           |
    | Interview preference | Acceptable        | **Preferred**      | */