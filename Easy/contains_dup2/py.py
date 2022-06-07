class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        map = {}
        for i in range(len(nums)):
            if nums[i] in map.keys():
                #check if the interval is equal or less than k
                if abs(i-map[nums[i]])<=k:
                    return True
                else:
                    #update the map for nearest element
                    map[nums[i]] = i
            else:
                #add the index to map
                map[nums[i]] = i
                
        return False