class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n+1];
        for(int i=0;i<ans.length;i++){
            String binary = Integer.toBinaryString(i);
            ans[i] = ones(binary);
        }
        return ans;
    }

    int ones(String num){
        int count=0;
        for(char c:num.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}