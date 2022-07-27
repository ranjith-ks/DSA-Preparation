/*
Given the root of a binary tree, return the sum of every tree node's tilt.
The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values. If a node does not have a left child, then the sum of the left subtree node values is treated as 0. The rule is similar if the node does not have a right child.
*/

class Solution {
    private int res;
    public int findTilt(TreeNode root) {
        res = 0;
        post(root);
        return res;
    }
    private int post(TreeNode root) {
        if(root==null)
            return 0;
        int left = post(root.left);
        int right = post(root.right);
        res += Math.abs(right-left);
        return left+right+root.val;
    }
}