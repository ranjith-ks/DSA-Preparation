/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root,res);
        return res;
    }
    public void preOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
            return;
        res.add(root.val);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }
}