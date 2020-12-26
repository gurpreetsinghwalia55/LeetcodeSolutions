class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int start = 0;
        int end = 0;
        int result = 0;
        int[] hash = new int[256];
        for(int i=0;i<s.length();i++){
                if(hash[s.charAt(i)] > 0){
                    // either the start is greater or the value in the hash, hash can contain previous values. values before the current start. that's why checking for the max.
                    start = Math.max(hash[s.charAt(i)], start);
                }
            hash[s.charAt(i)] = i+1;
            end = i;
            result = Math.max(result, (end-start)+1);
        }
        return result;
    }
}
