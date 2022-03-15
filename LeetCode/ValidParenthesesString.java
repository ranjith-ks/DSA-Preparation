/*
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
The following rules define a valid string:
Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
*/

class Solution {
    public boolean checkValidString(String s) {
        int a = 0, b = 0, n = s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                a++;
                b++;
            }
            else if(c==')')
            {
                if(a>0)
                    a--;
                b--;
            }
            else
            {
                if(a>0)
                    a--;
                b++;
            }
            if(b<0)
                return false;
        }
        return a==0;
    }
}