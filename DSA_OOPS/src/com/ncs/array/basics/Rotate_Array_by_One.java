package com.ncs.array.basics;

import java.util.Arrays;

public class Rotate_Array_by_One {
    public static void rotate(int[] arr){
        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
