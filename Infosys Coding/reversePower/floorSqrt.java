class floorSqrt {

    int floorSqrt(int n) {

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            // Perfect square
            if (square == n) {
                return mid;
            }

            // Move right
            else if (square < n) {
                ans = mid;
                low = mid + 1;
            }

            // Move left
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        floorSqrt obj = new floorSqrt();

        System.out.println(obj.floorSqrt(4));   // 2
        System.out.println(obj.floorSqrt(11));  // 3
        System.out.println(obj.floorSqrt(1));   // 1
    }
}