import java.util.*;

public class RelativeSort {

    public static void sortByAnotherArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of arr1
        for(int num : arr1){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        // System.out.println("freq.keySet() before: "+freq.keySet());
        // Step 2: Place elements of arr2 in order
        for(int num : arr2){
            if(freq.containsKey(num)){
                int count = freq.get(num);
                for(int i = 0; i < count; i++){
                    arr1[index++] = num;
                }
                freq.remove(num); // remove handled element
            }
        }

        // System.out.println("freq.keySet() : "+freq.keySet());
        // Step 3: Place remaining elements sorted
        List<Integer> remaining = new ArrayList<>(freq.keySet());
        Collections.sort(remaining);

        // System.out.println("freq.get(num) : "+freq.get(5));
        for(int num : remaining){
            int count = freq.get(num);
            for(int i = 0; i < count; i++){
                arr1[index++] = num;
            }
        }
    }

    public static void main(String[] args){
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};

        sortByAnotherArray(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
    }
}

//Time Complexity = O(N log N)
//Space Complexity = O(N)