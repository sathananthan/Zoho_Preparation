public class FirstNonRepeatingBruteForce {
    public static void main(String[] args) {
    String str = "swiss";
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                break;
            }
        }
    }


}
//Time Complexity = O(N^2)
//Space Complexity = O(1)
