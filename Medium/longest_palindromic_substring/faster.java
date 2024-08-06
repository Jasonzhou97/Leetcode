class Solution {
    public String longestPalindrome(String s) {
        int max = -1;
        int end = 0;
        int start = 0;
        for(int i=0;i<s.length();i++){
            int l1 = movePointer(s,i,i); //odd length words
            int l2 = movePointer(s,i,i+1); //even length words
            int l = Math.max(l1,l2);
            if (l>max){
                max = l;
                start = i- (l-1)/2;
                end = i + l/2;
            }
        }
        return s.substring(start,end+1);
        
    }

    int movePointer(String s,int left,int right){
        if(s==null || left>right){
            return 0;
        }
        int length = 0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;

    }
}