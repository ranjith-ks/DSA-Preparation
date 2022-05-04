/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
*/

class Solution {
    public int longestPalindrome(String s) {
        int[] l = new int[26];
        int[] u = new int[26];
        int res = 0;
        for(int i=0;i<s.length();i++) {
            char t = s.charAt(i);
            if(t>=97)
                l[t-'a']++;
            else
                u[t-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            res += (l[i]/2)*2;
            res += (u[i]/2)*2;
        }
        return res==s.length()? res: ++res;
    }
}