public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Java is easy";
        String[] words = str.split(" ");

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }

            System.out.print(sb + " ");
        }
    }
}