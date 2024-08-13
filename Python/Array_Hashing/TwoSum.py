from typing import List


# Question: Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
# You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
# Return the answer with the smaller index first.
# Examples: nums = [3,4,5,6], target = 7, Output: [0,1]
# Input: nums = [4,5,6], target = 10, Output: [0,2]

def twoSum(nums: List[int], target: int) -> List[int]:
    output = {}
    for i, n in enumerate(nums):
        difference = target - n
        if difference in output:
            return [output[difference], i]
        output[n] = i


if __name__ == '__main__':
    nums = [3, 4, 5, 6]
    target = 11
    print("Answer", twoSum(nums, target))
