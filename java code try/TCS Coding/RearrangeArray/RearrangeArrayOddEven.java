import java.util.Arrays;

public class RearrangeArrayOddEven {   // increase decrease it show like [1, 3, 2, 5, 4, 6] using odd even
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        for(int i = 0; i < arr.length-1; i++) {

            if(i % 2 == 0) {  
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else {            
                if(arr[i] < arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

// t - O(n) s - O(1)