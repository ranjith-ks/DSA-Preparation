/*
Given an m x n matrix, return all elements of the matrix in spiral order.
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int i,rowBegin=0,rowEnd=matrix.length-1,colBegin=0,colEnd=matrix[0].length-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for(i=colBegin;i<=colEnd;i++)
                res.add(matrix[rowBegin][i]);
            rowBegin++;
            for(i=rowBegin;i<=rowEnd;i++)
                res.add(matrix[i][colEnd]);
            colEnd--;
            if(rowBegin<=rowEnd)
            {
                for(i=colEnd;i>=colBegin;i--)
                    res.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            if(colBegin<=colEnd)
            {
                for(i=rowEnd;i>=rowBegin;i--)
                    res.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        return res;
    }
}