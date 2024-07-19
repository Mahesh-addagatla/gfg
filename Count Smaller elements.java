class Solution {
    int[] constructLowerArray(int[] arr) {
        // code here
        int n=arr.length;
        int[] ans=new int[n];
        ans[n-1]=0;
        for(int i=0;i<n-1;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}
