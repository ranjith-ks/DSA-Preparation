/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

class Solution {
    public int missingNumber(int[] nums) {
        int i,n=nums.length,sum=0;
        for(i=0;i<n;i++)
            sum += nums[i];
        return (n*(n+1))/2 - sum;
    }
}