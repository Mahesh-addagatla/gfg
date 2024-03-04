class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<N;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        for (int i=0;i<N;i++){
            if(hs.containsKey(i+1)){
                arr[i]=hs.get(i+1);
            }
            else{
                arr[i]=0;
            }
        }
    }
}
