/* If two strings are anagrams:

        Their length must be equal

        Each character must appear same number of times */

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        int freq[] = new int[256];

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram1");
            return;
        }

        for(int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for(int count: freq){
            if(count != 0){
                System.out.println("Not Anagram2");
                return;
            }
        }
        System.out.println("Anagram");
    }
}