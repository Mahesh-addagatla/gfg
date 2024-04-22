

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> as=new ArrayList<>();
        int sum=0;
        int j=0;
        int i=0;
        while(i<n){
            sum+=arr[i];
            while(sum>s && j<=i){
                sum-=arr[j];
                j++;
            }
            if(sum==s && j<=i){
                as.add(j+1);
                as.add(i+1);
                //else as.add(i);
                return as;
            }
            i++;
        }
        as.add(-1);
        return as;
    }
}
