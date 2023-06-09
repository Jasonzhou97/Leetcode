class Solution:
    def countPrimes(self, n: int) -> int:
        #edge case
        if n<2:
            return 0
        result = 0
       #check every number
        for i in range(2,n+1):
            is_prime = True
            #check if they can be divided by every number from 2 to themself-1
            for j in range(2,i):
                if i%j == 0:
                    is_prime = False
                    break
            if is_prime == True:
                result += 1
        
        return result