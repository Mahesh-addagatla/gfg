class Solution {
    public int findCoverage(int[][] matrix) {
        // code here
        int ans=0;
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    if(i-1>=0 && matrix[i-1][j]==1)ans++;
                    if(j-1>=0 && matrix[i][j-1]==1)ans++;
                    if(i+1<r && matrix[i+1][j]==1)ans++;
                    if(j+1<c && matrix[i][j+1]==1)ans++;
                }
            }
        }
        return ans;
    }
}
