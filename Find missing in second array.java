
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<m;i++){
            hs.add(b[i]);
        }
        for(int i=0;i<n;i++){
            if(!hs.contains(a[i]))ans.add(a[i]);
        }
        return ans;
    }
}
