//Left Rotate Matrix K times
class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int n=mat.length;
        int col=mat[0].length;
        k=k%col;
        if(k<=0)return mat;
        int[][] ans = new int[n][col];
        for(int i=0;i<n;i++){
            for(int j=0;j<col;j++){
                ans[i][j] = mat[i][(j+k)%col];
            }
        }
        return ans;
    }
}
