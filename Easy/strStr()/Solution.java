public class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int p1 = i;
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(p1 + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
