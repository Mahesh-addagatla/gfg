class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
         if(k>arr.size()){
            Collections.reverse(arr);
            return ;
        }
        else{
            
            int loop = arr.size()/k;
            int start = 0;
            int end = k;
            while(loop!=0){
                Collections.reverse(arr.subList(start,end));
                start = end;
                end = end + k;
                loop--;
            }
            Collections.reverse(arr.subList(end-k,arr.size()));
    }
    }
}
