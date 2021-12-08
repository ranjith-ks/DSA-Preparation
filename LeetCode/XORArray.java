/*
Given an integer n and an integer start.

Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
*/

class Solution {
    public int xorOperation(int n, int start) {
        int i,res=-1;
        for(i=0;i<n;i++)
        {
            if(res==-1)
                res = start + 2*i;
            else
                res ^= (start + 2*i);
        }
        return res;
    }
}