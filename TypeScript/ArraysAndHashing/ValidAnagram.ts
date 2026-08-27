function isAnagram(s: string, t: string): boolean {
    if (s.length !== t.length)
        return false;

    const countS = new Map<string, number>();
    const countT = new Map<string, number>();

    for (const letter of s) {
        countS.set(letter, (countS.get(letter) ?? 0) + 1);
    }

    for (const letter of t) {
        countT.set(letter, (countT.get(letter) ?? 0) + 1);
    }

    for (const [letter, count] of countS) {
        if (countT.get(letter) !== count) {
            return false;
        }
    }

    return true;
}
