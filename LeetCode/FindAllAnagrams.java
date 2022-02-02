/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p.length()>s.length())
            return res;
        int[] freq = new int[26];
        for(int i=0;i<p.length();i++)
            freq[p.charAt(i)-'a']++;
        int start=0,end=0,diff = p.length();
        for(end=0;end<p.length();end++)
        {
            char c = s.charAt(end);
            freq[c-'a']--;
            if(freq[c-'a']>=0)
                diff--;
        }
        if(diff==0)
            res.add(0);
        while(end<s.length())
        {
            char c = s.charAt(start);
            if(freq[c-'a']>=0)
                diff++;
            freq[c-'a']++;
            start++;
            c = s.charAt(end);
            freq[c-'a']--;
            if(freq[c-'a']>=0)
                diff--;
            if(diff==0)
                res.add(start);
            end++;
        }
        return res;
    }
}