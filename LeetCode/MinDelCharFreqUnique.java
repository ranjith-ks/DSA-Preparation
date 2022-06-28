/*
A string s is called good if there are no two different characters in s that have the same frequency.
Given a string s, return the minimum number of characters you need to delete to make s good.
The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
*/

class Solution {
    public int minDeletions(String s) {
        Set<Integer> hs = new HashSet<>();
        int[] freq = new int[26];
        int res = 0;
        for(char c: s.toCharArray())
            freq[c-'a']++;
        for(int i=0;i<26;i++) {
            while(freq[i]>0 && !hs.add(freq[i])) {
                --freq[i];
                res++;
            }
        }
        return res;
    }
}