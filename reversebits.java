class Solution {
    static Long reversedBits(Long x) {
        // code here
        long ans=0;
        //int pos=0;
        for(int i=0;i<32;i++){
            long digit=x&1;
            x=x>>1;
            digit=digit<<(31-i);
            
            ans=ans|digit;
        }
        return ans;
    }
};
