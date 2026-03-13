import java.util.HashSet;

public class SubsetCheckOptimized {
    public static boolean isSubset(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        // Add all elements of arr1 to the set
        for(int num : arr1) set.add(num);

        // Check each element of arr2
        for(int num : arr2){
            //  System.out.println("set return :"+set.contains(num));
            if(!set.contains(num)) return false;
           
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,5};
        System.out.println(isSubset(arr1, arr2)); // true

        int[] arr3 = {2,4,6};
        System.out.println(isSubset(arr1, arr3)); // false
    }
}

//Time Complexity = O(N + M)
//Space Complexity = O(N)