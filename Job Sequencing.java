class Solution {
    // Function to find the maximum profit and the number of jobs done.
    ArrayList<Integer> JobScheduling(Job jobs[], int n) {
        // Your code here
        Arrays.sort(jobs,(a,b)-> b.profit - a.profit);
        int maxDeadline = -1 , cnt = 0,maxprofit=0;
        for(int i=0;i<jobs.length;i++){
            maxDeadline = Math.max(maxDeadline,jobs[i].deadline);
        }
        int[] arr = new int[maxDeadline+1];
        Arrays.fill(arr,-1);
        for(int i=0 ; i < jobs.length;i++){
            for(int j=jobs[i].deadline;j>0;j--){
                if(arr[j]==-1){
                    arr[j]=jobs[i].id;
                    cnt+=1;
                    maxprofit += jobs[i].profit;
                    break;
                }
            }
        }
        ArrayList<Integer> ans= new ArrayList();
        ans.add(cnt);
        ans.add(maxprofit);
        return ans;
    }
}
