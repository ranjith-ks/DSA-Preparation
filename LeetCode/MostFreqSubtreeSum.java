/*
Given the root of a binary tree, return the most frequent subtree sum. If there is a tie, return all the values with the highest frequency in any order.
The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself).
*/

class Solution {
    private int max;
    public int[] findFrequentTreeSum(TreeNode root) {
        max = 0;
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        dfs(root,hm);
        for(int s:hm.keySet())
            if(hm.get(s)==max)
                res.add(s);
        int[] ans = new int[res.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = res.get(i);
        return ans;
    }
    private int dfs(TreeNode root,Map<Integer,Integer> hm) {
        if(root==null)
            return 0;
        int sum = root.val + dfs(root.left,hm) + dfs(root.right,hm);
        hm.put(sum,hm.getOrDefault(sum,0)+1);
        max = Math.max(max,hm.get(sum));
        return sum;
    }
}