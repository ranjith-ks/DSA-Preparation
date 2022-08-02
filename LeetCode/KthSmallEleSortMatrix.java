/* 
Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.
You must find a solution with a memory complexity better than O(n2).
*/

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++) {
                pq.offer(matrix[i][j]);
                if(pq.size()>k)
                    pq.poll();
            }
        return pq.poll();
    }
}