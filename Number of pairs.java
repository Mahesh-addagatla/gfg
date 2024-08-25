class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
        Arrays.sort(y);
        int freq[] = new int[5];
        for(int i:y){
            if(i<=4)    freq[i]++;
        }
        
        long ans=0;
        for(int i:x){
            long temp = count(i,y,N,freq);
            // System.out.println(temp);
            ans += temp;
        }
        
        return ans;
    }
    long count(int x,int a[],int n,int freq[]){
        if(x==0)    return 0;
        if(x==1)    return freq[0];
        
        //count greater values (lower_bound)
        int l=0, r=n;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[mid]<=x)    l=mid+1;
            else    r=mid;
        }
        
        long ans = n-l;
        
        if(x==2)    return ans+freq[0]+freq[1]-freq[3]-freq[4];
        if(x==3)    return ans+freq[0]+freq[1]+freq[2];
        return ans+freq[0]+freq[1];
    }
}
