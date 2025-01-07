class Solution {
    public static void func(int ind,int sum,int[] arr,int n,ArrayList<Integer> subset){
        if(ind == n){
            subset.add(sum);
            return;
        }
        func(ind+1,sum+arr[ind],arr,n,subset);
        func(ind+1,sum,arr,n,subset);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> subset = new ArrayList<>();
        func(0,0,arr,arr.length,subset);
        return subset;
    }
}
