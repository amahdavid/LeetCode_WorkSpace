import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (char letter : s.toCharArray()) {
            countS.put(letter, countS.getOrDefault(letter, 0) + 1);
        }

        for (char letter : t.toCharArray()) {
            countT.put(letter, countT.getOrDefault(letter, 0) + 1);
        }

        return countS.equals(countT);
    }
}
