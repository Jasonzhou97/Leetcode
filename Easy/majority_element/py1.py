class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        numMap = {}
        for num in nums:
            #set 0 if value is not found, +1 to its frequency
            numMap[num] =numMap.get(num,0) + 1
        for num in nums:
            if numMap[num] > len(nums)//2:
                return num