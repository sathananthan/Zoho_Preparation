class GCD_Recurion {

    int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        GCD_Recurion obj = new GCD_Recurion();

        System.out.println(obj.gcd(20, 28));
        // Output: 4
    }
}