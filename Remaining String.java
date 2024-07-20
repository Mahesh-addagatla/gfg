class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int n=s.length();
        int co=0;
        String str="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==ch){
                co++;
            }
            if(co==count){
                str+=s.substring(i+1,n);
                break;
            }
        }
        return str;
    }
}
