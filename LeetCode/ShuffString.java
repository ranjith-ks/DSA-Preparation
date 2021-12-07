/*
Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
*/

class Solution {
    public String restoreString(String s, int[] indices) {
        int n,i;
        n = s.length();
        char res[] = new char[n];
        for(i=0;i<n;i++)
            res[indices[i]] = s.charAt(i);
        return String.valueOf(res);
    }
}