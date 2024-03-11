class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        
        int r1=0, c1=0,r2=n-1,c2=n-1,cnt=0;
        
        while(r1<n && r2>=0){
            int sum = mat1[r1][c1]+mat2[r2][c2];
            if(sum<=x)
            {
                if(sum==x) cnt++;
                if(c1<n-1)c1++; 
                else{
                    c1=0; 
                    r1++;
                }
            }
            else
            {
              if(c2>0)c2--;
                else{
                    c2=n-1; 
                    r2--;
                }  
            }
        }
        
        return cnt;
    }
}
