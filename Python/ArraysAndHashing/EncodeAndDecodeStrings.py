class Solution:
    def encode(self, strs: list[str]) -> str:
        result = ""

        for word in strs:
            result += str(len(word)) + "#" + word

        return result

    def decode(self, encoded_string: str) -> list[str]:
        result = []
        index = 0

        while index < len(encoded_string):
            next_hashtag = encoded_string.find("#", index)
            word_length_text = encoded_string[index:next_hashtag]

            word_length = int(word_length_text)
            word_start = next_hashtag + 1
            word = encoded_string[word_start:word_start + word_length]

            result.append(word)
            index = word_start + word_length

        return result
