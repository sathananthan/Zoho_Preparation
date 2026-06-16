package com.ncs.array.basics;

import java.util.ArrayList;
import java.util.List;

public class Frequencies_in_a_Limited_Array {
    public static List<Integer> freqArray(int[] arr){
        List<Integer> freq = new ArrayList<>();

        int n = arr.length;
        int[] freqArray = new int[n];

        for(int num: arr){
            freqArray[num - 1]++;
        }

        for(int count: freqArray){
            freq.add(count);
        }

        return freq;
    }

    static void main() {
        int[] arr = {2, 3, 2, 3, 5};
        System.out.println(freqArray(arr));
    }
}
