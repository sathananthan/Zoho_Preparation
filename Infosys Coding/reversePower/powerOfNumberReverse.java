class powerOfNumberReverse {

    // Function to reverse the number
    public static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    static int power(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            result *= base;
            exp--;
        }
        return result;
    }

    // Function to find n raised to the power of its reverse
    public static int reverseExponentiation(int n) {

        int rev = reverse(n);

        // Calculate n^rev
        // int result = (int)Math.pow(n, rev);
        int result = power(n,rev);

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Solution obj = new Solution();

        int n1 = 2;
        System.out.println(reverseExponentiation(n1));
        // Output: 4

        int n2 = 10;
        System.out.println(reverseExponentiation(n2));
        // Output: 10
    }
}