class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
        int lt=l,rt=m+1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(lt<=m && rt<=r){
            if(arr[lt]<=arr[rt]){
                ans.add(arr[lt]);
                lt++;
            }
            else{
                ans.add(arr[rt]);
                rt++;
            }
        }
        while(lt<=m){
            ans.add(arr[lt]);
            lt++;
        }
        while(rt<=r){
            ans.add(arr[rt]);
            rt++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=ans.get(i-l);
        }
        //return;
        
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l==r)return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
