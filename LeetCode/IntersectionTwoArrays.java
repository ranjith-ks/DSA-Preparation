/* 
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> l = new HashSet<>();
        for(int i:nums1)
            s.add(i);
        for(int i:nums2)
            if(s.contains(i))
                l.add(i);
        int[] res = new int[l.size()];
        int j=0;
        for(int i:l)
            res[j++] = i;
        return res;
    }
}