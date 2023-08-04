class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int index = 0;
        int end = nums.length-1;

        while(index<=end&&start<end){
            if(nums[index]==0){
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            }
            else if(nums[index]==2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            else{
                index++;
            }
        }
    }
}