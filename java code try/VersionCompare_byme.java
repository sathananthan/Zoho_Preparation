import java.util.*;

public class VersionCompare_byme{
    public static String versioncom(String v1, String v2){
        String n1[] = v1.split("\\.");
        String n2[] = v2.split("\\.");

        int n = Math.max(n1.length,n2.length);

        for(int i=0; i<n; i++){
            int num1 = i < n1.length ? Integer.parseInt(n1[i]) : 0;
            int num2 = i < n2.length ? Integer.parseInt(n2[i]) : 0;

            if(num1 > num2){
                return "Downgraded";
            }
            if(num2 > num1){
                // System.out.println();
                return "Upgraded";
            }
        }
        return "same";
    }

    public static void main(String[] args){
        // System.out.println(versioncom("1.4.8", "1.3"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Version 1 : ");
        String v1 = sc.nextLine();
        System.out.print("Enter Version 2 : ");
        String v2 = sc.nextLine();
        System.out.println(versioncom(v1,v2));
    }
}