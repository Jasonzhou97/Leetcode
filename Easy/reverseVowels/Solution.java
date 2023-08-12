import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        ArrayList<Character> arr = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(vowels.contains(c)){
                arr.add(c);
            }
        }
        String word = "";
        int j=arr.size()-1;
        for(char c:s.toCharArray()){
            if(!vowels.contains(c)){
                word+=c;
            }
            else{
                word+=arr.get(j);
                j--;
            }
        }
        return word;
    }
}