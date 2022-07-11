/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
*/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightSideView(root,res,0);
        return res;
    }
    private void rightSideView(TreeNode cur,List<Integer> res,int depth) {
        if(cur==null)
            return;
        if(res.size()==depth)
            res.add(cur.val);
        rightSideView(cur.right,res,depth+1);
        rightSideView(cur.left,res,depth+1);
    }
}