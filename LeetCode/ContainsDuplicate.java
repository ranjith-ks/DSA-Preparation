/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i,n=nums.length;
        for(i=0;i<n;i++)
            if(!set.add(nums[i]))
                return true;
        return false;
    }
}