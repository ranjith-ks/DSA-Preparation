/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i,t,j=nums.length-1;
        for(i=0;i<j;i++)
        {
            t = nums[i];
            if(t%2==1)
            {
                while(nums[j]%2==1 && i<j)
                    j--;
                nums[i] = nums[j];
                nums[j] = t;
                j--;
            }
        }
        return nums;
    }
}