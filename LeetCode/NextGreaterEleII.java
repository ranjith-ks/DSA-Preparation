/*
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
*/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int i,n=nums.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(i=n-1;i>-1;i--)
            stk.push(nums[i]);
        for(i=n-1;i>-1;i--)
        {
            while(!stk.empty() && stk.peek()<=nums[i])
                stk.pop();
            res[i] = stk.empty()?-1:stk.peek();
            stk.push(nums[i]);
        }
        return res;
    }
}