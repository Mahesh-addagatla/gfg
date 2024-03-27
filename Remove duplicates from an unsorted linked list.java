class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         Node temp=head;
         Node slow=head;
         HashSet<Integer> set=new HashSet<>();
         while(temp!=null){
             if(set.contains(temp.data)){
                 slow.next=temp.next;
                 temp=slow.next;
                 
             }
             else{
                 slow=temp;
                 set.add(temp.data);
                 temp=temp.next;
             }
         }
         return head;
    }
}
