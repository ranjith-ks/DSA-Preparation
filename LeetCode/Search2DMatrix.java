/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1,mid;
        while(r1<r2)
        {
            mid = (r1+r2)/2;
            if(matrix[mid][c2]==target)
                return true;
            if(matrix[mid][c2]>target)
                r2 = mid;
            else
                r1 = mid+1;
        }
        while(c1<=c2)
        {
            mid = (c1+c2)/2;
            if(matrix[r2][mid]==target)
                return true;
            if(matrix[r2][mid]>target)
                c2 = mid-1;
            else
                c1 = mid+1;
        }
        return false;
    }
}