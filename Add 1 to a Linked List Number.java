//
////dhwcsnakjnckjh
class Solution
{
    public static Node reverse(Node head){
        Node cur=head;
        Node pre=null;
        while(cur!=null){
            Node nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        return pre;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        Node temp = head;
        while(temp!=null){
            if(temp.next==null && temp.data == 9){
                temp.data = 0;
                Node extra = new Node(1);
                temp.next = extra;
                temp = temp.next;
                break;
            }else if(temp.data == 9){
                temp.data = 0;
                temp = temp.next;
            }else{
                temp.data = temp.data + 1;
                temp = temp.next;
                break;
            }
        }
        
        head = reverse(head);
        return head;
    }
}
