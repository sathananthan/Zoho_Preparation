import java.util.*;

public class PalindromePartition {

    static List<List<String>> result = new ArrayList<>();
    // STEP 1: Write the method signature
    public static void partition(String s, int start, List<String> path) {
        // STEP 2: Write the base case (ALWAYS easiest!)
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        // STEP 3: Loop through all possible end positions
        for (int end = start; end < s.length(); end++) {
            // STEP 4: Check if current substring is valid
            if (isPalindrome(s, start, end)) {
                
                // 1️⃣ CHOOSE: Add current palindrome
                path.add(s.substring(start, end + 1));
                
                // 2️⃣ EXPLORE: Recurse for remaining string
                partition(s, end + 1, path);
                
                // 3️⃣ UNCHOOSE: Remove it (backtrack)
                path.remove(path.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "aab";

        partition(s, 0, new ArrayList<>());

        for (List<String> p : result) {
            System.out.println(p);
        }
        // System.out.println(result);
    }
}