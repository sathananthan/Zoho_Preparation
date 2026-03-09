import java.util.Arrays;

public class MinimumPlatforms {

    public static int findPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        System.out.println(Arrays.toString(arrival)+" "+ Arrays.toString(departure));

        int n = arrival.length;
        int platforms = 1, maxPlatforms = 1;

        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) { //940 > 910 p-- = 0 j++ = 1, 
                                              //940 < 1120 p++ = 1 i++ = 2   
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum Platforms Required: " + 
                            findPlatforms(arrival, departure));
    }
}