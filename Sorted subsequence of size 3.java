class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n=arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=Integer.MAX_VALUE;
        right[n-1]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            left[i]=Math.min(arr[i-1],left[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i+1],right[i+1]);
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(left[i]<arr[i] && right[i]>arr[i]){
                ans.add(left[i]);
                ans.add(arr[i]);
                ans.add(right[i]);
                break;
            }
        }
        return ans;
    }
}
