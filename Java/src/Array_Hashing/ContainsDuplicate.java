package Array_Hashing;

import java.util.HashMap;

/**
 * Question: Given an integer array nums, return true if any value appears more than once in the array
 * otherwise return false.
 * <p>
 * Examples: Input: nums = [1, 2, 3, 3], Output: true
 * Input: nums = [1, 2, 3, 4], Output: false
 * <p>
 * Solution:
 * I will be making use of a hashmap,
 * I will loop through the array of integers and store the integers as the Key and their frequencies as the value,
 * I will then loop through the value of the hashmap and check if it contains 2 or more keys with more than one frequency
 */

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> output = new HashMap<>();
        for (int num : nums) {
            if (output.containsKey(num)) {
                return true;
            } else {
                output.put(num, output.getOrDefault(num, 1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3, 3};
        int[] example2 = {1, 2, 3, 4};

        System.out.println("Example 1 Output: " + hasDuplicate(example1));
        System.out.println("Example 2 Output: " + hasDuplicate(example2));

    }
}
