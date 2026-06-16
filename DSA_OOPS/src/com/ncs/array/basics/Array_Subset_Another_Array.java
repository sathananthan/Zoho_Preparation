package com.ncs.array.basics;

import java.util.HashMap;

public class Array_Subset_Another_Array {
    public static boolean subset(int[] a, int[] b){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num: a){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num: b){
            if(!freq.containsKey(num) || freq.get(num) == 0){
                return false;
            }
            freq.put(num, freq.get(num) - 1);
        }
        return true;
    }
    static void main() {
//        int[] a = {11, 7, 1, 13, 21, 3, 7, 3}, b = {11, 3, 7, 1, 7};
        int[] a = {10, 5, 2, 23, 19}, b = {19, 5, 3};
        System.out.println(subset(a,b));
    }
}
