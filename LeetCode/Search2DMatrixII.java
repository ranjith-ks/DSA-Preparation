/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0,col = matrix[0].length-1;
        while(row<matrix.length && col>-1) {
            if(matrix[row][col]==target)
                return true;
            if(matrix[row][col]<target)
                row++;
            else
                col--;
        }
        return false;
    }
}