/*
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length,lsum = 0,rsum = 0;
        for(int i:nums)
            rsum += i;
        for(int i=0;i<n;i++) {
            rsum -= nums[i];
            if(lsum==rsum)
                return i;
            lsum += nums[i];
        }
        return -1;
    }
}