class Solution(object):
    def twoSum(self, nums, target):
        presented = dict()
        for i, n in enumerate(nums):
            j = presented.get(target - n, None)
            if j is not None:
                return [i, j]
            presented[n] = i
