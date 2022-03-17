/*
Given a balanced parentheses string s, return the score of the string.
The score of a balanced parentheses string is based on the following rule:
"()" has score 1.
AB has score A + B, where A and B are balanced parentheses strings.
(A) has score 2 * A, where A is a balanced parentheses string.
*/

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int n = s.length(),count = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push(count);
                count = 0;
            }
            else
                count = Math.max(2*count,1) + stk.pop();
        }
        return count;
    }
}