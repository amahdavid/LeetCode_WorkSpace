function groupAnagrams(strs: string[]): string[][] {
    const groups = new Map<string, string[]>();

    for (const word of strs) {
        const count = new Array(26).fill(0);

        for (const ch of word) {
            const index = ch.charCodeAt(0) - 'a'.charCodeAt(0);
            count[index]++;
        }

        const signature = count.join("#");

        if (!groups.has(signature)) {
            groups.set(signature, []);
        }

        groups.get(signature)!.push(word);
    }

    return Array.from(groups.values());
}
