def twoSum(nums: list[int], target: int) -> list[int]:
    value_holder = {}

    for i in range(len(nums)):
        needed = target - nums[i]

        if needed in value_holder:
            return [value_holder[needed], i]

        value_holder[nums[i]] = i

    return []
