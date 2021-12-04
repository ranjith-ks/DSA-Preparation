/*
Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.

A substring is a contiguous (non-empty) sequence of characters within a string.

Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
*/

class Solution {
    public long countVowels(String word) {
        long res=0;
        char c;
        int i,n;
        n = word.length();
        for(i=0;i<n;i++)
        {
            c = word.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                res += (long)(i+1)*(long)(n-i);
        }
        return res;
    }
}