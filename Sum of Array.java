

// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int actsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];
        }
        return actsum-sum;
    }
}
