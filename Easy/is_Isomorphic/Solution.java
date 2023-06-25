import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        String res = "";
        for(char sc:s.toCharArray()){
            if(map.keySet().contains(sc)){
                res+=map.get(sc);
            }
            else{
                char tc = t.toCharArray()[count];
                map.put(sc, tc);
                if(set.contains(tc)){
                    return false;
                }
                set.add(tc);
                res+=tc;

            }
            count++;
        }
        return res.equals(t);
    }
}