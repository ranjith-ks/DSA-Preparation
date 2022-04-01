/*
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
*/

class Solution {
    public int countOdds(int low, int high) {
        int r = high - low;
        if(r%2==1)
            return r = r/2 + 1;
        r /= 2;
        if(low%2==1)
            r++;
        return r;
    }
}