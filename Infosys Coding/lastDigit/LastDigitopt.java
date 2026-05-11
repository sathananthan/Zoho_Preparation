import java.math.BigInteger;
import java.util.*;

public class LastDigitopt {
    public static int lastDigit(String a, String b) {
        if (b.equals("0")) return 1;

        int base = a.charAt(a.length() - 1) - '0';

        int[][] cycles = {
            {0},{1},{2,4,8,6},{3,9,7,1},{4,6},
            {5},{6},{7,9,3,1},{8,4,2,6},{9,1}
        };

        int[] cycle = cycles[base];
        // System.out.println("cycle : "+Arrays.toString(cycle));
        int cycleLength = cycle.length;
        // System.out.println("cycle length : "+cycleLength);

        BigInteger exponent = new BigInteger(b);
        // System.out.println("exponent : "+exponent);
        int index = exponent.mod(BigInteger.valueOf(cycleLength)).intValue();  
        // System.out.println("Index : "+index);

        if (index == 0) index = cycleLength;

        return cycle[index - 1];
    }
    public static void main(String[] args){
        System.out.println("last Digit : "+lastDigit("3","2"));
    }
}

/* Simple example:
Pattern = [2, 5, 1, 8]
Exponent = 10

Length = 4

10 mod 4 = 2 → remainder 2 means pick the 2nd number: 5
So the answer = 5.

If exponent = 12:

12 mod 4 = 0 → that means pick the last number: 8 */