# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        #create 2 pointers
        l = 0
        r = n-1

        #use binary search approach
        while r>=l:
            mid = (l+r)//2
            if isBadVersion(mid):
                r = mid-1
            else:
                l = mid+1
        
        return l