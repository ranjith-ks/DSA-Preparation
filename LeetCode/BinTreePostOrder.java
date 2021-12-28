/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root,res);
        return res;
    }
    private void postOrder(TreeNode root,List<Integer> res)
    {
        if(root==null)
            return;
        postOrder(root.left,res);
        postOrder(root.right,res);
        res.add(root.val);
    }
}