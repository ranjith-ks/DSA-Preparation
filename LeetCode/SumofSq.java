/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
*/

class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0,right = (int)Math.sqrt(c);
        double sum;
        while(left<=right)
        {
            sum = Math.pow(left,2) + Math.pow(right,2);
            if(sum<c)
                left++;
            else if(sum>c)
                right--;
            else
                return true;
        }

        return false;
    }
}