/*
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment or decrement an element of the array by 1.
Test cases are designed so that the answer will fit in a 32-bit integer.
*/

class Solution {
    public int minMoves2(int[] nums) {
        int i = 0, j = nums.length - 1,moves = 0;
        Arrays.sort(nums);
        while(i<j)
            moves += nums[j--] - nums[i++];
        return moves;
    }
}