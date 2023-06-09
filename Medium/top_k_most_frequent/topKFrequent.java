import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

                for(int num:nums){
                    if(map.containsKey(num)){
                        int count = map.get(num);
                        count++;
                        map.put(num, count);
                    }
                    else{
                        map.put(num, 1);
                    }
                }
                //create a list of map entries
                List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());

                //sort list based on values on descending order
                Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                        return entry2.getValue().compareTo(entry1.getValue());
                    }
                });

                int[] result = new int[k];

                for(int i=0;i<k;i++){
                    result[i] = entries.get(i).getKey();
                }   
                for(int num:result){
                    System.out.println(num);
                }
                return result;
            
        
    }   
}