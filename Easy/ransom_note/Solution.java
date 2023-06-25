import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> rMap = new HashMap<>();
            HashMap<Character,Integer> mMap = new HashMap<>();

            for(char c:ransomNote.toCharArray()){
                if(rMap.containsKey(c)){
                    int v = rMap.get(c);
                    rMap.put(c, v+1);
                }
                else{
                    rMap.put(c, 1);
                }
            }
            for(char c:magazine.toCharArray()){
                if(mMap.containsKey(c)){
                    int v = mMap.get(c);
                    mMap.put(c, v+1);
                }
                else{
                    mMap.put(c, 1);
                }
            }
            for(char c:rMap.keySet()){
                int v = rMap.get(c);
                int v2 = 0;
                if(mMap.containsKey(c)){
                    v2 = mMap.get(c);
                }
                else{
                    return false;
                }
                if(v>v2){
                    return false;
                }
            }
            return true;
    }
}