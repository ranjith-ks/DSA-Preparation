/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        int i,l1=s.length(),l2=t.length();
        for(i=0;i<l1;i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!stk1.empty())
                    stk1.pop();
            }
            else
                stk1.push(s.charAt(i));
        }
        for(i=0;i<l2;i++)
        {
            if(t.charAt(i)=='#')
            {
                if(!stk2.empty())
                    stk2.pop();
            }
            else
                stk2.push(t.charAt(i));
        }
        if(stk1.size() != stk2.size())
            return false;
        while(!stk1.empty())
        {
            if(stk1.pop()!=stk2.pop())
                return false;
        }
        return true;
    }
}