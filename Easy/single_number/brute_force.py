class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #create a dictionary
        map = {}
        for num in nums:
            if num in map.keys():
                map[num]+=1
            else:
                map[num]=1
        #return the number with frequency of 1
        for key in map:
            if map[key]==1:
                return key