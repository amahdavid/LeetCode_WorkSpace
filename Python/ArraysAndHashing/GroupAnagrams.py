def groupAnagrams(strs: list[str]) -> list[list[str]]:
    groups = {}

    for word in strs:
        count = [0] * 26

        for ch in word:
            count[ord(ch) - ord('a')] += 1

        signature = tuple(count)

        if signature not in groups:
            groups[signature] = []

        groups[signature].append(word)

    return list(groups.values())
