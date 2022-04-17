/*
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
*/

class Solution {
    public TreeNode prev = null,head = null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        increasingBST(root.left);
        if(prev!=null){
            root.left = null;
            prev.right = root;
        }
        if(head==null)
            head = root;
        prev = root;
        increasingBST(root.right);
        return head;
    }
}