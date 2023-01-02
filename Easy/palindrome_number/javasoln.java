class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int reversed=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int remainder = x%10;
            reversed = reversed*10 + remainder;
            x /= 10;
        }
        return reversed==y;
    }
}