/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length,i,j;
        for(i=0,j=0;i<n;i++)
        {
            if(nums[i]==0)
                continue;
            else
                nums[j++] = nums[i];
        }
        for(;j<n;j++)
            nums[j] = 0;
    }
}