package Array_Hashing;

import java.util.HashMap;

/**
 * Question: Given an array of integers nums and an integer target,
 * return the indices i and j such that nums[i] + nums[j] == target and i != j.
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 * Return the answer with the smaller index first.
 * <p>
 * Examples: nums = [3,4,5,6], target = 7, Output: [0,1]
 * Input: nums = [4,5,6], target = 10, Output: [0,2]
 * <p>
 * Solution:
 * I will be using a hashmap once more, it will store integer key value pairs
 * I will get the difference of the target and i
 * I will check the hashmap to see if the difference is in it
 * If the difference is not in the hashmap then i will store it as the integer being the key and the index being the value
 * If the difference is in the hashmap, I will return the index of both integers
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> output = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (!output.containsKey(difference)) {
                output.put(nums[i], i);
            } else {
                return new int[]{output.get(difference), i};
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] input = {4, 5, 6};
        int target = 11;
        int[] answer = twoSum(input, target);

        for (int i : answer) {
            System.out.println("Index: [ " + i + " ]");
        }
    }

}
