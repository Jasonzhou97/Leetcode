class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        total = 0
        result = []
        
        for num in digits:
            total = total*10 + num
            
        #plus 1
        total += 1
        
        while total>0:
            remainder = total%10
            result.insert(0,remainder)
            total //= 10
        
        return result
        