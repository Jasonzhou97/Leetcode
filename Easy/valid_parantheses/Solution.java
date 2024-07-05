class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        ArrayList<Character> stack = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.keySet().contains(c)){
                if(stack.size()==0){
                    return false;
                }
                if(stack.get(stack.size()-1)!=map.get(c)){
                    return false;
                }
                stack.remove(stack.size()-1);
            }
            else{
                stack.add(c);
            }
        }
        return stack.size()==0;
    }
}