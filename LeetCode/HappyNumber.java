/*
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/

class Solution {
    public boolean isHappy(int n) {
       Set<Integer> set = new HashSet<>(); 
       while(set.add(n))
       {
           if(n==1)
               return true;
           n = sumOfsq(n);
       }
        return false;
    }
    public int sumOfsq(int n)
    {
        int res=0,rem;
        while(n>0)
        {
            rem = n%10;
            res += rem*rem;
            n /= 10;
        }
        return res;
    }
}