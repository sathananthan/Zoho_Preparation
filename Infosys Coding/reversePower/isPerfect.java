class isPerfect {

    static boolean isPerfect(int n) {

        // 1 is not a perfect number
        if (n == 1) {
            return false;
        }

        int sum = 1;

        // Check divisors till sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {

                sum += i;

                // Add paired divisor
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {

        System.out.println(isPerfect(6));   // true
        System.out.println(isPerfect(10));  // false
        System.out.println(isPerfect(15));  // false
    }
}

/* Input: n = 6
Output: true 
Explanation: Factors of 6 are 1, 2, 3 and 6. Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.
Input: n = 10
Output: false
Explanation: Factors of 10 are 1, 2, 5 and 10. Excluding 10 their sum is 8 which is not equal to n itself. So, it's not a Perfect Number.
Input: n = 15
Output: false
Explanation: Factors of 15 are 1, 3, 5, 15. Excluding 15 their sum is 9 which is not equal to n itself. So, it's not a Perfect Number. */