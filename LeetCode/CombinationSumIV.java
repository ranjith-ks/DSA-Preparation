/*
Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
The test cases are generated so that the answer can fit in a 32-bit integer.
*/

class Solution {
    public int combinationSum4(int[] nums, int target) {
        return combination(nums,target,0,new Integer[target+1]);
    }
    private int combination(int[] nums,int target,int idx,Integer[] dp) {
        if(target<=0 || idx>=nums.length)
            return (target==0)?1:0;
        if(dp[target]!=null)
            return dp[target];
        int take = combination(nums,target-nums[idx],0,dp);
        int leave = combination(nums,target,idx+1,dp);
        return dp[target] = take+leave;
    }
}