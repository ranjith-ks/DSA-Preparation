/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
*/

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int start = 0, res = 0, n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
                stk.push(i);
            else
            {
                if(stk.size()==0)
                    start = i+1;
                else
                {
                    stk.pop();
                    if(stk.size()==0)
                        res = Math.max(res,i-start+1);
                    else
                        res = Math.max(res,i-stk.peek());
                }
            }
        }
        return res;
    }
}