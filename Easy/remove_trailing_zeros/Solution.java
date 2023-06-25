class Solution {
    public String removeTrailingZeros(String num) {
        char[] arr = num.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                arr[i] = '*';
            }
            else{
                break;
            }
        }
        String n = "";
        for(char c:arr){
            if(c=='*'){
                break;
            }
            n+=c;
        }
        return n;
    }
}