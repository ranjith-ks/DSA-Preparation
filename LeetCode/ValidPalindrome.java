/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
*/

class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length(),i=0,j=n-1;
        while(i<j){
            while(i<j && !alpnum(s.charAt(i)))
                i++;
            while(i<j && !alpnum(s.charAt(j)))
                j--;
            if(i<j){
                char a = s.charAt(i);
                char b = s.charAt(j);
                int l = getCharVal(a), r = getCharVal(b);
                if(l!=r)
                    return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean alpnum(char c)
    {
        return (c>='0' && c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
    private int getCharVal(char c){
        if(c>='a' && c<='z')
            return c-'a';
        if(c>='A' && c<='Z')
            return c-'A';
        return c;
    }
}