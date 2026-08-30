import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        String result = "";

        for (String word : strs) {
            result += word.length() + "#" + word;
        }

        return result;
    }

    public List<String> decode(String encodedString) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < encodedString.length()) {
            int nextHashtag = encodedString.indexOf('#', index);
            String wordLengthText = encodedString.substring(index, nextHashtag);

            int wordLength = Integer.parseInt(wordLengthText);
            int wordStart = nextHashtag + 1;
            String word = encodedString.substring(
                wordStart,
                wordStart + wordLength
            );

            result.add(word);
            index = wordStart + wordLength;
        }

        return result;
    }
}
