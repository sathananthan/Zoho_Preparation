class GCDIterable {

    // Function to find GCD of two numbers
    int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Main method for testing
    public static void main(String[] args) {

        GCDIterable obj = new GCDIterable();

        System.out.println(obj.gcd(20, 28));
        // Output: 4

        System.out.println(obj.gcd(60, 36));
        // Output: 12
    }
}