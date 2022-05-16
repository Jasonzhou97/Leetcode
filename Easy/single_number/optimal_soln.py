class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        actualSum = sum(nums)
        #get a list of every number in the list only once
        singleList = set(nums)
        #calculate the supposed sum if all of them appear twice
        originalSum = sum(singleList)*2
        
        #difference is the missing number
        return originalSum - actualSum