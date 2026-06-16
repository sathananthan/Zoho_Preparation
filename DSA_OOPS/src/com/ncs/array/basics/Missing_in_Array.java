package com.ncs.array.basics;

public class Missing_in_Array {
    public static int missingelement(int[] arr){
        int n = arr.length + 1;

        long expected = (long) n*(n+1)/2;
        long actual = 0;

        for(int num: arr){
            actual +=num;
        }

        return (int)(expected - actual);
    }
    public static void main(String[] args) {
        int[] arr = {1,6,4,2,3};
        System.out.println(missingelement(arr));
    }
}
