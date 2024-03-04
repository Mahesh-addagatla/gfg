class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(hs.containsKey(k-num)){
                count+=hs.get(k-num);
            }
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        return count;
    }
}
