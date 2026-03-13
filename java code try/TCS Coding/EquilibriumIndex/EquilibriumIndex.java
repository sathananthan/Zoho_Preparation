public class EquilibriumIndex {

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;

        int totalSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum += arr[i];  // Step 1: calculate total sum
        }

        int leftSum = 0;
        boolean found = false;

        for(int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i]; // Step 2   // current element not added to leftsum also so we subtract and add to rightsum
            if(leftSum == rightSum) {                  // Step 3
                System.out.println("Equilibrium index: " + i);
                found = true;
            }
            leftSum += arr[i];                         // Step 4: update leftSum
        }

        if(!found) System.out.println("No equilibrium index found");
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)