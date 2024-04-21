class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here
        int n=array.length;
        int low=0;
        int high=n-1;
        for(int i=0;i<=high;){
            if(array[i]<a){
                swap(array,i,low);
                i++;
                low++;
            }
            else if(array[i]>b){
                swap(array,i,high);
                high--;
            }
            else{
                i++;
            }
        }
    }
    private void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
