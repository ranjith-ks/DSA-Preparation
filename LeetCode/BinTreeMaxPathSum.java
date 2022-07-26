/*
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
The path sum of a path is the sum of the node's values in the path.
Given the root of a binary tree, return the maximum path sum of any non-empty path.
*/

class Solution {
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        findMaxSum(root);
        return maxSum;
    }
    private int findMaxSum(TreeNode root) {
        if(root==null)
            return 0;
        int left = Math.max(0,findMaxSum(root.left));
        int right = Math.max(0,findMaxSum(root.right));
        maxSum = Math.max(maxSum,root.val+left+right);
        return Math.max(left,right)+root.val;
    }
}