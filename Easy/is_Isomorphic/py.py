class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map1,map2 = {},{}
        
        for i in range(len(s)):
            s1 = s[i]
            t1 = t[i]
            if ((s1 in map1 and map1[s1]!=t1) or (t1 in map2 and map2[t1]!=s1 )):
                return False
            
            map1[s1]=t1
            map2[t1]=s1
        
        return True