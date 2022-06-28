/* 
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
*/

class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] r:dp)
            Arrays.fill(r,-1);
        int a1 = maxProfit(prices,0,true,dp);
        return a1;
    }
    private int maxProfit(int[] prices,int day,boolean buy,int[][] dp) {
        if(day>=prices.length) return 0;
        int b = buy?1:0;
        if(dp[day][b]!=-1)
            return dp[day][b];
        int a1 = maxProfit(prices,day+1,buy,dp);
        int a2 = 0;
        if(buy)
            a2 = -prices[day] + maxProfit(prices,day+1,!buy,dp);
        else
            a2 = prices[day] + maxProfit(prices,day+2,!buy,dp);
        return dp[day][b] = Math.max(a1,a2);
    }
}