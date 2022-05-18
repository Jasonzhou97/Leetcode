class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        numMap = defaultdict(int)
        for num in nums:
            if numMap[num]:
                return True
            numMap[num] = 1