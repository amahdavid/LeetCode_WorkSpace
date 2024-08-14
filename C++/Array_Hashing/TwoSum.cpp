#include <vector>
#include <unordered_set>
#include <iostream>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> output;
    
    for (size_t i = 0; i < nums.size(); ++i) {
        int difference = target - nums[i];
        
        // Check if the difference is already in the map
        if (output.find(difference) != output.end()) {
            return {output[difference], static_cast<int>(i)};
        }
        // Otherwise, add the current number to the map
        output[nums[i]] = static_cast<int>(i);
    }
    // Return an empty vector if no solution is found
    return {};
}

int main() {
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    
    vector<int> result = twoSum(nums, target);
    
    if (!result.empty()) {
        cout << "Indices: " << result[0] << ", " << result[1] << endl;
    } else {
        cout << "No solution found" << endl;
    }

    return 0;
}