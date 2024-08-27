class Solution{
    static int evenlyDivides(int N){
        // code here jvyfkuyfvkhtkytckyfkytfvkyt
        int c=0;
        int temp=N;
        while(temp>0){
            int r=temp%10;
            if(r!=0){
                if(N%r==0)c++;
            }
            temp/=10;
        }
        return c;
    }
}
