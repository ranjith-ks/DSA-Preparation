/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
*/

class Solution {
    Map<Integer,Integer> dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new HashMap<>();
        return Math.min(minCost(cost,0),minCost(cost,1));
    }
    private int minCost(int[] cost,int idx)
    {
        if(idx>=cost.length)
            return 0;
        if(dp.containsKey(idx))
            return dp.get(idx);
        dp.put(idx,Math.min(minCost(cost,idx+1),minCost(cost,idx+2)) + cost[idx]);
        return dp.get(idx);
    }
}