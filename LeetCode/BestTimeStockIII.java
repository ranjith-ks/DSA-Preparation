/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve. You may complete at most two transactions.
Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
*/

class Solution {
    public int maxProfit(int[] prices) {
        int b1,b2,s1,s2;
        b1 = b2 = Integer.MIN_VALUE;
        s1 = s2 = 0;
        for(int i:prices) {
            b1 = Math.max(b1,-i);
            s1 = Math.max(s1,i+b1);
            b2 = Math.max(b2,s1-i);
            s2 = Math.max(s2,b2+i);
        }
        return s2;
    }
}