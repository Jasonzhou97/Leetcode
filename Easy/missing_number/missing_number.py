class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        correctSum = n*(n+1)//2
        actualSum = 0
        for num in nums:
            actualSum += num
        return correctSum-actualSum