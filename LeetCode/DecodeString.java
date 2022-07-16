/*
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.
*/

class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> count = new Stack<>();
        Stack<String> rstr = new Stack<>();
        int i = 0,n = s.length();
        while(i<n) {
            if(Character.isDigit(s.charAt(i))) {
                int num = 0;
                while(Character.isDigit(s.charAt(i))) {
                    num = num*10 + (s.charAt(i) - '0');
                    i++;
                }
                count.push(num);
            }
            else if(s.charAt(i)=='[') {
                rstr.push(res);
                res = "";
                i++;
            }
            else if(s.charAt(i)==']') {
                int times = count.pop();
                StringBuilder temp = new StringBuilder(rstr.pop());
                for(int x=0;x<times;x++)
                    temp.append(res);
                res = temp.toString();
                i++;
            }
            else
                res += s.charAt(i++);
        }
        return res;
    }
}