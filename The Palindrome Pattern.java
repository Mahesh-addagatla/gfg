class Solution {
    public String pattern(int[][] arr) {
        // Code here
        int n=arr.length;
        String ans="-1";
        
        for(int i=0;i<n;i++){
            int k=n-1, j=0;
            while(j<k){
                if(arr[i][j]!=arr[i][k]){
                    break;
                }
                j++;k--;
            }
            if(j>=k){
                ans=i+" R";
                return ans;
                // break;
            }
        }
        for(int i=0;i<n;i++){
            int k=n-1, j=0;
            while(j<k){
                if(arr[j][i]!=arr[k][i]){
                    break;
                }
                j++;k--;
            }
            if(j>=k){
                ans=i+" C";
                return ans;
                // break;
            }
        }
        return ans;
    }
}
