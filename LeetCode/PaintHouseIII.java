/*
There is a row of m houses in a small city, each house must be painted with one of the n colors (labeled from 1 to n), some houses that have been painted last summer should not be painted again.
A neighborhood is a maximal group of continuous houses that are painted with the same color.
For example: houses = [1,2,2,3,3,2,1,1] contains 5 neighborhoods [{1}, {2,2}, {3,3}, {2}, {1,1}].
Given an array houses, an m x n matrix cost and an integer target where:
houses[i]: is the color of the house i, and 0 if the house is not painted yet.
cost[i][j]: is the cost of paint the house i with the color j + 1.
Return the minimum cost of painting all the remaining houses in such a way that there are exactly target neighborhoods. If it is not possible, return -1.
*/

/*
class Solution {
    private int mx = 10000001;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int[][][] dp = new int[m+1][n+1][target+1];
        for(int[][] r2:dp)
            for(int[] r:r2)
                Arrays.fill(r,-1);
        int c = minCost(houses,cost,m,n,target,0,0,0,dp);
        return c==mx?-1:c;
    }
    private int minCost(int[] h,int[][] c,int m,int n,int t,int i,int p,int g,int[][][] dp) {
        if(g>t)
            return mx;
        if(i==m) {
            if(g==t) return 0;
            return mx;
        }
        if(dp[i][p][g]!=-1)
            return dp[i][p][g];
        int cost = mx,temp;
        if(h[i]==0) {
            for(int col=1;col<=n;col++) {
                if(col==p)
                    temp = c[i][col-1] + minCost(h,c,m,n,t,i+1,col,g,dp);
                else
                    temp = c[i][col-1] + minCost(h,c,m,n,t,i+1,col,g+1,dp);
                cost = Math.min(cost,temp);
            }
        }
        else {
            if(h[i]==p)
                temp = minCost(h,c,m,n,t,i+1,h[i],g,dp);
            else
                temp = minCost(h,c,m,n,t,i+1,h[i],g+1,dp);
            cost = Math.min(cost,temp);
        }
        return dp[i][p][g] = cost;
    }
}
*/

class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int mx = 10000001;
        int[][][] dp = new int[m+1][n+1][target+2];
        for(int[][] r2:dp)
            for(int[] r:r2)
                Arrays.fill(r,mx);
        for(int i=1;i<=n;i++)
            dp[m][i][target] = 0;
        for(int i=m-1;i>-1;i--) {
            for(int p=n;p>-1;p--) {
                for(int g=target;g>-1;g--) {
                    int min = mx,temp;
                    if(houses[i]==0) {
                        for(int j=1;j<=n;j++) {
                            if(j==p)
                                temp = cost[i][j-1] + dp[i+1][j][g];
                            else
                                temp = cost[i][j-1] + dp[i+1][j][g+1];
                            min = Math.min(min,temp);
                        }
                    }
                    else {
                        if(houses[i]==p)
                            min = dp[i+1][houses[i]][g];
                        else
                            min = dp[i+1][houses[i]][g+1];
                    }
                    dp[i][p][g] = min;
                }
            }
        }
        int res = dp[0][0][0];
        return res==mx?-1:res;
    }
}