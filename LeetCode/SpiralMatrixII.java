/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int startRow = 0, startCol = 0, endRow = n,endCol = n,i,j,val=1;
        while(val<=n*n)
        {
            for(i=startRow,j=startCol;j<endCol;j++)
                res[i][j] = val++;
            startRow++;
            for(i=startRow,j=endCol-1;i<endRow;i++)
                res[i][j] = val++;
            endCol--;
            for(i=endRow-1,j=endCol-1;j>=startCol;j--)
                res[i][j] = val++;
            endRow--;
            for(i=endRow-1,j=startCol;i>=startRow;i--)
                res[i][j] = val++;
            startCol++;
        }
        return res;
    }
}