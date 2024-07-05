class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        ArrayList<Character> stack = new ArrayList<>();
        for (int i=0;i<s.length;i++){
            char c = s.charAt(i);

        }
    }
}