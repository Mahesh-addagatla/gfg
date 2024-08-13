class Solution {
  public:
    int nthFibonacci(int n){
        // code here
         int a=0,b=1,c,i;
        for(i=1;i<n;i++)
        {
            c=(a+b)%1000000007;
            a=b;
            b=c;
            
        }
        return c;
    }
};
