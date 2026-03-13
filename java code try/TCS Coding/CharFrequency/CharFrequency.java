import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world ";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)