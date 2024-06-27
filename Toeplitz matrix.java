class Solution {
    /*You are required to complete this method*/
    boolean isToeplitz(int mat[][]) {
        // Your code here
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j-1>=0 && i-1>=0){
                    if(mat[i-1][j-1]!=mat[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
