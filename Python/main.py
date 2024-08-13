from typing import List


# Question: Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
# Example 1: Input: nums = [1, 2, 3, 3], Output: True
# Example 2: Input: nums = [1, 2, 3, 4], Output: False
# Solution:

def hasDuplicate(nums: List[int]) -> bool:
    output = set()
    for x in nums:
        if x in output:
            return True
        output.add(x)
    return False


if __name__ == '__main__':
    test = [1, 2, 3, 3]
    print("Answer:", hasDuplicate(test))
