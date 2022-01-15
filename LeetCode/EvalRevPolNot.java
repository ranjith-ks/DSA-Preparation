/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
Note that division between two integers should truncate toward zero.
It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int i,first,second,num;
        for(String t: tokens)
        {
            if(isOperation(t))
            {
                first = stk.pop();
                second = stk.pop();
                if(add(t))
                    stk.push(second+first);
                if(sub(t))
                    stk.push(second-first);
                if(mul(t))
                    stk.push(second*first);
                if(div(t))
                    stk.push(second/first);
            }
            else
            {
                num = Integer.parseInt(t);
                stk.push(num);
            }
        }
        return stk.pop();
    }
    public static boolean isOperation(String s)
    {
        return add(s) || sub(s) || mul(s) || div(s);
    }
    public static boolean add(String s)
    {
        return s.equals("+");
    }
    public static boolean sub(String s)
    {
        return s.equals("-");
    }
    public static boolean mul(String s)
    {
        return s.equals("*");
    }
    public static boolean div(String s)
    {
        return s.equals("/");
    }
}