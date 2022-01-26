/*
Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.
*/

class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        getElements(root1,root2,res);
        Collections.sort(res);
        return res;
    }
    public void getElements(TreeNode r1,TreeNode r2,List<Integer> res)
    {
        if(r1==null && r2==null)
            return;
        if(r1!=null)
            res.add(r1.val);
        if(r2!=null)
            res.add(r2.val);
        getElements(r1==null?null:r1.left,r2==null?null:r2.left,res);
        getElements(r1==null?null:r1.right,r2==null?null:r2.right,res);
    }
}