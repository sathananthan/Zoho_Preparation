import java.util.*;

class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // System.out.println(map);

        // Step 2: Min Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // System.out.println(pq);

        for (int num : map.keySet()) {
            // System.out.println("map.keySet() : "+map.keySet());
            pq.add(num);

            if (pq.size() > k) {
                pq.poll(); // remove smallest freq
            }
        }

        // Step 3: Build result
        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        TopKFrequent obj = new TopKFrequent();

        int[] nums = {1,1,1,1,1,1,1,1,2,2,3,3,3,4};
        int k = 2;

        System.out.println(Arrays.toString(obj.topKFrequent(nums, k)));
    }
}