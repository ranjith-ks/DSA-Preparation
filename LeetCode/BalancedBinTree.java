/*
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
    A binary tree in which the left and right subtrees of every node differ in height by no more than 1.
*/

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
    private int height(TreeNode root) {
        if(root==null)
            return 0;
        int left = height(root.left);
        if(left==-1)
            return -1;
        int right = height(root.right);
        if(right==-1)
            return -1;
        if(left-right<-1 || left-right>1)
            return -1;
        return Math.max(left,right)+1;
    }
}