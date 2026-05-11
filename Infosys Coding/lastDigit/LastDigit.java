public class LastDigit {
    public static int lastDigit(String a, String b) {
        // If exponent is 0
        if (b.equals("0")) return 1;

        int base = a.charAt(a.length() - 1) - '0';

        // Get last two digits of b (enough for mod 4)
        int exp = 0;
        int len = b.length();

        if (len == 1)
            exp = b.charAt(0) - '0';
        else
            exp = (b.charAt(len - 2) - '0') * 10 + (b.charAt(len - 1) - '0');

        exp = exp % 4;
        if (exp == 0) exp = 4;

        // Compute power (small now!)
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = (result * base) % 10;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println("last Digit : "+lastDigit("3","3"));
    }
}