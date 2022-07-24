/*
Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
*/

class Solution {
    private int paths;
    public int pathSum(TreeNode root, int targetSum) {
        paths = 0;
        Map<Long,Integer> hm = new HashMap<>();
        hm.put(0L,1);
        dfs(root,targetSum,0,hm);
        return paths;
    }
    private void dfs(TreeNode root,int target,long cur,Map<Long,Integer> hm) {
        if(root==null)
            return;
        cur += root.val;
        if(hm.containsKey(cur-target))
            paths += hm.get(cur-target);
        hm.put(cur,hm.getOrDefault(cur,0)+1);
        dfs(root.left,target,cur,hm);
        dfs(root.right,target,cur,hm);
        hm.put(cur,hm.get(cur)-1);
    }
}