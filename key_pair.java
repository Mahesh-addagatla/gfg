class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(hs.containsKey(x-num)){
                count+=hs.get(x-num);
            }
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        if(count>0) return true;
        else return false;
    }
}
