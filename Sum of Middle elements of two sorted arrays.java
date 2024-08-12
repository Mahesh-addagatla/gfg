class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int i=0,j=0,c=0,n=arr1.length;
        int prev1=0,prev2=0;
        while(i<n && j<n){
            if(arr1[i]<=arr2[j]){
                prev2=prev1;
                prev1=arr1[i];
                i++;
            }
            else{
                prev2=prev1;
                prev1=arr2[j];
                j++;
            }
            c++;
            if(c>n)return prev1+prev2;
        }
        return prev1+prev2;
    }
}
