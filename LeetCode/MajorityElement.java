package LeetCode;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/
/*
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],1);
            else
            {
                int r = hm.get(nums[i]);
                if(r+1==(n/2)+1)
                    return nums[i];
                hm.put(nums[i],r+1);
            }
        }
        return nums[0];
    }
}
*/

class Solution {
    public int majorityElement(int[] nums) {
        int major=nums[0],count=0;
        for(int i:nums)
        {
            if(count==0)
            {
                major=i;
                count++;
            }
            else if(i==major)
                count++;
            else
                count--;
        }
        return major;
    }
}