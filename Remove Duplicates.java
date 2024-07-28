class Solution {
    String removeDups(String str) {
        // code here
        String s="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!s.contains(Character.toString(ch)))s+=ch;
        }
        return s;
    }
}
