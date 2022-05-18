class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap={}
        for i in range(len(nums)):
            difference = target-nums[i]
            if nums[i] in numMap.keys():
                return [numMap[nums[i]],i]
            else:
                numMap[difference] = i

  