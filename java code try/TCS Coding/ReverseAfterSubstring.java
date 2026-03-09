import java.util.*;

public class ReverseAfterSubstring {

    public static String reverseAfter(String s1, String s2) {

        String[] words = s1.split(" ");
        int index = -1;

        // Find first word containing s2
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(s2)) {
                index = i;
                break;
            }
        }

        if (index == -1) return s1;  // substring not found

        // Reverse from index to end
        int left = index;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s1 = "This is a test String only";
        String s2 = "st";

        System.out.println(reverseAfter(s1, s2));
    }
}