import java.util.ArrayList;

class Solution {
    public boolean isSubsequence(String s, String t) {
        ArrayList<Character> arr = copy(t);
        int i=0;
        if(s.equals("")){
            return true;
        }
        for(char c:t.toCharArray()){
            if(i>=s.length()){
                break;
            }
            char sc = s.charAt(i);
            char tc = c;
            if(sc!=tc){
                arr.remove(Character.valueOf(tc));
            }
            else{
                i++;
            }
        }
        return verify(s, arr);


    }
    ArrayList<Character> copy (String word){
        ArrayList<Character> arr = new ArrayList<>();
        for(char c:word.toCharArray()){
            arr.add(c);
        }
        return arr;
    }
    
    boolean verify(String word,ArrayList<Character> arr){
        if(arr.size()>word.length()){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)!=arr.get(i)){
                    return false;
                }
            }
        }
        else if (word.length()>arr.size()){
            return false;
        }
        else{
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)!=arr.get(i)){
                    return false;
                }
            }
        }
    return true;
    }
}