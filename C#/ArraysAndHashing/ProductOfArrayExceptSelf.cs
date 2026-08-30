public class Solution
{
    public int[] ProductExceptSelf(int[] nums)
    {
        int[] result = new int[nums.Length];
        int runningProduct = 1;

        for (int i = 0; i < nums.Length; i++)
        {
            result[i] = runningProduct;
            runningProduct *= nums[i];
        }

        runningProduct = 1;

        for (int i = nums.Length - 1; i >= 0; i--)
        {
            result[i] *= runningProduct;
            runningProduct *= nums[i];
        }

        return result;
    }
}
