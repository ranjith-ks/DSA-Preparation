/*
You are given a string s consisting of lowercase English letters, and an integer k.
First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.
For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:
Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.
*/

class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        String temp = "";
        for(int i=0;i<s.length();i++)
        {
            temp = Integer.toString(s.charAt(i)-'a' + 1);
            num += temp;
        }

        int res = 0;
        for(int i=0;i<num.length();i++)
            res += num.charAt(i)-'0';
        while(--k>0&&res>9)
            res = sumOfdig(res);
        return res;
    }
    public int sumOfdig(int n)
    {
        int res=0;
        while(n>0)
        {
            res += n%10;
            n /= 10;
        }
        return res;
    }
}