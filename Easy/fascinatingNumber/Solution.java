import java.util.ArrayList;

class Solution {
    public boolean isFascinating(int n) {
        int n2 = n*2;
        int n3 = n*3;

        String res = Integer.toString(n)+Integer.toString(n2)+Integer.toString(n3);

        ArrayList<Character> arr = new ArrayList<>();

        for(char c:res.toCharArray()){
            if(c=='0'){
                continue;
            }
            if(!arr.contains(c)){
                arr.add(c);
            }
            else{
                return false;
            }
        }
        return arr.size()==9;
        
    }
}