/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length(),tLen = t.length();
        if(sLen!=tLen)
            return false;
        int i;
        int[] freq = new int[26];
        for(i=0;i<sLen;i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(i=0;i<26;i++)
            if(freq[i]!=0)
                return false;
        return true;
    }
}