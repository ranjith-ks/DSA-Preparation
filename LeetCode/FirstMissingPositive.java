/*
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        for(int n:nums)
        {
            if(n>i)
                return i;
            if(i==n)
                i++;
        }
        return i;
    }
}