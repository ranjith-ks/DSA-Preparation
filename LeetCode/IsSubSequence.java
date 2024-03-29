/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        if(sLen==0) return true;

        int tLen = t.length();
        int si = 0,ti = 0;
        while(ti<tLen)
        {
            if(s.charAt(si)==t.charAt(ti))
                si++;
            if(si==sLen)
                return true;
            ti++;
        }
        return false;
    }
}