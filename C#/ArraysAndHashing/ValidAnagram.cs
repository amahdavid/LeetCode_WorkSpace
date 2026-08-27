namespace LeetCode;

public class Solution
{
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
