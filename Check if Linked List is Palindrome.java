//ahsbckujahcl,jblajsbhxlj
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null || head.next==null) return true;
        Node temp=head;
        int num=0;
        while(temp!=null){
            num=num*10+temp.data;
            temp=temp.next;
        }
        Node cur=head;
        Node pre=null;
        while(cur!=null){
            Node nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        Node temp2=pre;
        int num2=0;
        while(temp2!=null){
            num2=num2*10+temp2.data;
            temp2=temp2.next;
        }
        return num==num2;
    }    
}
