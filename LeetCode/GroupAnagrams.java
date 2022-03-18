/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String s: strs)
        {
            char[] freq = new char[26];
            for(char c: s.toCharArray())
                freq[c-'a']++;
            String keyValue = String.valueOf(freq);
            if(!hm.containsKey(keyValue))
                hm.put(keyValue,new ArrayList<>());
            hm.get(keyValue).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}