class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = Math.min(word1.length(), word2.length());

        String word = "";
        for(int i=0;i<l;i++){
            word+=word1.charAt(i);
            word+=word2.charAt(i);
        }
        if(l<word1.length()){
            int n = word.length() / 2;
            word+=word1.substring(n,word1.length());
        }
        else if(l<word2.length()){
            int n = word.length() / 2;
            word+=word2.substring(n,word2.length());
        }
        return word;  
    }
}