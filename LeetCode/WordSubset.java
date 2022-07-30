/*
You are given two string arrays words1 and words2.
A string b is a subset of string a if every letter in b occurs in a including multiplicity.
For example, "wrr" is a subset of "warrior" but is not a subset of "world".
A string a from words1 is universal if for every string b in words2, b is a subset of a.
Return an array of all the universal strings in words1. You may return the answer in any order.
*/

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int[] hfreq = highestFrequency(words2);
        
        for(String s:words1) {
            boolean isSubset = true;
            int[] freq = frequency(s);
            for(int i=0;i<26;i++) {
                if(freq[i]<hfreq[i]) {
                    isSubset = false;
                    break;
                }
            }
            if(isSubset)
                res.add(s);
        }
        return res;
    }
    private int[] highestFrequency(String[] w) {
        int[] freq = new int[26];
        for(String s:w) {
            int[] cur = frequency(s);
            for(int i=0;i<26;i++)
                freq[i] = Math.max(freq[i],cur[i]);
        }
        return freq;
    }
    private int[] frequency(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray())
            freq[c-'a']++;
        return freq;
    }
}