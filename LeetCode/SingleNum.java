package LeetCode;
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0,n=nums.length,i;
        for(i=0;i<n;i++)
            ans ^= nums[i];
        return ans;
    }
}