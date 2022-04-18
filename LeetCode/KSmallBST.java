/*
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
*/

class Solution {
    private int result,count;
    public int kthSmallest(TreeNode root, int k) {
        count = 1;
        inorder(root,k);
        return result;
    }
    private boolean inorder(TreeNode root,int k){
        if(root==null)
            return false;
        if(inorder(root.left,k))
            return true;
        if(count==k){
            result = root.val;
            return true;
        }
        count++;
        return inorder(root.right,k);
    }
}