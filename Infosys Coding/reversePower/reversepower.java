public class reversepower {

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
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

    public static int powerOfNumber(int n) {
        int rev = reverse(n);
        return power(n, rev);
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(2));  // 4
        System.out.println(powerOfNumber(10)); // 10
        System.out.println(powerOfNumber(20)); // 20 ^ 02 => 20^2 = 400
    }
}