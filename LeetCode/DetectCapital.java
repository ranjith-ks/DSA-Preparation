/*
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
*/

/*
class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n<2) return true;
        if(isCapital(word.charAt(0)))
        {
            if(isCapital(word.charAt(1)))
                return allCaps(word,n);
            return allSmall(word,n);
        }
        return allSmall(word,n);
    }
    private boolean isCapital(char c)
    {
        return c>='A' && c<='Z';
    }
    private boolean allCaps(String s,int n)
    {
        for(int i=2;i<n;i++)
            if(!isCapital(s.charAt(i)))
                return false;
        return true;
    }
    private boolean allSmall(String s,int n)
    {
        for(int i=1;i<n;i++)
            if(isCapital(s.charAt(i)))
                return false;
        return true;
    }
}
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length(),cap=0;
        for(int i=0;i<n;i++)
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
                cap++;
        if(cap==n || cap==0)
            return true;
        if(cap==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z'))
            return true;
        return false;
    }
}