class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int total = nums[i];
            if(total==k){
                count++;
            }

                for(int j=i+1;j<nums.length;j++){
                
                    total+= nums[j];
                    if(total==k){
                        count++;

                    }
                }
    

        }
        return count;
    }
}