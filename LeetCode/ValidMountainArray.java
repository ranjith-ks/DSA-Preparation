/*
Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/

class Solution {
    public boolean validMountainArray(int[] arr) {
        int i,n=arr.length;
        if(n<3)
            return false;
        for(i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
                return false;
            else if(arr[i]<arr[i-1])
                break;
        }
        if(i==n || i==1)
            return false;
        for(;i<n-1;i++)
            if(arr[i]<=arr[i+1])
                return false;
        return true;
    }
}