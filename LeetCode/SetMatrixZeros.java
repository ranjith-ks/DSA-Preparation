/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] zeroPositionsRow = new boolean[m];
        boolean[] zeroPositionsCol = new boolean[n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(matrix[i][j]==0)
                    zeroPositionsRow[i] = zeroPositionsCol[j] = true;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(zeroPositionsRow[i] || zeroPositionsCol[j])
                    matrix[i][j] = 0;
    }
}