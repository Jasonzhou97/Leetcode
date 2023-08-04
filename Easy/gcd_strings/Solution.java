class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String longer = str1.length()>str2.length() ? str1:str2;
        String shorter = str1.length()>str2.length() ? str2:str1;
        
        if(longer.equals(shorter)){
            return shorter;
        }
        if(!longer.startsWith(shorter)){
            return "";
        }
        return gcdOfStrings(longer.substring(shorter.length()), shorter);
    }
}