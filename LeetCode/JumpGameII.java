/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Your goal is to reach the last index in the minimum number of jumps.
You can assume that you can always reach the last index.
*/

class Solution {
    public int jump(int[] nums) {
        return jump(nums,0,nums.length);
    }
    private int jump(int[] nums,int k,int n)
    {
        if(k>=n-1)
            return 0;
        if(k+nums[k]>=n-1)
            return 1;
        int max = 0, steps = 0;
        for(int i=1;i<=nums[k];i++)
        {
            int j = i + nums[k+i];
            if(j>max)
            {
                max = j;
                steps = i;
            }
        }
        return 1+jump(nums,k+steps,n);
    }
}