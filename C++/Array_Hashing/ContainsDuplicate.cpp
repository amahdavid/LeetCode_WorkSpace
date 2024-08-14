#include <vector>
#include <unordered_set>
#include <iostream>
using namespace std;

bool hasDuplicate(vector<int>& nums) {
    unordered_set<int> seen;
    for (auto num : nums)
    {
        if (seen.find(num) != seen.end())
        {
            return true;
        }
        seen.insert(num);
    }
    return false;
}

int main() {
    vector<int> nums = {1, 2, 3, 4};
    cout << boolalpha << hasDuplicate(nums) << endl;
    return 0;
}