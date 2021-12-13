/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.
*/

class Solution {
    public int maxPower(String s) {
        int i,n=s.length(),max=1,count=1;
        char c,prev=s.charAt(0);
        for(i=1;i<n;i++)
        {
            c = s.charAt(i);
            if(c==prev)
                count++;
            else
                count = 1;
            prev = c;
            max = max>count?max:count;
        }
        return max;
    }
}