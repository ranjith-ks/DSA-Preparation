/*
Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.
*/

/*
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
*/

class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while(root1!=null || root2!=null || !s1.empty() || !s2.empty())
        {
            while(root1!=null)
            {
                s1.push(root1);
                root1 = root1.left;
            }
            while(root2!=null)
            {
                s2.push(root2);
                root2 = root2.left;
            }
            if(s2.empty() || (!s1.empty() && s1.peek().val<=s2.peek().val))
            {
                root1 = s1.pop();
                res.add(root1.val);
                root1 = root1.right;
            }
            else
            {
                root2 = s2.pop();
                res.add(root2.val);
                root2 = root2.right;
            }
        }
        return res;
    }
}