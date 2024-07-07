class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null)return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
}
