/*
Given the root of a binary tree, invert the tree, and return its root.
*/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null || root.left==null && root.right==null)
            return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}