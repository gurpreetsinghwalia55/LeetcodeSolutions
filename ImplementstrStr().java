class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
        if(haystack.length() < needle.length()) return -1;
        if(haystack.equals(needle)) return 0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+(needle.length()) <= haystack.length()) {
                    String match = haystack.substring(i, i + (needle.length()));
                    if(match.equals(needle)){
                        return i;
                    }
                }else{
                    return -1;
                }
            }
        }
        return -1;
    }
}
