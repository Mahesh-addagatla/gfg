class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max=0;
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ArrayList<Integer> ar2=new ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>=max){
                    ar.add(arr[i]);
                    max=arr[i];
                }
        }
        for(int i=ar.size()-1;i>=0;i--){
            ar2.add(ar.get(i));
        }
        return ar2;
    }
}
