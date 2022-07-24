/*
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
*/

class Solution {
    private int MAX;
    public int diameterOfBinaryTree(TreeNode root) {
        MAX = 0;
        height(root);
        return MAX;
    }
    private int height(TreeNode root) {
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        MAX = Math.max(MAX,left+right);
        return Math.max(left,right)+1;
    }
}