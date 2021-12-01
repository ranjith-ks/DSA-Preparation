/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int i,sum=0,n = nums.length;
        int res[] = new int[n];
        for(i=0;i<n;i++)
        {
            sum += nums[i];
            res[i] = sum;
        }

        return res;
    }
}