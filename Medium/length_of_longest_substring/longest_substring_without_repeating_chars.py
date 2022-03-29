class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        s_map = {}
        longest = 0
        l,r=0,0
        x = len(s)
        while l<x and r<x:
            element = s[r]
            if element in s_map:
                l = max(s_map[element]+1,l)
            
            s_map[element] = r
            longest = max(longest,r-l+1)
            r += 1
        
        return longest