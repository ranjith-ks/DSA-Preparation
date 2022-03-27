/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
A row i is weaker than a row j if one of the following is true:
The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
*/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int idx=0;
        for (int[] row : mat)
        {
            int low = 0, high = row.length;
            while(low < high)
            {
                int mid = (low + high) / 2;
                if (row[mid] != 0)
                    low = mid + 1;
                else
                    high = mid;
            }
            pq.add(new int[]{low, idx++});
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++)
            res[i] = pq.remove()[1];
        return res;
    }
}