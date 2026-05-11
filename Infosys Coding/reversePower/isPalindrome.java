class isPalindrome {

    public boolean isPalindrome(int n) {

        // Ignore negative sign
        n = Math.abs(n);

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        isPalindrome obj = new isPalindrome();

        System.out.println(obj.isPalindrome(555));   // true
        System.out.println(obj.isPalindrome(123));   // false
        System.out.println(obj.isPalindrome(-121));  // true
    }
}