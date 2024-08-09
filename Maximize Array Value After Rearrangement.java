class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long store=0;
       long mod=1000000007;
        for(int i=0;i<arr.length;i++)
        {
           store=(store+(long)arr[i]*i) %mod;
        }
        return (int)store;
    }
}
