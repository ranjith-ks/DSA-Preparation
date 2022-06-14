/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x, r = 0;
        while(temp>0) {
            r = r*10 + temp%10;
            temp /= 10;
        }
        return x==r;
    }
}