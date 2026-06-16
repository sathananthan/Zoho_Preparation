import java.util.*;

public class TopKFrequent_but_slow_approch {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        TopKFrequent_but_slow_approch obj = new TopKFrequent_but_slow_approch();

        int[] nums = {1,2,7,3,3,3,7,7,2,2};
        int k = 2;

        System.out.println(Arrays.toString(obj.topKFrequent(nums, k)));

    }
}