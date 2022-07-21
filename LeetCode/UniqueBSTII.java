/*
Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n. Return the answer in any order.
*/

class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generate(1,n);
    }
    private List<TreeNode> generate(int s,int e) {
        List<TreeNode> res = new ArrayList<>();
        if(s>e) {
            res.add(null);
            return res;
        }
        for(int i=s;i<=e;i++) {
            List<TreeNode> left = generate(s,i-1);
            List<TreeNode> right = generate(i+1,e);
            for(TreeNode l: left) {
                for(TreeNode r: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}