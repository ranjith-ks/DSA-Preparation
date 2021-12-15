/*
Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
NOTE: You should make minimum number of comparisons.
Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109
Input Format
First and only argument is an integer array A of size N.
Output Format
Return an integer denoting the sum Maximum and Minimum element in the given array.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,i;
        for(i=0;i<A.size();i++)
        {
            max = max>A.get(i)?max:A.get(i);
            min = min<A.get(i)?min:A.get(i);
        }
        return max+min;
    }
}
