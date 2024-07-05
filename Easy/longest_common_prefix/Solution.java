class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortest = findShortest(strs);
        String pre = "";
        Boolean end = false;
        for (int i=0;i<shortest;i++){
            char c = strs[0].charAt(i);
            for(String word:strs){
                if(word.charAt(i)!=c){
                    end = true;
                    break;
                }
                
                
            }
            if(end){
                break;
            }
            pre+=c;
        }
        return pre;
    }

    public int findShortest(String[] str){
        int shortest = 999;
        for(String word:str){
            if(word.length()<shortest){
                shortest = word.length();
            }
        }
        return shortest;
    }
}