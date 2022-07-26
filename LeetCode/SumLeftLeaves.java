/*
Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
*/

class Solution {
    private int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        sumOfLeftLeaves(root.left,true);
        sumOfLeftLeaves(root.right,false);
        return sum;
    }
    private void sumOfLeftLeaves(TreeNode root,boolean isLeft) {
        if(root==null)
            return;
        if(root.left==null && root.right==null && isLeft)
            sum += root.val;
        sumOfLeftLeaves(root.left,true);
        sumOfLeftLeaves(root.right,false);
    }
}