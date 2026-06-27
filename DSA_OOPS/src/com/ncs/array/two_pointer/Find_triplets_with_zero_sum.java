package com.ncs.array.two_pointer;

import java.util.Arrays;

public class Find_triplets_with_zero_sum {
    public  static boolean findTriplets(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i < n -2; i++){
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0)
                    return true;
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }
    static void main() {
        int[] arr = {0, -1, 2, -3, 1};
//        int[] arr = {1, 2, 3};
        System.out.println(findTriplets(arr));
    }
}
