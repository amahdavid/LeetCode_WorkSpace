// Problem: Contains Duplicate
// Difficulty: Easy
// Pattern: Hash Set
// Time Complexity: O(n)
// Space Complexity: O(n)

public class Solution
{
    // Given an integer array nums, return true if any value appears more than once in the array,
    // otherwise return false.
    public bool hasDuplicate(int[] nums)
    {
        HashSet<int> seen = [];
        foreach (var num in nums)
        {
            var added = seen.Add(num);

            if (!added)
                return true;
        }
        return false;
    }
}
