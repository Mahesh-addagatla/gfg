class Solution
{
    private boolean isLeaf(Node node){
        if(node.left==null && node.right==null)return true;
        return false;
    }
    private void addLeft(ArrayList<Integer> ans,Node root){
        Node cur = root.left;
        while(cur!=null){
            if(isLeaf(cur)==false)ans.add(cur.data);
            if(cur.left!=null)cur=cur.left;
            else cur=cur.right;
        }
    }
    private void addRight(ArrayList<Integer> ans,Node root){
        Node cur = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(cur!=null){
            if(isLeaf(cur)==false)temp.add(cur.data);
            if(cur.right!=null)cur=cur.right;
            else cur=cur.left;
        }
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    private void addLeaves(ArrayList<Integer> ans, Node node) {
        if (node == null) return; // Base case
        if (isLeaf(node)) {
            ans.add(node.data); // Add leaf node
            return;
        }
        addLeaves(ans, node.left); // Recur for left subtree
        addLeaves(ans, node.right); // Recur for right subtree
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(isLeaf(node)==false)ans.add(node.data);
	    addLeft(ans,node);
	    addLeaves(ans,node);
	    addRight(ans,node);
	    return ans;
	}
}
