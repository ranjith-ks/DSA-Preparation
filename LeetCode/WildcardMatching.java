/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).
*/

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] match = new boolean[m+1][n+1];
        match[m][n] = true;
        for(int i=n-1;i>-1;i--) {
            if(p.charAt(i)!='*')
                break;
            match[m][i] = true;
        }
        for(int i=m-1;i>-1;i--) {
            for(int j=n-1;j>-1;j--) {
                if(p.charAt(j)==s.charAt(i) || p.charAt(j)=='?')
                    match[i][j] = match[i+1][j+1];
                else if(p.charAt(j)=='*')
                    match[i][j] = match[i+1][j] || match[i][j+1];
                else
                    match[i][j] = false;
            }
        }
        
        return match[0][0];
    }
}