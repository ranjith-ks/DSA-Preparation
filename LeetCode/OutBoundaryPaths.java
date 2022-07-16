/*
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.
*/

class Solution {
    private double MOD = 1000000000+7;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        double[][][] dp = new double[m+1][n+1][maxMove+1];
        for(double[][] r2:dp)
            for(double[] r:r2)
                Arrays.fill(r,-1);
        return (int)(ways(m,n,maxMove,startRow,startColumn,0,dp)%MOD);
    }
    private double ways(int m,int n,int maxMove,int x,int y,int move,double[][][] dp) {
        if(x<0 || x>=m || y<0 || y>=n)
            return 1;
        if(move==maxMove)
            return 0;
        if(dp[x][y][move]!=-1)
            return dp[x][y][move]%MOD;
        double up = (ways(m,n,maxMove,x-1,y,move+1,dp) % MOD);
        double down = (ways(m,n,maxMove,x+1,y,move+1,dp) % MOD);
        double left = (ways(m,n,maxMove,x,y-1,move+1,dp) % MOD);
        double right = (ways(m,n,maxMove,x,y+1,move+1,dp) % MOD);
        dp[x][y][move] = ((up+down+left+right) % MOD);
        return dp[x][y][move]%MOD;
    }
}