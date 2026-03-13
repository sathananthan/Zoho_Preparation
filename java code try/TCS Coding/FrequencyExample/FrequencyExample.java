import java.util.HashMap;
import java.util.Map;

public class FrequencyExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 2, 1, 5};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

// O(n) O(n)