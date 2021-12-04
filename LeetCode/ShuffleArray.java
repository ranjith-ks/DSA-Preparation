/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size,i,j=0;
        size = nums.length;
        int res[] = new int[size];
        for(i=0;i<n;i++)
        {
            res[j++] = nums[i];
            res[j++] = nums[n+i];
        }

        return res;
    }
}