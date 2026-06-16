import java.util.*;

class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();
            // System.out.println("Before Array sort : "+Arrays.toString(arr));
            Arrays.sort(arr);

            String key = new String(arr);

            // System.out.println("key : "+key);
            // System.out.println("Array sort : "+Arrays.toString(arr));

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());  //create new key
            }

            map.get(key).add(word);   //add word on that key
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        GroupAnagrams obj = new GroupAnagrams();

        String[] strs = {"act","pots","tops","cat","stop","hat"};

        System.out.println(obj.groupAnagrams(strs));
    }
}