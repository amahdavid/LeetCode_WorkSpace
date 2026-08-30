class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        result = [1] * len(nums)
        running_product = 1

        for i in range(len(nums)):
            result[i] = running_product
            running_product *= nums[i]

        running_product = 1

        for i in range(len(nums) - 1, -1, -1):
            result[i] *= running_product
            running_product *= nums[i]

        return result
