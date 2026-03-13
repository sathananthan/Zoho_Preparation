import java.util.*;

public class FirstNonRepeating {
public static void main(String[] args) {
    String str = "swiss";
    HashMap<Character, Integer> map = new HashMap<>();

    // Step 1: Count frequency
    for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // System.out.println("map : "+map);
    // Step 2: Find first non-repeating character
    for (char c : str.toCharArray()) {
        if (map.get(c) == 1) {
            System.out.println("First non-repeating character: " + c);
            break;
        }
    }
}


}
//Time Complexity = O(N)
//Space Complexity = O(N)