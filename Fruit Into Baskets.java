class Solution {
    public static int totalFruits(Integer[] arr) {
        int r=0,l=0;
        int n=arr.length;
        int len=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(r=0;r<n;r++){
            hs.put(arr[r],hs.getOrDefault(arr[r],0)+1);
            if(hs.size()>2){
                hs.put(arr[l],hs.get(arr[l])-1);
                if(hs.get(arr[l])==0){
                    hs.remove(arr[l]);
                }
                l++;
            }
            if(hs.size()<=2)len=Math.max(len,r-l+1);
        }
        return len;
    }
}
