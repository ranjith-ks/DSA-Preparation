/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i,n=nums.length,index;
        for(i=0;i<n;i++)
        {
            index = Math.abs(nums[i])-1;
            if(nums[index]<0)
                res.add(Math.abs(index+1));
            else
                nums[index] *= -1;
        }
        return res;
    }
}