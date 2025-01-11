class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int l=0,r=0;
        int maxlen=0;
        HashSet<Character> hs = new HashSet<>();
        for(r=0;r<s.length();r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
