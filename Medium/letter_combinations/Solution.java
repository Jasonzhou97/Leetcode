import java.util.LinkedList;

class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keyMap = new String[] {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> arr = new LinkedList<>();

        if(digits.length()==0){
            return arr;
        }
        arr.add("");

        for(int i=0;i<digits.length();i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(arr.peek().length()==i){
                String model = arr.remove();
                for(char c:keyMap[index-2].toCharArray()){
                    arr.add(model+c);
                }
            }
        }
        return arr;
    }
}