import java.util.*;

class LargestNumberKSwapsIterative {
    
    public static String findMaximumNum(String str, int k) {
        // Queue stores pairs of (currentString, swapsUsed)
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(str, 0));
        
        String maxNumber = str;
        Set<String> visited = new HashSet<>();
        visited.add(str + "|" + 0);  // Mark as visited with swap count
        
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            String currentStr = current.str;
            int swapsUsed = current.swapsUsed;
            
            // If we've used all swaps, continue to next
            if (swapsUsed == k) continue;
            
            char[] arr = currentStr.toCharArray();
            int n = arr.length;
            
            // Try all possible swaps
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    
                    // Only swap if it could improve (larger digit to front)
                    if (arr[j] > arr[i]) {
                        
                        // Create new string after swap
                        char[] newArr = arr.clone();
                        char temp = newArr[i];
                        newArr[i] = newArr[j];
                        newArr[j] = temp;
                        String newStr = new String(newArr);
                        
                        // Update max if needed
                        if (newStr.compareTo(maxNumber) > 0) {
                            maxNumber = newStr;
                        }
                        
                        // Create unique key for visited check
                        String key = newStr + "|" + (swapsUsed + 1);
                        
                        // If not visited, add to queue
                        if (!visited.contains(key)) {
                            visited.add(key);
                            queue.offer(new Pair(newStr, swapsUsed + 1));
                        }
                    }
                }
            }
        }
        
        return maxNumber;
    }
    
    // Helper class to store state
    static class Pair {
        String str;
        int swapsUsed;
        
        Pair(String str, int swapsUsed) {
            this.str = str;
            this.swapsUsed = swapsUsed;
        }
    }
    
    public static void main(String[] args) {
        String[] testCases = {"1298", "1234", "1299", "254"};
        int[] kValues = {4, 2, 2, 1};
        
        for (int i = 0; i < testCases.length; i++) {
            String result = findMaximumNum(testCases[i], kValues[i]);
            System.out.println(testCases[i] + " with k=" + kValues[i] 
                             + " → " + result);
        }
    }
}