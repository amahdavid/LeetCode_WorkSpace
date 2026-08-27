function twoSum(nums: number[], target: number): number[] {
    const valueHolder = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {
        const needed = target - nums[i];

        if (valueHolder.has(needed)) {
            return [valueHolder.get(needed)!, i];
        }

        valueHolder.set(nums[i], i);
    }

    return [];
}
