package Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dict = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];

            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }

            String signature = Arrays.toString(count);

            if (!dict.containsKey(signature)) {
                dict.put(signature, new ArrayList<>());
            }

            dict.get(signature).add(word);
        }

        return new ArrayList<>(dict.values());
    }
}
