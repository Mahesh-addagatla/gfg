class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
