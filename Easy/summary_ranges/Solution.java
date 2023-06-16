import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> arr = new ArrayList<>();
        if(nums.length==0){
            return arr;
        }
        if(nums.length==1){
            arr.add(Integer.toString(nums[0]));
            return arr;
        }
        int prev = nums[0];
        int first = nums[0];
        int count = 0;
        for(int i=1;i<nums.length;i++){
            int cur = nums[i];
            if(i==nums.length-1){
                if(cur-prev==1){
                    arr.add(first+"->"+cur);
                }
                else{
                    if(count==0){
                        arr.add(Integer.toString(prev));

                    }
                    else{
                        arr.add(first+"->"+prev);
                    }
                    arr.add(Integer.toString(cur));
                }

            }
            else{
                if(cur-prev==1){
                    count++;
                    prev = cur;
                }
                else{
                    if(count==0){
                        arr.add(Integer.toString(prev));
                    }
                    else{
                        arr.add(first+"->"+prev);
                        
                    }
                    count = 0;
                    prev = cur;
                    first = cur;
                }
            }

        }
        return arr;
    }
}