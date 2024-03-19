class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node first=head;
        Node second=head.next;
        Node copy=head.next;
        Node temp=head;
        while(first.next!=null && second.next!=null){
            first.next=first.next.next;
            first=first.next;
            if(second.next.next!=null){
                second.next=second.next.next;
                second=second.next;
            }
        }
        first.next=null;
        second.next=null;
        
        Node h=reverse(copy);
        first.next=h;
        return temp;
   }
    static Node reverse(Node head){
        Node nex=null,pre=null;
        while(head!=null){
            nex=head.next;
            head.next=pre;
            pre=head;
            head=nex;
        }
        return pre;
    }

}
