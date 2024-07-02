class Solution {
    public boolean compute(Node root) {
        String s="";
        while(root!=null){
            s+=root.data;
            root=root.next;
        }
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
