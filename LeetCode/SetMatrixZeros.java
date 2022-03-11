/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
*/

/*
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
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length,col0=1;
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
                col0 = 0;
            for(int j=1;j<n;j++)
                if(matrix[i][j]==0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        for(int i=m-1;i>-1;i--)
        {
            for(int j=n-1;j>0;j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j] = 0;
            if(col0==0)
                matrix[i][0] = 0;
        }
    }
}