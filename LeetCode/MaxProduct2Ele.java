/*
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
*/

class Solution {
    public int maxProduct(int[] nums) {
        int i,n=nums.length,fmax = Math.max(nums[0],nums[1]),smax = Math.min(nums[0],nums[1]);
        for(i=2;i<n;i++)
        {
            if(nums[i]>smax)
            {
                if(nums[i]>fmax)
                {
                    smax = fmax;
                    fmax = nums[i];
                }
                else
                    smax = nums[i];
            }
        }
        return (fmax-1)*(smax-1);
    }
}