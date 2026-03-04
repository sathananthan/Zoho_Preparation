public class PermutationWithSpaces {

    public static void generate(String input, String output) {

        // Base case
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        // Take first character
        char ch = input.charAt(0);
        String remaining = input.substring(1);
        // System.out.println("remaining : "+remaining);

        // Option 1: Add space before next character
        generate(remaining, output + " " + ch);

        // Option 2: No space
        generate(remaining, output + ch);
    }

    public static void main(String[] args) {
        String str = "ABC";

        // First character fixed
        generate(str.substring(1), "" + str.charAt(0));
    }
}