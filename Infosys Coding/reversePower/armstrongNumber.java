class armstrongNumber {

    static boolean armstrongNumber(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum = sum + (digit * digit * digit);

            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        System.out.println(armstrongNumber(153)); // true
        System.out.println(armstrongNumber(372)); // false
        System.out.println(armstrongNumber(100)); // false
    }
}