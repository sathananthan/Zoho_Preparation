import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 20, 4, 10, 3, 4, 5};
        int[] nums2 = {0, 3, 2, 5, 4, 6, 1, 1};

        System.out.println("Output 1: " + longestConsecutive(nums1)); // 4
        System.out.println("Output 2: " + longestConsecutive(nums2)); // 7
    }
}