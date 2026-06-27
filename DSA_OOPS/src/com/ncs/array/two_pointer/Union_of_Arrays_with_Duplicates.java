package com.ncs.array.two_pointer;

import java.util.*;

public class Union_of_Arrays_with_Duplicates {
    public  static ArrayList<Integer> union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr1)
            set.add(num);
        for(int num: arr2)
            set.add(num);

        return new ArrayList<>(set);
    }
    static void main() {
        int[] a = {1, 2, 3, 2, 1}, b = {3, 2, 2, 3, 3, 2};
        System.out.println(union(a,b));
    }
}
