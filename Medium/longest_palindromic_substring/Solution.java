class Solution {
    public String longestPalindrome(String s) {
        int maxSize = 0;
        String res = "";
        for(int i=0;i<s.length;i++){
             for(int j=1;j<s.length;j++){
                String word = s.subString(i,j);
                if(check(word)){
                    if word.length>maxSize{
                        res = word;
                        maxSize = res.length;
                    }
                }
             }
        }
        return res;
    }

    Boolean check(String s){
        String word = "";
        for (int i=s.length-1;i>=0;i--){
            char c = s.charAt(i);
            word+=c;
        }
        return s.equals(word);
    }
}