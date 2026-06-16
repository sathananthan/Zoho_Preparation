package com.ncs.array.basics;
import java.util.*;

public class Repeating_number_in_array {
    public static int repeatingElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    public static int DuplicateElementUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

//Floyd's Cycle Detection Algorithm (also called the Tortoise and Hare algorithm).
    public static int findDuplicate(int[] arr) {  //optimized version
        int slow = arr[0];
        int fast = arr[0];
//        Find Intersection
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
//        Find Entrance to cycle
        slow = arr[0];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3,2};             // for optimized version 6 in array it out of boundary
        System.out.println(findDuplicate(arr));
    }
}
