def isPalindrome(x):
    if x<0:
        return False
    
    result = 0
    #will be doing operations on num and keep original copy value the same
    num = x

    while num>0:
        remainder = num%10
        result = result*10 + remainder
        num = num//10
    
    return x==result
    
