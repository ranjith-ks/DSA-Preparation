/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int max = 0,sum=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i]==0?-1:1;
            if(hm.containsKey(sum))
                max = Math.max(max,i-hm.get(sum));
            else
                hm.put(sum,i);
        }
        return max;
    }
}