namespace LeetCode;

public class Solution
{
    // Current approach: build a frequency dictionary for each string and compare them.
    // Possible optimization: use one frequency map and increment for s / decrement for t.
    // Since the problem is limited to lowercase English letters, an int[26] can reduce
    // the extra space to O(1). Revisit this optimization later.
    public bool IsAnagram(string s, string t)
    {
        if (s.Length != t.Length)
            return false;

        Dictionary<char, int> countS = new();
        Dictionary<char, int> countT = new();

        foreach (var letter in s)
        {
            if (!countS.TryAdd(letter, 1))
            {
                countS[letter]++;
            }
        }

        foreach (var letter in t)
        {
            if (!countT.TryAdd(letter, 1))
            {
                countT[letter]++;
            }
        }

        bool areEqual = countS.Count == countT.Count && !countS.Except(countT).Any();
        return areEqual;
    }
}
