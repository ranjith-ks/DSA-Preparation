/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currMax = Math.max(currMax+nums[i],nums[i]);
            max = Math.max(max,currMax);
        }
        return max;
    }
}