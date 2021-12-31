/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
*/

class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,ml=0,mr=0,res=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>=ml)
                    ml = height[l];
                else
                    res += ml - height[l];
                l++;
            }
            else
            {
                if(height[r]>=mr)
                    mr = height[r];
                else
                    res += mr - height[r];
                r--;
            }
        }
        return res;
    }
}