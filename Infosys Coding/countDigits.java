public class countDigits {
    public static int countDigits(int n) {
        int temp = n;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit != 0 && n % digit == 0) {
                count++;
            }

            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12));   // 2         2 numbers divide n number
        System.out.println(countDigits(2446)); // 1
        System.out.println(countDigits(23));   // 0
    }
}