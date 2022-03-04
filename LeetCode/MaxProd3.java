/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
*/

class Solution {
    public int maximumProduct(int[] nums) {
        int max1,max2,max3,min1,min2,n = nums.length;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        min1 = min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max1<nums[i])
            {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2<nums[i])
            {
                max3 = max2;
                max2 = nums[i];
            }
            else if(max3<nums[i])
                max3 = nums[i];
            if(min1>nums[i])
            {
                min2 = min1;
                min1 = nums[i];
            }
            else if(min2>nums[i])
                min2 = nums[i];
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}