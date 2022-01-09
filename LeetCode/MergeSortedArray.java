/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int e1 = m-1,e2 = n-1,l = m+n-1;
        while(e1>-1 && e2>-1)
        {
            nums1[l--] = nums1[e1]>nums2[e2]?nums1[e1--]:nums2[e2--];
        }
        while(e2>-1)
            nums1[l--] = nums2[e2--];
    }
}