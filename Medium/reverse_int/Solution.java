public class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String res = "";
        Boolean leading = true;
        if(s.charAt(0)=='-'){
            res+='-';
            int left = 1;
            int right = s.length()-1;
            while(right>left){
                if(leading && s.charAt(left)=='0'){
                    left++;
                    continue;
                }
                if(s.charAt(left)!='0'){
                    leading = false;
                }
                res+=s.charAt(right);
                right--;

            }
            res+=s.substring(left,right);

    }
    else{
        int left = 0;
            int right = s.length()-1;
            while(right>left){
                if(leading && s.charAt(left)=='0'){
                    left++;
                    continue;
                }
                if(s.charAt(left)!='0'){
                    leading = false;
                }
                res+=s.charAt(right);
                right--;

            }
            res+=s.substring(left,right);
    }
    return Integer.valueOf(res);

}

}