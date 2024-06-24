class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        
        if(q<2 || q>2*n)return 0;
        long ans=n-Math.abs(n-q+1);
        return ans;
    }
}
