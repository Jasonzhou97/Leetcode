class Solution:
    def countAndSay(self, n: int) -> str:
        
        def helper(i,res):
            if i==n:
                return res
            else:
                j=0
                result = ""
                count = 0
                while j<len(res):
                    if j==len(res)-1:
                        count+=1
                        result+=str(count)+res[j]
                        break
                    elif res[j]!=res[j+1]:
                        count+=1
                        result+=str(count)+res[j]
                        j+=1
                        count = 0
                    else:
                        count+=1
                        j+=1
            return helper(i+1,result)

        return helper(1,"1")