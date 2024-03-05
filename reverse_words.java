class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[] s = S.split("[.]");
        String rev="";
        for(int i=s.length-1;i>=0;i--){
            if(i==0){
                rev+=s[i];
            }
            else rev+=s[i]+".";
        }
        return rev;
    }
}
