class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for x in s:
            if stack:
                if self.isEqual(stack[-1],x):
                    stack.pop()
                    continue
            stack.append(x)
        return stack==[]
    
    def isEqual(self,c1,c2):
        if c1=="(" and c2==")":
            return True
        if c1=="[" and c2=="]":
            return True
        if c1=="{" and c2=="}":
            return True