using System.Collections.Generic;
using System.Linq;

public class GroupAnagramsSolution
{
    public List<List<string>> GroupAnagrams(string[] strs)
    {
        var dict = new Dictionary<string, List<string>>();

        foreach (var word in strs)
        {
            var count = new int[26];

            foreach (var ch in word)
            {
                count[ch - 'a']++;
            }

            var signature = string.Join("#", count);

            if (!dict.ContainsKey(signature))
            {
                dict[signature] = new List<string>();
            }

            dict[signature].Add(word);
        }

        return dict.Values.ToList();
    }
}
