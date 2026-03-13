public class RotateArrayLeftReverselMethod {

    static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 9;

        k = k % n;     // k = 2    2 % 7  //here 9 shift same as 2 shift so this

        reverse(arr, 0, k-1);   // 2 1 3 4 5 6 7
        reverse(arr, k, n-1);   // 2 1 7 6 5 4 3
        reverse(arr, 0, n-1);   // 3 4 5 6 7 1 2

        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)