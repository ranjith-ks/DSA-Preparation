/*
Problem Description

Given an sorted array A of size N. Find number of elements which are less than or equal to B.

NOTE: Expected Time Complexity O(log N)



Problem Constraints
1 <= N <= 106

1 <= A[i], B <= 109



Input Format
First agument is an integer array A of size N.

Second argument is an integer B.



Output Format
Return an integer denoting the number of elements which are less than or equal to B.



Example Input
Input 1:

 A = [1, 3, 4, 4, 6]
 B = 4
Input 2:

 A = [1, 2, 5, 5]
 B = 3


Example Output
Output 1:

 4
Output 2:

 2
*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int result = binSearch(A,B,0,A.size()-1);
        return result;
    }
    public int binSearch(ArrayList<Integer> A,int B,int start,int end)
    {
        if(end>=start)
        {
            int mid = start + (end-start)/2;
            if(A.get(mid)>B)
                return binSearch(A,B,start,mid-1);
            if(A.get(mid)<=B)
                return binSearch(A,B,mid+1,end);
        }
        return start+(end-start)/2;
    }
}
