import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                int v = map.get(c);
                map.put(c, v+1);
            }
            else{
                map.put(c, 1);
            }
        }

        char first = s.toCharArray()[0];
        int v = map.get(first);
        
        for(char c:map.keySet()){
            if(map.get(c)!=v){
                return false;
            }
        }
        return true;
        
    }
}