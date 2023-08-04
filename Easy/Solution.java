class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            int[] duplicateArray = Arrays.copyOf(candies, candies.length);
            duplicateArray[i] = duplicateArray[i]+extraCandies;
            int max = compare(duplicateArray);
            ans.add(duplicateArray[i]==max ? true:false);
        }
        return ans;
    }

    int compare(int[] arr){
        int max = 0;
        for(int candy:arr){
            if(candy>max){
                max = candy;
            }
        }
        return max;
    }
}