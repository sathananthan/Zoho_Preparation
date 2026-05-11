public class reverseNumber {
    public static int reverseNumber(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;      // get last digit
            rev = rev * 10 + digit; // add to reversed number
            n = n / 10;             // remove last digit
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(122)); // 221
    }
}