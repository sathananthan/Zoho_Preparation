class TwoSumPointerConceptSolution {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // return 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;   // need bigger sum
            } else {
                right--;  // need smaller sum
            }
        }

        return new int[]{-1, -1}; // won't happen as per problem
    }

    public static void main(String[] args) {
        // Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4};
        int target = 3;

        int[] result = twoSum(numbers, target);
        System.out.println(result[0] + ", " + result[1]); // 1, 2
    }
}