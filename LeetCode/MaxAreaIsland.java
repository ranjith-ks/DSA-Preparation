/*
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
The area of an island is the number of cells with a value 1 in the island.
Return the maximum area of an island in grid. If there is no island, return 0.
*/

class Solution {
    int m,n;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int max = 0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(grid[i][j]==1)
                    max = Math.max(max,dfs(grid,i,j));
        return max;
    }
    private int dfs(int[][] a,int r,int c) {
        if(r<0 || c<0 || r>=m || c>=n || a[r][c]!=1)
            return 0;
        a[r][c] = 0;
        return 1 + dfs(a,r-1,c) + dfs(a,r+1,c) + dfs(a,r,c-1) + dfs(a,r,c+1);
    }
}