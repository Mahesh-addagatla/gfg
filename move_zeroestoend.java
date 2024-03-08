class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int[] temp=new int[n-count];
        int k=0;
        for(int i=0;i<(n);i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
        for(int i=temp.length;i<n;i++){
            arr[i]=0;
        }
    }
}
