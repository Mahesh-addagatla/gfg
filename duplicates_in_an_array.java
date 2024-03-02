class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ArrayList<Integer> ar2=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(!ar1.contains(arr[i]))ar1.add(arr[i]);
            else {
                if(!ar2.contains(arr[i]))
                    ar2.add(arr[i]);
        }}
        Collections.sort(ar2);
        if(ar2.size()>0){
            return ar2;
        } 
        else{
           ar2.add(-1);
           return ar2;
        } 
    }
}
