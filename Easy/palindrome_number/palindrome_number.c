bool isPalindrome(int x){
    long remainder,result;
    if (x<0){
        return false;
    }
    int num = x;
    result = 0;
    while (x>0){
        remainder = x%10;
        result = result *10 + remainder;
            x /= 10;
    }
    return num==result;
}