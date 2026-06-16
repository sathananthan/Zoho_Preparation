package com.ncs.array.two_pointer;

import java.util.Arrays;

public class _3Sum {
    public static boolean hasTripleSum(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0; i < n -2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target)
                    return true;
                else if(sum < target)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }

    static void main() {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;

        System.out.println(hasTripleSum(arr,target));
    }
}
