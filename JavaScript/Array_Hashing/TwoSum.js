/**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
function twoSum(nums, target) {
    let output = new Map()

    for (let i = 0; i < nums.length; i++) {
        let difference = target - nums[i];

        if (!output.has(difference)) {
            output.set(nums[i], i);
        } else {
            return new Array(output.get(difference), i)
        }
    }
}

let nums = [3,4,5,6]
let target = 7;
console.log(twoSum(nums, target));