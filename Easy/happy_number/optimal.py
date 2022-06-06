class Solution:
    def isHappy(self, n: int) -> bool:
        nums = set()
        
        while n not in nums:
            #if same number appears again, it will be a cycle hence an infinite loop that               never reaches 1
            nums.add(n)            
            n = self.sumOfSquares(n)

            if n == 1:
                return True
        return False
        
    #helper function
    def sumOfSquares(self,n):
        sum = 0
        while n>0:
            digit = n%10
            sum += digit**2
            n = n//10
        return sum
    