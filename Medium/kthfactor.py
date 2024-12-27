class Solution:
    def kthFactor(self, n: int, k: int) -> int:
        counter = 1
        for i in range(1,n+1):
            if n%i==0:
                if counter==k:
                    return i
                else:
                    counter+=1
        return -1