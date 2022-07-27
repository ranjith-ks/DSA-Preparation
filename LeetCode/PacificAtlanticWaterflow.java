/*
There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).
The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.
Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
*/

class Solution {
    private int pacific,atlantic;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if(heights==null || heights.length==0)
            return res;
        pacific = atlantic = 0;
        int row = heights.length, col = heights[0].length;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++) {
                atlantic = pacific = 0;
                List<Integer> l = new ArrayList<>();
                if(dfs(heights,row,col,i,j)) {
                    l.add(i);
                    l.add(j);
                    res.add(l);
                }
            }
        return res;
    }
    private boolean dfs(int[][] h,int r,int c,int i,int j) {
        if(i<0 || i>=r || j<0 || j>=c || h[i][j]==-1)
            return false;
        if((i>=0 && j==0)  || (j>=0 && i==0))
           pacific = 1;
        if((i>=0 && j==c-1) || (j>=0 && i==r-1))
            atlantic = 1;
        if(pacific==1 && atlantic==1)
            return true;
        int temp = h[i][j];
        h[i][j] = -1;
        
        boolean left,right,up,down;
        left = right= up = down = false;
        if(i>0 && temp>=h[i-1][j])
			 left= dfs(h,r,c,i-1,j);

		if(i<r-1 && temp>=h[i+1][j])
			right= dfs(h,r,c,i+1,j);

		if(j>0 && temp>=h[i][j-1])
			up= dfs(h,r,c,i,j-1);

		if(j<c-1 && temp>=h[i][j+1])
			down= dfs(h,r,c,i,j+1);
		h[i][j]=temp;
		return left||up||right||down;
    }
}