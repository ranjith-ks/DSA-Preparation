/*
Given a string s which represents an expression, evaluate this expression and return its value. 
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
*/

class Solution {
    public int calculate(String s) {
        int sum,temp,num;
        sum = num = temp = 0;
        char lastSign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + c - '0';
            if (i == s.length() - 1 || !Character.isDigit(c) && c!=' ') {
                switch(lastSign) {
                    case '+':
                        sum +=temp;
                        temp = num;
                        break;
                    case '-':
                        sum +=temp;
                        temp = -num;
                        break;
                    case '*':
                        temp *= num;
                        break;
                    case '/':
                        temp /= num;
                        break;
                }
                lastSign = c;
                num=0;
            }
        }
        sum +=temp;
        return sum;
      
    }
}