class Solution:
    def addDigits(self, num: int) -> int:
        
        #ensure it is always double digit
        while num>9:
            sum = 0
            #compute sum of digit
            while num>0:
                digit = num%10
                sum += digit
                num //= 10
            num = sum
        
        return num
                