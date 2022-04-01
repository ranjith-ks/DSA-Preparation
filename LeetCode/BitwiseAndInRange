/*
Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
*/

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0)
            return 0;
        int m = 1;
        while(left!=right)
        {
            left >>= 1;
            right >>= 1;
            m <<= 1;
        }
        return left*m;
    }
}