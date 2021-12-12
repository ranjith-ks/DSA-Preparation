/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        int n=nums.length,left=0,right=n-1;
        res[0] = -1; res[1] = -1;
        boolean lMove=true, rMove=true;
        while(left<=right)
        {
            if(nums[left]==target)
            {
                res[0] = left;
                lMove = false;
            }
            if(nums[right]==target)
            {
                res[1] = right;
                rMove  = false;
            }
            if(lMove)
                left++;
            if(rMove)
                right--;
            if(!lMove && !rMove)
                break;
        }
        return res;
    }
}