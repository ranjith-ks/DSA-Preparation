/*
Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
0 <= i, j, k, l < n
nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
*/

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        for(int i:nums1)
        {
            for(int j:nums2)
                hm.put(i+j,hm.getOrDefault(i+j,0)+1);
        }
        for(int k:nums3)
        {
            for(int l:nums4)
                res += hm.getOrDefault(-(k+l),0);
        }
        return res;
    }
}