/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
*/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        TreeNode root = createTree(nums,0,nums.length-1);
        return root;
    }
    private TreeNode createTree(int[] nums,int s,int e) {
        if(s>e)
            return null;
        int mid = (s+e)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums,s,mid-1);
        root.right = createTree(nums,mid+1,e);
        return root;
    }
}