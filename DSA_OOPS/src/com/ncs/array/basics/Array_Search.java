package com.ncs.array.basics;

public class Array_Search {
    public static int search(int arr[], int x) {
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == x)
               return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr= {2,7,6,4,9};
//        System.out.println("arr lngth "+arr.length);
        int tar = 9;
        System.out.println(search(arr, tar));
    }
}
