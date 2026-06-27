package com.ncs.array.two_pointer;

import java.util.*;

public class Remove_Duplicate {
    public static ArrayList<Integer> removeDuplicate(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    public static  ArrayList<Integer> removeDuplicates(int[] arr) {   //check this
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int index = 0; // position for next unique element

        for(int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            // check if arr[i] already exists in 0..index-1
            for (int j = 0; j < index; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
//                arr[index] = arr[i];
                ans.add(arr[i]);
                index++;
            }
        }

        return ans; // size of unique elements
    }

    static void main() {
        int[] arr = {1,1, 2, 4, 4};   //given sorted array
        System.out.println(removeDuplicate(arr));
        System.out.println(removeDuplicates(arr));
    }
}
