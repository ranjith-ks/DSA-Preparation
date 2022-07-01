/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation. 
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int cur = 1;
        Arrays.fill(res,1);
        for(int i=0;i<nums.length;i++) {
            res[i] *= cur;
            cur *= nums[i];
        }
        cur = 1;
        for(int i=nums.length-1;i>-1;i--) {
            res[i] *= cur;
            cur *= nums[i];
        }
        return res;
    }
}