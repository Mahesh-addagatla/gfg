class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int m=arr1.size();
        int n=arr2.size();
        int ans=0;
        int s1=0,s2=0;
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1.get(i)<arr2.get(j)){
                s1+=arr1.get(i++);
            }
            else if(arr1.get(i)>arr2.get(j)){
                s2+=arr2.get(j++);
            }
            else{
                ans+=Math.max(s1,s2)+arr2.get(j);
                s1=0;
                s2=0;
                i++;
                j++;
            }
        }
        while(i<m){
            s1+=arr1.get(i++);
        }
        while(j<m){
            s2+=arr2.get(j++);
        }
        ans+=Math.max(s1,s2);
        return ans;
    }
}
