/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.
*/

class Solution {
    private int[][] dp = new int[13][10001];
    public int coinChange(int[] coins, int amount) {
        for(int[] r:dp)
            Arrays.fill(r,-1);
        int res = coinsUsed(coins,0,amount);
        return res==Integer.MAX_VALUE-1?-1:res;
    }
    private int  coinsUsed(int[] coins,int idx,int amt) {
        if(idx==coins.length || amt<1)
            return amt==0?0:Integer.MAX_VALUE-1;
        if(dp[idx][amt]!=-1)
            return dp[idx][amt];
        int res = -1;
        if(coins[idx]>amt) {
            int notTake = coinsUsed(coins,idx+1,amt);
            dp[idx][amt] = res = notTake;
        }
        else {
            int notTake = coinsUsed(coins,idx+1,amt);
            int take = coinsUsed(coins,idx,amt-coins[idx]) + 1;
            dp[idx][amt] = res = Math.min(notTake,take);
        }
        return dp[idx][amt] = res;
    }
}