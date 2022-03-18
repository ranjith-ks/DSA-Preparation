/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i,j)-> Integer.compare(i[0],j[0]));
        LinkedList<int[]> res = new LinkedList<>();
        res.add(intervals[0]);
        int n = intervals.length;
        for(int i=0;i<n;i++)
        {
            if(intervals[i][0]<=res.getLast()[1])
                res.getLast()[1] = Math.max(intervals[i][1],res.getLast()[1]);
            else
                res.add(intervals[i]);
        }
        return res.toArray(new int[0][2]);
    }
}