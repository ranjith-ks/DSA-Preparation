/*
You are given an integer array nums where the largest integer is unique.
Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise. 
*/

class Solution {
    public int dominantIndex(int[] nums) {
        int max,max2,maxIndex;
        if(nums[0]>nums[1]) {
            max = nums[0];
            max2 = nums[1];
            maxIndex = 0;
        }
        else {
            max = nums[1];
            max2 = nums[0];
            maxIndex = 1;
        }
        for(int i=2;i<nums.length;i++) {
            if(max<nums[i]) {
                max2 = max;
                max = nums[i];
                maxIndex = i;
            }
            else if(max2<nums[i])
                max2 = nums[i];
        }
        return max>=max2*2?maxIndex:-1;
    }
}