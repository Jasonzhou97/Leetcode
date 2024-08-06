class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def helper(i,total,cur):
                if total==target:
                     res.append(cur.copy())
                     return 
                if i>=len(candidates) or total>target:
                     return 
                first = candidates[i]
                #first case to include first number
                cur.append(first)
                helper(i,total+first,cur)
                cur.pop()
                #second case to excude first number
                helper(i+1,total,cur)

                
        helper(0,0,[])
        return res
            
