/*
Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
*/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int n = pushed.length,i,j=0;
        for(i=0;i<n;i++)
        {
            stk.push(pushed[i]);
            while(!stk.empty() && stk.peek()==popped[j])
            {
                stk.pop();
                j++;
            }
        }

        return stk.empty();
    }
}