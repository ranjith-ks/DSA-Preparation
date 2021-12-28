/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
*/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res;
    }
    public void inOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
            return;
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
    }
}