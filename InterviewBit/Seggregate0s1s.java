/*
Problem Description
You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once.
Problem Constraints
1<=|A|<=1e6
Input Format
First argument is array of integers consisting of 0's and 1's only.
Output Format
Return a sorted array.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int i,z=0;
        for(i=0;i<A.size();i++)
            if(A.get(i)==0)
            {
                z++;
                res.add(0);
            }
        for(i=z;i<A.size();i++)
            res.add(1);
        return res;
    }
}
