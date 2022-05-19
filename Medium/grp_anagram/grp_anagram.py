class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        Map = {}
        
        for s in strs:
            #returns sorted version so anagrams will be returned the same
            hashed = self.sortStr(s)
            if hashed not in Map:
                Map[hashed] = []
            Map[hashed].append(s)
        for value in Map.values():
            result.append(value)
            
        return result
    
    #helper function to sort string
    def sortStr(self,string):
        return ''.join(sorted(string))