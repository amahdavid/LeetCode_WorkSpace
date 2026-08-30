public class Solution
{
    public string Encode(IList<string> strs)
    {
        var result = "";

        foreach (var word in strs)
        {
            result += word.Length + "#" + word;
        }

        return result;
    }

    public List<string> Decode(string encodedString)
    {
        var result = new List<string>();
        var index = 0;

        while (index < encodedString.Length)
        {
            var nextHashtag = encodedString.IndexOf('#', index);
            var wordLengthText = encodedString.Substring(
                index,
                nextHashtag - index
            );

            var wordLength = Int32.Parse(wordLengthText);
            var wordStart = nextHashtag + 1;
            var word = encodedString.Substring(wordStart, wordLength);

            result.Add(word);
            index = wordStart + wordLength;
        }

        return result;
    }
}
