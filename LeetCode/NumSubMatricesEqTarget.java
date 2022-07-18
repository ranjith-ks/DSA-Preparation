/*
Given a matrix and a target, return the number of non-empty submatrices that sum to target.
A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.
Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.
*/

class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0;i<m;i++)
            for(int j=1;j<n;j++)
                matrix[i][j] += matrix[i][j-1];
        Map<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++) {
                hm.clear();
                hm.put(0,1);
                int cur = 0;
                for(int k=0;k<m;k++) {
                    cur += matrix[k][j] - (i>0?matrix[k][i-1]:0);
                    res += hm.getOrDefault(cur-target,0);
                    hm.put(cur,hm.getOrDefault(cur,0)+1);
                }
            }
        return res;
    }
}