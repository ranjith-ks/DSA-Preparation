/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
*/

class Solution {
    public HashMap<Integer,Integer> hm = new HashMap<>();
    public int fib(int n) {
        if(n==0)
        {
            hm.put(n,0);
            return 0;
        }
        if(n==1)
        {
            hm.put(n,1);
            return 1;
        }
        if(hm.containsKey(n))
            return hm.get(n);
        int x = fib(n-1) + fib(n-2);
        hm.put(n,x);
        return x;
    }
}