package com.ncs.array.basics;

import java.util.*;
public class ThirdLargest {
    public static int thirdLargest(List<Integer> arr) {
        int n = arr.size();

        if (n < 3) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                third = second;
                second = first;
                first = num;
            }else if(num > second){
                third = second;
                second = num;
            }else if(num > third){
                third = num;
            }
        }
        return third;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(4,2,6,8,1);

        System.out.println(thirdLargest(list));
    }
}
