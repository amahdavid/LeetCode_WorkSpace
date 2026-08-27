using System.Collections.Generic;

public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        var answer = new int[] { 0, 0 };
        var dict = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            var needed = target - nums[i];
            if (dict.TryGetValue(needed, out int value))
            {
                answer[0] = value;
                answer[1] = i;
                return answer;
            }
            dict[nums[i]] = i;
        }
        return [];
    }
}
