class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int c=0;
        int ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                c++;
                if(c>ans){
                    ans=c;
                }
            }else c=0;
        }
        return ans;
    }
}
