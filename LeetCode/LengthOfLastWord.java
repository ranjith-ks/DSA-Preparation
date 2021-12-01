/*
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

/*
class Solution {
    public int lengthOfLastWord(String s) {
        String spl[] = s.split(" ");
        int n = spl.length;
        return spl[n-1].length();
    }
}
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0,i;
        for(i=s.length()-1;i>-1;i--)
        {
            if(s.charAt(i)!=' ')
                count++;
            else
                if(count>0)
                    return count;
        }
        return count;
    }
}