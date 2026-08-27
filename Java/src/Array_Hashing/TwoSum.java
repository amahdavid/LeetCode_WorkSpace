package Array_Hashing;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        var indexes = new int[]{0, 0};
        HashMap<Integer, Integer> valueHolder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var needed = target - nums[i];
            if (valueHolder.containsKey(needed)) {
                indexes[0] = valueHolder.get(needed);
                indexes[1] = i;
                return indexes;
            }
            valueHolder.put(nums[i], i);
        }
        return indexes;
    }
}
