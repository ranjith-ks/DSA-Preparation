/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
*/

class Solution {
    int top = -1;
    char stack[] = new char[10000];
    
    public void push(char c)
    {
        top++;
        stack[top] = c;
    }
    
    public char pop()
    {
        return stack[top--];
    }
    
    public boolean isValid(String s) {
        char l[] = s.toCharArray();
        char m;
        int i;
        boolean result=true;
        for(i=0;i<l.length;i++)
        {
            if(l[i]=='(' || l[i]=='{' || l[i]=='[')
                push(l[i]);
            else
            {
                if(top>-1)
                {
                    m = pop();
                    if(l[i]==')')
                    {
                        if(m=='(')
                            continue;
                        else
                        {
                            result = false;
                            break;
                        }
                    }
                    else if(l[i]=='}')
                    {
                        if(m=='{')
                            continue;
                        else
                        {
                            result = false;
                            break;
                        }
                    }
                    else if(l[i]==']')
                    {
                        if(m=='[')
                            continue;
                        else
                        {
                            result = false;
                            break;
                        }
                    }
                }
                else
                {
                    result = false;
                    break;
                }
            }
        }
        if(top==-1 && result==true)
            result = true;
        else
            result = false;
        return result;
    }
}