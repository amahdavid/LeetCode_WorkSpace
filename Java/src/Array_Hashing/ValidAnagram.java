package Array_Hashing;

import java.util.HashMap;

/**
 * Question: Given two strings s and t, return true if the two strings are anagrams of each other,
 * otherwise return false.
 * <p>
 * An anagram is a string that contains the exact same characters as another string,
 * but the order of the characters can be different.
 * <p>
 * Examples: Input: s = "racecar", t = "carrace", Output: true
 * Input: s = "jar", t = "jam", Output: false
 * <p>
 * Constraints: s and t consist of lowercase English letters.
 * <p>
 * Solution:
 * I will be making use of 2 hashmaps to store each string
 * I will loop through both strings and store them in the hashmap as a Char, Int key value pair
 * I will return the boolean by checking if both hashmaps are equal to each other
 */

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> stringsInS = new HashMap<>();
        HashMap<Character, Integer> stringsInT = new HashMap<>();

        for (char string : s.toCharArray()) {
            stringsInS.put(string, stringsInS.getOrDefault(string, 0) + 1);
        }

        for (char string : t.toCharArray()) {
            stringsInT.put(string, stringsInT.getOrDefault(string, 0) + 1);
        }

        return stringsInS.equals(stringsInT);
    }

    public static void main(String[] args) {
        String test_one, test_two, test_three, test_four;
        test_one = "racecar";
        test_two = "carrace";
        test_three = "xx";
        test_four = "x";

        System.out.println("Output of test_one and test_two: " + isAnagram(test_one, test_two));
        System.out.println("Output of test_three and test_four: " + isAnagram(test_three, test_four));
    }
}
