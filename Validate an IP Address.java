class Solution {

    public boolean isValid(String str) {
        int temp=-1, count=0, index=-1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '.'){
                // checking for the . (dot)
                count++;
                if(temp<0 || temp>255) return false;
                if(temp != 0 && str.charAt(index+1) == '0') return false;
                temp = -1;
                index = i;
            }
            else{
                
                // storing the characters in the form of int
                if(temp == -1) temp = 0;
                temp = temp*10+(str.charAt(i)-'0');
            }
        }
        
        // Checking done for the last number 234.4.5.89 i.e; for 89
        if(temp<0 || temp>255 || count != 3) return false;
        if(temp != 0 && str.charAt(index+1) == '0') return false;
        return true;
    }
}

