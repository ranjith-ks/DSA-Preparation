/*
A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti], the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.
Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
*/

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->a[0]-a[1]-b[0]+b[1]);
        int cost=0,n=costs.length;
        for(int i=0;i<n/2;i++)
            cost += costs[i][0] + costs[i+n/2][1];
        return cost;
    }
}