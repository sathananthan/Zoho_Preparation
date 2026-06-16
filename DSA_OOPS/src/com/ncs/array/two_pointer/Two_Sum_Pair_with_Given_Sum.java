package com.ncs.array.two_pointer;

import java.util.HashMap;

public class Two_Sum_Pair_with_Given_Sum {
    public  static boolean TwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement))
                return true;

            map.put(nums[i], i);
        }
        return false;
    }
    static void main() {
       int[] arr = {0, -1, 2, -3, 1};
       int target = -2;

       System.out.println(TwoSum(arr,target));
    }
}
