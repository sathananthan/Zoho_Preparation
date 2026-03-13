import java.util.HashMap;
import java.util.Map;

public class FrequencyExample1 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,3,2,1,5};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);         //java 8
        }

        // System.out.println(map);
         for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}