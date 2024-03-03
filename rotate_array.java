class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<d;i++){
            st.push(arr[i]);
        }
        int[] arr2=new int[n];
        for(int i=d;i<n;i++){
            arr2[i-d]=arr[i];
        }
        for(int i=n-1;i>=n-d;i--){
            arr2[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            arr[i]=arr2[i];
        }
    }
}
