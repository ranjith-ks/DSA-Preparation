/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i,j,n,count = 0;
        n = nums.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
                if(nums[i]==nums[j])
                    count++;
        }
        return count;
    }
}