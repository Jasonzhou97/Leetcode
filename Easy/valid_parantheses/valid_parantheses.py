class Solution:
    def isValid(self, s: str) -> bool:
        
        punct = {"{":"}","(":")","[":"]"}
        stack = []
        
        for p in s:
            if p in punct.keys():
                stack.append(punct[p])
            else:
                if stack==[]:
                    return False
                if p==stack[-1]:
                    stack.pop(-1)
                else:
                    return False
            
        
        return stack==[]
                
                