import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        int max = 1;
        int prev = nums[0];
        int cur;
        int len = 1;

        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            else{
                set.add(nums[i]);
            }
            cur = nums[i];
            int diff = cur-prev;
            if(diff==1){
                len++;
                prev = cur;
                if(len>max){
                    max=len;
                }
            }
            else{
                prev = cur;
                len = 1;
            }
        }
        return max;
    }
}