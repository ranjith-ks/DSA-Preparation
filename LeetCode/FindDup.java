/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
*/

class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length>1)
        {
            int slow=nums[0],fast=nums[slow];
            while(slow!=fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while(fast!=slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }
}