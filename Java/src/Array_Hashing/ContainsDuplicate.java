import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            boolean added = seen.add(num);
            if (!added)
                return true;
        }
        return false;
    }
}
