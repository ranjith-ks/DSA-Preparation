/*
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        String spl[] = s.split(" ");
        int n = spl.length;
        return spl[n-1].length();
    }
}