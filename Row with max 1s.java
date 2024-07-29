class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxc=0;
        int row=-1;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1)c++;
                else c=0;
            }
            if(c>maxc){
                row=i;
                maxc=c;
            }
        }
        return row;
    }
}
