// import java.util.*;

public class ReverseWordsString {
    public static void main(String[] args) {
        String str = "I am sathananthan";
        String words[] = str.split(" ");
        // System.out.println(Arrays.toString(words));

        for(int i = words.length -1; i>=0; i--){
            System.out.print(words[i]+" ");
        }
    }
}