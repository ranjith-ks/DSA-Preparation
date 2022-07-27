/*
You are given an m x n grid where each cell can have one of three values:
0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
*/

class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)
            return -1;
        int row = grid.length,col = grid[0].length,minutes = 50;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                if(grid[i][j]==2) {
                    grid[i][j] = 50;
                    rot(grid,row,col,i,j,50);
                }
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++) {
                if(grid[i][j]==1)
                    return -1;
                minutes = Math.max(minutes,grid[i][j]);
            }
        return minutes-50;        
    }
    private void rot(int[][] g,int r,int c,int i,int j,int m) {
        if(i<0 || i>=r || j<0 || j>=c || g[i][j]==0 || (g[i][j]>1 && g[i][j]<m))
            return;
        g[i][j] = m;
        rot(g,r,c,i-1,j,m+1);
        rot(g,r,c,i,j-1,m+1);
        rot(g,r,c,i+1,j,m+1);
        rot(g,r,c,i,j+1,m+1);
    }
}