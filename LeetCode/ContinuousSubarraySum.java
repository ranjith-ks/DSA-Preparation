/*
Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
*/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(k!=0)
                sum %= k;
            if(hm.containsKey(sum)) {
                if(i-hm.get(sum)>1)
                    return true;
            }
            else
                hm.put(sum,i);
            System.out.println(sum+" "+hm.get(sum));
        }
        return false;
    }
}