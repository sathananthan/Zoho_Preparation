package com.ncs.array.two_pointer;

import java.util.*;

public class Count_the_triplets {
    public static int countTriplet(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }  //order is not guaranteed i hashmap & it stores frequency of element

        System.out.println("Hashmap :" + freq);
        System.out.println("Hashmap :" + freq);

        ArrayList<Integer> vals = new ArrayList<>(freq.keySet());
        Collections.sort(vals);

        System.out.println("ArrayList :"+vals);

        HashSet<Integer> set = new HashSet<>(vals);   //takes O(1) times to search the element
        int count = 0;
        int m = vals.size();

        for(int i = 0; i < m; i++){
            for(int j = i; j < m; j++){
                if(i == j && freq.get(vals.get(i)) < 2)
                    continue;
                int sum = vals.get(i) +vals.get(j);
                if(set.contains(sum))
                    count++;
            }
        }
        return count;
    }
    static void main() {
        int[] arr = {1, 5, 3, 2};
        System.out.println(countTriplet(arr));
    }
}
