public class ReverseStringEachWord {
    public static void main(String[] args) {
        String str = "I am sathananthan";
        String words[] = str.split(" ");

        StringBuilder sb = new StringBuilder(); 
        for(String word: words){            //iterate through word
                  //iterate through letter
            for(int i = word.length() - 1; i>=0; i--){ //i think String length() array length
                // System.out.print(word.charAt(i)+" ");
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        System.out.print(sb);

    }
}