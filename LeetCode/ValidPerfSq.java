/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        long r = num;
        while(r*r>num)
            r = (r + num/r) / 2;
        return r*r==num;
    }
}