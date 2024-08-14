#include <vector>
#include <unordered_set>
#include <iostream>
using namespace std;

bool isAnagram(string s, string t) {
    unordered_map<char, int> stringInS;
    unordered_map<char, int> stringInT;

    // Count the frequency of each character in both strings
    for (char letter : s) {
        stringInS[letter]++;
    }
    for (char letter : t) {
        stringInT[letter]++;
    }
    // Compare the frequency maps
    return stringInS == stringInT;
}


int main() {
    string s = "anagram";
    string t = "nagaram";
    
    if (isAnagram(s, t)) {
        cout << "The strings are anagrams." << endl;
    } else {
        cout << "The strings are not anagrams." << endl;
    }
    return 0;
}