class Solution:
    def mySqrt(self, x: int) -> int:
        l,r=1,x
        if x<2:
            return x
        while r>=l:
            mid = (l+r)//2
            if mid*mid > x:
                r = mid-1
            elif mid*mid < x:
                l = mid+1
            else:
                return mid
            
        return l-1
                