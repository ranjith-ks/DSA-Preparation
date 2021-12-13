package LeetCode;
/*
Given a string s, return the longest palindromic substring in s.
*/
class Solution {
    public String longestPalindrome(String s) {
        int i,start,end,ansi=0,ansj=0,max=0,n = s.length();
        for(i=0;i<n;i++)//i is center of string
        {
            //Assuming i is odd centered
            start = i-1;
            end = i+1;
            while(start>-1 && end<n && s.charAt(start)==s.charAt(end))
            {
                start--;
                end++;
            }
            start++;end--;
            if(max<end-start+1)
            {
                max = end-start+1;
                ansi = start;
                ansj = end;
            }
            //Assuming i is even centered
            if(i<n-1 && s.charAt(i)==s.charAt(i+1))
            {
                start = i;
                end = i+1;
                while(start>-1 && end<n && s.charAt(start)==s.charAt(end))
                {
                    start--;
                    end++;
                }
                start++;end--;
                if(max<end-start+1)
                {
                    max = end-start+1;
                    ansi = start;
                    ansj = end;
                }
            }
        }
        return s.substring(ansi,ansj+1);
    }
}