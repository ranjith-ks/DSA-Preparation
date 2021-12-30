/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i,n=nums.length,max=0,count=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==1)
                count++;
            else
            {
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}