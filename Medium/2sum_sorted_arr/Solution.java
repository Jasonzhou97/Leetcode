class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        boolean found = false;
        for(int i=0;i<numbers.length;i++){
            int diff = target-numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]==diff){
                    res[0] = i+1;
                    res[1] = j+1;
                    found = true;
                    break;
                }
                if(numbers[j]>diff){
                    break;
                }
            }
            if(found){
                break;
            }
        }
        return res;
    }
}