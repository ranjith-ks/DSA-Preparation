/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
*/

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            hm.put(inorder[i],i);
        return buildTree(preorder,0,0,inorder.length-1,hm);
    }
    private TreeNode buildTree(int[] pre,int preStart,int inStart,int inEnd,Map<Integer,Integer> hm) {
        if(preStart>pre.length-1 || inStart>inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStart]);
        
        int cur = hm.get(pre[preStart]);
        
        root.left = buildTree(pre,preStart+1,inStart,cur-1,hm);
        root.right = buildTree(pre,preStart+cur-inStart+1,cur+1,inEnd,hm);
        return root;
    }
}