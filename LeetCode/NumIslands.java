/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*/

class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j] == '1') {
                    visit(grid,grid.length,grid[0].length,i,j);
                    res++;
                }
        return res;
    }
    private void visit(char[][] g,int m,int n,int i,int j) {
        if(i<0 || i>=m || j<0 || j>=n || g[i][j]!='1')
            return;
        g[i][j] = '0';
        visit(g,m,n,i-1,j);
        visit(g,m,n,i,j-1);
        visit(g,m,n,i,j+1);
        visit(g,m,n,i+1,j);
    }
}