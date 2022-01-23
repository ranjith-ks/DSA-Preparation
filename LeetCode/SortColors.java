/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
*/

class Solution {
    public void sortColors(int[] nums) {
        int zero=-1,one=-1,two=-1,n=nums.length,i;
        for(i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                nums[++two] = 2;
                nums[++one] = 1;
                nums[++zero] = 0;
            }
            else if(nums[i]==1)
            {
                nums[++two] = 2;
                nums[++one] = 1;
            }
            else if(nums[i]==2)
                nums[++two] = 2;
        }
    }
}