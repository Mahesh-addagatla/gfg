class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head==null)return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            map.put(temp.data,map.getOrDefault(temp.data,0)+1);
            temp=temp.next;
        }
        Node an=new Node(-1);
        Node temp2=an;
        while(head!=null){
            if(map.get(head.data)==1){
                temp2.next=new Node(head.data);
                temp2=temp2.next;
            }
            head=head.next;
        }
        return an.next;
    }
}
