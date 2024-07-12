class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
        int sum=0;
        return helper(root,sum,target);
        }
    boolean helper(Node root,int sum,int target){
        if(root==null)return false;
        sum+=root.data;
        if(root.right==root.left && sum==target)return true;
        
        return helper(root.left,sum,target)|| helper(root.right,sum,target);
    }
}
