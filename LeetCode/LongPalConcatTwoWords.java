/*
You are given an array of strings words. Each element of words consists of two lowercase English letters.
Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.
Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.
A palindrome is a string that reads the same forward and backward.
*/

class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> hm = new HashMap<>();
        int res = 0;
        for(String w:words) {
            String rev = w.charAt(1)+""+w.charAt(0);
            if(hm.containsKey(rev)) {
                res += 4;
                hm.put(rev,hm.get(rev)-1);
                if(hm.get(rev)==0)
                    hm.remove(rev);
                continue;
            }
            hm.put(w,hm.getOrDefault(w,0)+1);
        }
        for(String k:hm.keySet()) {
            if(hm.get(k)==1 && (k.charAt(1)+""+k.charAt(0)).equals(k)) {
                res += 2;
                break;
            }
        }
        return res;
    }
}