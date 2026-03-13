public class RightRotateK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;

        k = k % n;

        int[] temp = new int[k];

        for(int i=0;i<k;i++){
            temp[i] = arr[n-k+i];  // 4 5
        }

        for(int i=n-k-1;i>=0;i--){   // i = 2 arr[2+2] = arr[2]
            arr[i+k] = arr[i];     // 1 2 3     <-- stored this order 3,2,1
        }

        for(int i=0;i<k;i++){
            arr[i] = temp[i];     // 4 5 1 2 3
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//Time Complexity = O(N)
//Space Complexity = O(K)