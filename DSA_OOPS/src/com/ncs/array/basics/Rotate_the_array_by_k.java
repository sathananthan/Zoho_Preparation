package com.ncs.array.basics;

import java.util.ArrayList;

public class Rotate_the_array_by_k {
    public static ArrayList<Integer> rotateByK(ArrayList<Integer> arr, int k){
        ArrayList<Integer> rotated = new ArrayList<>();

        for(int i = k; i < arr.size(); i++){
            rotated.add(arr.get(i));
        }

        for(int i = 0; i < k; i++){
            rotated.add(arr.get(i));
        }
        return rotated;
    }

    static void main() {
        ArrayList<Integer> list= new ArrayList<>();  //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(9);list.add(4);list.add(3);list.add(2);list.add(10);list.add(5);list.add(0);

        int k = 2;

        System.out.println(list);

        ArrayList<Integer> rotated = rotateByK(list, k);
        System.out.println(rotated);
    }
}
