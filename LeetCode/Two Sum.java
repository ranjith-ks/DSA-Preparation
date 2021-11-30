/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int res[] = new int[2];
        boolean flag=true;
        for(i=0;i<nums.length;i++)
        {
            if(flag)
            {
                for(j=i+1;j<nums.length;j++)
                {
                    if(flag)
                    {
                        if(nums[i]+nums[j]==target)
                        {
                            res[0] = i;
                            res[1] = j;
                            flag = false;
                        }
                    }
                }
            }
        }

        return res;
    }
}
