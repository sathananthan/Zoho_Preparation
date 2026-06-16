import java.util.*;

class Codec {

    // Encodes a list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length())
                   .append('#')
                   .append(str);
        }

        return encoded.toString();
    }

    // Decodes a single string back to list of strings
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find the delimiter '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Get length of the string
            int length = Integer.parseInt(s.substring(i, j));   
            // System.out.println("Length : "+length+s.substring(i, j));    // (0,1) gives 5


            // Extract the string
            j++; // move past '#'
            String str = s.substring(j, j + length);
            result.add(str);

            // Move to next encoded part
            i = j + length;
        }

        return result;
    }
}

public class EncodeDecodeCodec {
    public static void main(String[] args) {
        Codec codec = new Codec();

        // Example input
        List<String> input = Arrays.asList("Hello", "World", "", "Java#Rocks");

        // Encode
        String encoded = codec.encode(input);
        System.out.println("Encoded string:");
        System.out.println(encoded);

        // Decode
        List<String> decoded = codec.decode(encoded);
        System.out.println("\nDecoded list:");
        for (String str : decoded) {
            System.out.println("\"" + str + "\"");
        }

        // Verify correctness
        System.out.println("\nMatch with original: " + input.equals(decoded));
    }
}