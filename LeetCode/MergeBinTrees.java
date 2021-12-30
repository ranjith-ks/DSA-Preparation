/*
You are given two binary trees root1 and root2.
Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.
Return the merged tree.
Note: The merging process must start from the root nodes of both trees.
*/
/*
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = merge(root1,root2);
        return root;
    }
    private TreeNode merge(TreeNode r1,TreeNode r2)
    {
        if(r1==null && r2==null)
            return null;
        if(r1==null)
        {
            var root = new TreeNode(r2.val);
            root.left = merge(null,r2.left);
            root.right = merge(null,r2.right);
            return root;
        }
        if(r2==null)
        {
            var root = new TreeNode(r1.val);
            root.left = merge(r1.left,null);
            root.right = merge(r1.right,null);
            return root;
        }
        var root = new TreeNode(r1.val+r2.val);
        root.left = merge(r1.left,r2.left);
        root.right = merge(r1.right,r2.right);
        return root;
    }
}
*/

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = merge(root1,root2);
        return root;
    }
    private TreeNode merge(TreeNode r1,TreeNode r2)
    {
        if(r1==null && r2==null)
            return null;
        if(r1==null)
            return r2;
        if(r2==null)
            return r1;
        var root = new TreeNode(r1.val+r2.val);
        root.left = merge(r1.left,r2.left);
        root.right = merge(r1.right,r2.right);
        return root;
    }
}