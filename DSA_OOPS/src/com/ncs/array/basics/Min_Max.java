package com.ncs.array.basics;

import java.util.*;

public class Min_Max {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length ;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,8,9};

        ArrayList<Integer> result = getMinMax(arr);
        System.out.println("Min = " + result.get(0));
        System.out.println("Max = " + result.get(result.size()-1));
    }
}
