/*
For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].
Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 109 + 7.
*/

class Solution {
    public int kInversePairs(int n, int k) {
        long mod = 1000000007L;
        long[] dp = new long[k+1];
        dp[0] = 1;
        for(int i=2;i<=n;i++) {
            long[] curr = new long[k+1];
            for(int j=0;j<=k;j++) {
                long val = j==0? 0: curr[j-1];
                long diff = j-i<0? 0: dp[j-i];
                curr[j] = (dp[j] + val - diff + mod) % mod;
            }
            dp = curr;
        }
        return (int)dp[k];
    }
}