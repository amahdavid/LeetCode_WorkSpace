/**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     * Given two strings s and t, return true if the two strings are anagrams of each other, 
     * otherwise return false. An anagram is a string that contains the exact same characters 
     * as another string, but the order of the characters can be different.
     */
function isAnagram(s, t) {
    if (s.length !== t.length) {
        return false
    }

    let stringInS = new Map()
    let stringInT = new Map()

    for (let i = 0; i < s.length; i++) {
        let charS = s[i];
        let charT = t[i];

        stringInS.set(charS, (stringInS.get(charS) || 0) + 1);
        stringInT.set(charT, (stringInT.get(charT) || 0) + 1);
    }

    for (let [key, value] of stringInS) {
        if (stringInT.get(key) !== value) {
            return false;
        }
    }

    return true;
}

console.log(isAnagram("listen", "silent")); // Output: true
console.log(isAnagram("hello", "world"));   // Output: false