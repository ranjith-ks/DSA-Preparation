/*
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int i,n=temperatures.length;
        int res[] = new int[n];
        for(i=0;i<n;i++)
        {
            while(!stk.empty()&&temperatures[i]>temperatures[stk.peek()])
            {
                int j = stk.pop();
                res[j] = i - j;
            }
            stk.push(i);
        }
        return res;
    }
}