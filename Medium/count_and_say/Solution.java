class Solution {
    public String countAndSay(int n) {

        return helper(1,"1");
        
    }
    public String helper(int num,String res){
        if (num==n){
            return res;
        }
        else{
            int j=0;
            String result = "";
            while (j<len(res)){
                if (res[j]==len(res)-1){
                    count+=1;
                    result += String.valueOf(count) + res[j];
                    break;
                }
                else if (res[j]!=res[j+1]){
                    count+=1;
                    result += String.valueOf(count) + res[j];
                    count = 0;
                    j+=1;
                }
                else{
                    count+=1;
                    j+=1;
                }
            }

            return helper(i+1,result)
        }
    }

    
}