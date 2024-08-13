/**
     * @param {number[]} nums
     * @return {boolean}
     */
function hasDuplicate(nums) {
    let seen = new Map();

    for (let i = 0; i < nums.length; i++) {
        if (seen.has(nums[i])) {
            return true;
        }
        seen.set(nums[i], true);
    }
    return false;
}

// Example usage
let nums = [3, 4, 5, 6, 7];
console.log(hasDuplicate(nums)); // Output: false

let numsWithDuplicates = [3, 4, 5, 6, 7, 3];
console.log(hasDuplicate(numsWithDuplicates)); // Output: true