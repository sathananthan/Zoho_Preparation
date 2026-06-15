package com.ncs.array;

import java.util.HashMap;

public class Check_if_two_arrays_are_equal_or_not {
    public static boolean arrayEqualCheck(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();

        if(arr1.length != arr2.length)
            return false;

        for(int num: arr1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num: arr2){
            if(!map.containsKey(num)){
                return false;
            }

            map.put(num, map.get(num)-1);

            if(map.get(num) == 0){
                map.remove(num);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0}, b = {2, 4, 5, 0, 1};
        System.out.println(arrayEqualCheck(a,b));
    }
}
