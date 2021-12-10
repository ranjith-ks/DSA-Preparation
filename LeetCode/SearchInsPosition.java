/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        return binSearch(nums,target,0,nums.length-1);
    }
    public int binSearch(int[] arr,int target,int start,int end)
    {
        int mid = start + (end-start)/2;
        if(start<=end)
        {
                if(arr[mid]>=target)
                    return binSearch(arr,target,start,mid-1);
                else
                    return binSearch(arr,target,mid+1,end);
        }

        return (start+(end-start)/2);
    }
}