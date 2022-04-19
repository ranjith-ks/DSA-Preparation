/*
You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
*/

class Solution {
    private TreeNode first,second,prev;
    public void recoverTree(TreeNode root) {
        if(root==null)
            return;
        first = second = prev = null;
        inorder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    private void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(first==null && (prev==null || prev.val>=root.val))
            first = prev;
        if(first!=null && prev.val>=root.val)
            second = root;
        prev = root;
        inorder(root.right);
    }
}