class Solution {
    public boolean isPowerOfTwo(int n) {
        return check(n);
    }

    boolean check(int n){
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }
}