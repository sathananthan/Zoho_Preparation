class isPrimeOptimized {

    static boolean isPrime(int n) {

        // 0 and 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Check divisors till sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(7));   // true
        System.out.println(isPrime(25));  // false
        System.out.println(isPrime(1));   // false
    }
}