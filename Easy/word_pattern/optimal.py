class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #map1 for words to pattern,map2 for pattern to words
        map1,map2 = {},{}
        
        words = s.split(" ")
        
        if len(pattern)!=len(words):
            return False
        
        for i in range(len(pattern)):
            if (words[i] in map1 and map1[words[i]]!=pattern[i]) or (pattern[i] in map2 and map2[pattern[i]]!=words[i]):
                return False
            else:
                map1[words[i]] = pattern[i]
                map2[pattern[i]] = words[i]
        
        return True