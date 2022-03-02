/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

class Solution {
    public int mem[] = new int[50];
    public int climbStairs(int n) {
        if(n<4) return n;
        if(mem[n]>0) return mem[n];
        int x = climbStairs(n-1) + climbStairs(n-2);
        mem[n] = x;
        return x;
    }
}