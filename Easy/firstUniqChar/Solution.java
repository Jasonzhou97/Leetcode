import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        int index=0;
        ArrayList<Character> removed = new ArrayList<>();

        for(char c:s.toCharArray()){
            if(!removed.contains(c)){
                if(!map.keySet().contains(c)){
                    map.put(c, index);
                }
                else{
                    map.remove(c);
                    removed.add(c);
                }
            }

            index++;
        }
        if(map.isEmpty()){
            return -1;
        }
        int min = Integer.MAX_VALUE;

        for(char c:map.keySet()){
            int val = map.get(c);
            if(val<min){
                min = val;
            }
        }
        return min;
    }
}