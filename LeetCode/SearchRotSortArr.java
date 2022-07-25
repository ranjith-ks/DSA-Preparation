/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
    public int search(int[] nums, int target) {
        int s=0,n=nums.length,e=n-1,k;
        while(s<e) {
            int mid = (s+e)/2;
            if(nums[mid]>nums[e])
                s = mid+1;
            else
                e = mid;
        }
        k = s;
        s = 0;
        e = n-1;
        while(s<=e) {
            int mid = (s+e)/2;
            int rm = (mid+k)%n;
            if(nums[rm]==target)
                return rm;
            if(nums[rm]>target)
                e = mid-1;
            else
                s = mid+1;
        }
        return -1;
    }
}