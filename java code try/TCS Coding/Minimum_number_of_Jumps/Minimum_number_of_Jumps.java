class Minimum_number_of_Jumps {
    public static int minJumps(int[] arr) {

        if (arr.length <= 1) return 0;   // already at end //no jump happen
        if (arr[0] == 0) return -1;      // cannot move 

        int jumps = 1;        // we start with first jump
        int maxReach = arr[0];
        int steps = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (i == arr.length - 1)
                return jumps;

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;

                if (i >= maxReach)
                    return -1;

                steps = maxReach - i;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        int arr[] = {2, 1, 1, 1, 4};
        System.out.print(minJumps(arr));
    }
}