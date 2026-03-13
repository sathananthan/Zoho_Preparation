import java.util.*;
public class LeftRotateK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;

        k = k % n;

        int[] temp = new int[k];

        for(int i=0;i<k;i++){
            temp[i] = arr[i];  // 1 2 
        }

        for(int i=k;i<n;i++){
            arr[i-k] = arr[i]; // 3 4 5
        }

        for(int i=0;i<k;i++){
            arr[n-k+i] = temp[i]; // 3 4 5 1 2
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        // System.out.println(Arrays.toString(arr));
    }
}

//Time Complexity = O(N)
//Space Complexity = O(K)