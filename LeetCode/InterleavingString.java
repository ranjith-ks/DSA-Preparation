/*
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.
*/

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
            return false;
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int[] rows:dp)
            Arrays.fill(rows,-1);
        return isInterleave(s1,s2,s3,0,0,dp);
    }
    private boolean isInterleave(String a,String b,String c,int i,int j,int[][] dp) {
        if(i+j==c.length() && i==a.length()) return true;
        if(i+j>c.length()) return false;
        if(dp[i][j]!=-1) return dp[i][j]==1;
        boolean flag = (i<a.length() && a.charAt(i)==c.charAt(i+j) && isInterleave(a,b,c,i+1,j,dp)) ||
            (j<b.length()&& b.charAt(j)==c.charAt(i+j) && isInterleave(a,b,c,i,j+1,dp));
        dp[i][j] = flag?1:0;
        return flag;
    }
}