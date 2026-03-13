import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        Arrays.sort(arr);   // Step 1: sort array

        int n = arr.length;
        int mid = n / 2;

        // Step 2: reverse the second half
        int left = mid;
        int right = n - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}