/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length(),tLen = t.length();
        if(sLen!=tLen)  return false;
        Map<Character,Character> m1 = new HashMap<>();
        Map<Character,Character> m2 = new HashMap<>();
        for(int i=0;i<sLen;i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!m1.containsKey(a))
                m1.put(a,b);
            else if(m1.get(a)!=b)
                return false;
            if(!m2.containsKey(b))
                m2.put(b,a);
            else if(m2.get(b)!=a)
                return false;
        }
        return true;
    }
}