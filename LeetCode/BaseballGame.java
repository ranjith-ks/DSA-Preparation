/*
You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record.
*/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<>();
        for(String s: ops)
        {
            if(isInvalid(s))
                stk.pop();
            else if(isToDouble(s))
            {
                int top = stk.peek();
                stk.push(top*2);
            }
            else if(isToAdd(s))
            {
                int top = stk.pop();
                int down = stk.pop();
                stk.push(down);
                stk.push(top);
                stk.push(top+down);
            }
            else
            {
                int a = Integer.valueOf(s);
                stk.push(a);
            }
        }
        int res = 0;
        while(!stk.empty())
            res += stk.pop();
        return res;
    }
    private boolean isInvalid(String s)
    {
        return s.charAt(0)=='C';
    }
    private boolean isToDouble(String s)
    {
        return s.charAt(0)=='D';
    }
    private boolean isToAdd(String s)
    {
        return s.charAt(0)=='+';
    }
}