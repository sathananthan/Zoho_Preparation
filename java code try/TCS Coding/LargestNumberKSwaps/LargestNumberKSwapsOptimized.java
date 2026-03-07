class LargestNumberKSwapsOptimized{

    static String max;

    static void findMaximum(char[] arr, int k, int index) {

        if (k == 0 || index == arr.length)
            return;

        char maxDigit = arr[index];

        // find max digit from index to end
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > maxDigit) {
                maxDigit = arr[i];
            }
        }

        // if max digit not same, we will use a swap
        if (maxDigit != arr[index])
            k--;

        for (int i = arr.length - 1; i >= index; i--) {

            if (arr[i] == maxDigit) {

                // swap
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                String current = new String(arr);

                if (current.compareTo(max) > 0)
                    max = current;

                // recursion
                findMaximum(arr, k, index + 1);

                // backtrack
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        String str = "129814999";
        int k = 4;

        max = str;

        findMaximum(str.toCharArray(), k, 0);

        System.out.println("Largest number: " + max);
    }
}