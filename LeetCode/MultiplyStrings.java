/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int m = num1.length(),n = num2.length();
        int[] num = new int[m+n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                num[i+j] += (num1.charAt(m-i-1)-'0') * (num2.charAt(n-j-1)-'0');
        int carry = 0;
        for(int i=0;i<num.length;i++) {
            int sum = num[i] + carry;
            num[i] = sum%10;
            carry = sum/10;
        }
        StringBuilder sb = new StringBuilder();
        if(num[num.length-1]!=0)
            sb.append(num[num.length-1]);
        for(int i=num.length-2;i>-1;i--)
            sb.append(num[i]);
        return sb.toString();
    }
}