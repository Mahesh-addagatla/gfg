class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int sum=0;
        int n = arr.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(sum,1);
        int c=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hs.containsKey(sum-k)){
                c += hs.get(sum-k);
            }
            hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
