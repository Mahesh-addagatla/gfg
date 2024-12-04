class Data{
    int start;
    int end;
    public Data(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int meet=1;
        ArrayList<Data> arr=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            arr.add(new Data(start[i],end[i]));
        }
        Collections.sort(arr,(a,b)-> Integer.compare(a.end,b.end));
        // int meet=1;
        int last=arr.get(0).end;
        for(int i=1;i<arr.size();i++){
            if(last<arr.get(i).start){
                meet++;
                last=arr.get(i).end;
            }
        }
        return meet;
    }
}
