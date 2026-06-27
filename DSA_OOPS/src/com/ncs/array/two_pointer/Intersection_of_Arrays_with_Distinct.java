package com.ncs.array.two_pointer;

import java.util.*;

public class Intersection_of_Arrays_with_Distinct {
    public static int intersection(int[] arr1, int[] arr2){

/*
        if (arr1.length > arr2.length) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }
*/

        HashSet<Integer> set = new HashSet<>();

        for(int num: arr1)
            set.add(num);

        int count = 0;
        for(int num: arr2){
            if(set.contains(num)){
                count++;
            }
        }
        return count;

    }
    public static void main() {
        int[] a = {89, 24, 75, 11, 23}, b = {89, 2, 4};
        System.out.println(intersection(a,b));
    }
}
