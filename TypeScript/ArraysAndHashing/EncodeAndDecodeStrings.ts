class Solution {
    encode(strs: string[]): string {
        let result = "";

        for (const word of strs) {
            result += word.length + "#" + word;
        }

        return result;
    }

    decode(encodedString: string): string[] {
        const result: string[] = [];
        let index = 0;

        while (index < encodedString.length) {
            const nextHashtag = encodedString.indexOf("#", index);
            const wordLengthText = encodedString.slice(index, nextHashtag);

            const wordLength = Number(wordLengthText);
            const wordStart = nextHashtag + 1;
            const word = encodedString.slice(
                wordStart,
                wordStart + wordLength
            );

            result.push(word);
            index = wordStart + wordLength;
        }

        return result;
    }
}
