/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.
*/

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum,0);
    }
    private boolean dfs(TreeNode root,int target,int sum)
    {
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return target==sum+root.val;
        return dfs(root.left,target,sum+root.val) || dfs(root.right,target,sum+root.val);
    }
}