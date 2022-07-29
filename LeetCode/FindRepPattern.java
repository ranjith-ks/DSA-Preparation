/*
Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.
A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.
*/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String w: words)
            if(isMatch(w,pattern))
                res.add(w);
        return res;
    }
    private boolean isMatch(String w,String p) {
        Map<Character,Character> m1 = new HashMap<>();
        Map<Character,Character> m2 = new HashMap<>();
        for(int i=0;i<w.length();i++) {
            char c1 = w.charAt(i);
            char c2 = p.charAt(i);
            if(!m1.containsKey(c1))
                m1.put(c1,c2);
            if(!m2.containsKey(c2))
                m2.put(c2,c1);
            if(m1.get(c1)!=c2 || m2.get(c2)!=c1)
                return false;
        }
        return true;
    }
}