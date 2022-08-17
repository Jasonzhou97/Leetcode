class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSum = curSum = nums[0]
        for n in nums[1:]:
            if curSum<0:
                curSum = 0
            curSum += n
            maxSum = max(maxSum,curSum)
            
        return maxSum
            