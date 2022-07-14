/*
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.
*/

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hm = new HashMap<>();
        int start,end,n = s.length(),max,freq;
        start = end = max = freq = 0;
        while(end<n) {
            char c = s.charAt(end);
            hm.put(c,hm.getOrDefault(c,0)+1);
            freq = Math.max(freq,hm.get(c));
            int other = (end-start+1) - freq;
            if(other>k) {
                c = s.charAt(start);
                hm.put(c,hm.get(c)-1);
                start++;
            }
            max = Math.max(max,end-start+1);
            end++;
        }
        return max;
    }
}