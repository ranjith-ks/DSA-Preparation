/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,n=nums.length;
        for(i=0;i<n;i++)
            nums[i] *= nums[i];
        Arrays.sort(nums);
        return nums;
    }
}