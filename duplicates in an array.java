class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ar1.add(arr[i]);
        }
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            arr[ar1.get(i)]+=1;
        }
        ar1.clear();
        for(int i=0;i<n;i++){
            if(arr[i]>1)ar1.add(i);
        }
        if(ar1.size()==0)ar1.add(-1);
        return ar1;
    }
}
