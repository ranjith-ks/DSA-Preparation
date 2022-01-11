/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {
            j = Math.abs(nums[i]) - 1;
            nums[j] *= nums[j]>0?-1:1;
        }
        for(i=0;i<n;i++)
            if(nums[i]>0)
                res.add(i+1);
        return res;
    }
}