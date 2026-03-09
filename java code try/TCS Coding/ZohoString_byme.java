import java.util.*;

public class ZohoString_byme{
    public static String dupli(String input){
        boolean used[] = new boolean[128];  //its array store 128 boolean default false store.
        StringBuilder result = new StringBuilder();

        for(char ch: input.toCharArray()){
            char current = ch;

            while(used[current]){
                current++;
                if((ch >= '0' && ch <='9') && current > '9'){
                    current ='0';
                }

                if((ch >= 'A' && ch <='Z') && current > 'Z'){
                    current ='A';
                }

                if((ch >= 'a' && ch <='z') && current > 'z'){
                    current ='z';
                }
            }

            used[current] = true;
            result.append(current);

        }
    
        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        System.out.println("Output :"+dupli(input));
    }
}