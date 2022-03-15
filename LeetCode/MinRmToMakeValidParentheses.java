/*
Given a string s of '(' , ')' and lowercase English characters.
Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
Formally, a parentheses string is valid if and only if:
It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
*/

/*
class Solution {
    public String minRemoveToMakeValid(String s) {
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        int bracket = 0,n = s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c==')')
            {
                if(bracket>0)
                {
                    bracket--;
                    l1.add(c);
                }
            }
            else
            {
                if(c=='(')
                    bracket++;
                l1.add(c);
            }
        }
        n = l1.size();
        bracket=0;
        for(int i=n-1;i>-1;i--)
        {
            if(l1.get(i)=='(')
            {
                if(bracket>0)
                {
                    bracket--;
                    l2.add(l1.get(i));
                }
            }
            else
            {
                if(l1.get(i)==')')
                    bracket++;
                l2.add(l1.get(i));
            }
        }
        Collections.reverse(l2);
        String res = l2.stream().map(Object::toString)
                        .collect(Collectors.joining(""));
        return res;
    }
}
*/

class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        int bracket=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]=='(')
                bracket++;
            else if(a[i]==')')
            {
                if(bracket==0)
                    a[i] = '#';
                else
                    bracket--;
            }
        }
        for(int i=n-1;i>-1;i--)
        {
            if(a[i]=='(' && bracket>0)
            {
                bracket--;
                a[i] = '#';
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c: a)
            if(c!='#')
                res.append(c);
        return res.toString();
    }
}