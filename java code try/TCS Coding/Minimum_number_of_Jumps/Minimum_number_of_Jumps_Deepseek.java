class Minimum_number_of_Jumps_Deepseek {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        
        // Base cases
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;
        
        int jumps = 1;           // At least 1 jump needed
        int maxReach = arr[0];   // Farthest we can reach
        int stepsLeft = arr[0];  // Steps remaining in current jump
        
        for (int i = 1; i < n; i++) {
            // Reached the end
            if (i == n - 1) return jumps;
            
            // Update farthest reach
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Use one step
            stepsLeft--;
            
            // Current jump is completed
            if (stepsLeft == 0) {
                jumps++;  // Need new jump
                
                // Can't go further
                if (i >= maxReach) return -1;
                
                // Reset steps for next jump
                stepsLeft = maxReach - i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2, 1, 1, 1, 4};
        System.out.print(minJumps(arr));
    }
}