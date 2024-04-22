class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int row=0;
        int c=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1)count++;
            }
            if(c>count){
                c=count;
                row=i+1;
            }
        }
        return row;
    }
};
