/*
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
A subarray is a contiguous subsequence of the array.
*/

class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1, res = Integer.MIN_VALUE;
        for(int i:nums) {
            prod *= i;
            res = Math.max(res,prod);
            prod = prod==0?1:prod;
        }
        prod = 1;
        for(int i=nums.length-1;i>-1;i--) {
            prod *= nums[i];
            res = Math.max(res,prod);
            prod = prod==0?1:prod;
        }
        return res;
    }
}