class Solution {
    public int minLength(String s) {
        while(verify(s)){
            s = edit(s);
        }
        return s.length();
    }

    boolean verify(String str){
        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)=='A'&&str.charAt(i+1)=='B')||str.charAt(i)=='C'&&str.charAt(i+1)=='D'){
                return true;
            }
        }
        return false;
    }

    String edit(String str){
        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)=='A'&&str.charAt(i+1)=='B')||str.charAt(i)=='C'&&str.charAt(i+1)=='D'){
                String edited = str.substring(0, i)+ str.substring(i+2, str.length());
                return edited;
            }
        }
        return str;
    }
    
}