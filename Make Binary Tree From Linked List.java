class Solution {
    public Tree convert(Node head, Tree node) {
        ArrayList<Tree> list=new ArrayList<>();
        while(head!=null){
            list.add(new Tree(head.data));
            head=head.next;
        }
        int n=list.size();
        if(n==0)return node;
        for(int i=1;i<n;i+=2){
            list.get(i/2).left=list.get(i);
            if(i+1<n){
                list.get(i/2).right=list.get(i+1);
            }
        }
        node=list.get(0);
        return node;
    }
}
