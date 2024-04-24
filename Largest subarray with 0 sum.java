
class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int ans=0;
        int sum=0,j=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)ans=Math.max(ans,i+1);
            int rem=sum;
            if(hs.containsKey(rem)){
				ans=Math.max(ans,i-hs.get(rem));
			}
			if(!hs.containsKey(sum))hs.put(sum,i);
        }
        return ans;
    }
}
