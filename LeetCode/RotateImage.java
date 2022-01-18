/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

class Solution {
    public void rotate(int[][] matrix) {
        int i,j,n=matrix.length;
        int[][] res = new int[n][n];
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                res[j][n-i-1] = matrix[i][j];
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                matrix[i][j] = res[i][j];
    }
}