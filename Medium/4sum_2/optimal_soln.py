class Solution:
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        ans = 0
        Map = {}
        
        for i in range(len(nums1)):
            x = nums1[i]
            for j in range(len(nums2)):
                y = nums2[j]
                if (x+y) not in Map:
                    Map[x+y] = 0
                Map[x+y] += 1
        
        for i in range(len(nums3)):
            x = nums3[i]
            for j in range(len(nums4)):
                y = nums4[j]
                target = -(x+y)
                if target in Map:
                    ans += Map[target]
        
        return ans