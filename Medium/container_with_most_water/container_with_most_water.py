class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        max_area = 0
        l = 0
        r = len(height) - 1
        while r>l:
            width = r - l
            h = min(height[l],height[r])
            area = h*width
            max_area = max(max_area,area)
            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
                
        return max_area