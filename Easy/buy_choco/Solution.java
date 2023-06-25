class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num:prices){
            if(min1>num){
                min2 = min1;
                min1 = num;
            }
            else if(num<min2){
                min2 = num;
            }
        }
        if(money>=(min1+min2)){
            return money-min1-min2;
        }
        return money;
    }
}