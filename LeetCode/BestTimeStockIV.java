/* 
You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
Find the maximum profit you can achieve. You may complete at most k transactions.
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
*/

class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] buy = new int[k+1];
        int[] sell = new int[k+1];
        Arrays.fill(buy,Integer.MIN_VALUE);
        for(int p:prices) {
            for(int i=1;i<=k;i++) {
                buy[i] = Math.max(buy[i],sell[i-1]-p);
                sell[i] = Math.max(sell[i],buy[i]+p);
            }
        }
        return sell[k];
    }
}