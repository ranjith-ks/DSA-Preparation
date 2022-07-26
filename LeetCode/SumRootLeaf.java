/*
You are given the root of a binary tree containing digits from 0 to 9 only.
Each root-to-leaf path in the tree represents a number.
For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
A leaf node is a node with no children.
*/

class Solution {
    private int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        sumNumbers(root,0);
        return sum;
    }
    private void sumNumbers(TreeNode root,int curVal) {
        if(root==null)
            return;
        curVal = curVal*10 + root.val;
        if(root.left==null && root.right==null)
            sum += curVal;
        sumNumbers(root.left,curVal);
        sumNumbers(root.right,curVal);
    }
}